package datastructureAndALGORITHM.GraphCNC;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int v1;
    int v2;
    int weight;
    Edge(int v1, int v2, int weight){
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}

public class Graph_2 {
    //MST in three step:
    //            1.take input(E).
    //            2.sort all edges[E*log(E)].
    //            3.pick n-1 safe edges(cycle detection) & add in mst == [union find ~ E*V].
    //TOTAL TIME COMPLEXITY:  [ E*logE + E*V ] not realy good
    //But we can improve union find algo. called -> (union find with rank path comparission)[logV].


    //MST: Minimum spanning tree
    //     In N vertices, total edges should be N-1,
    //     graph should be connected but not cyclic.
    //Kruskal algo:
    //     Sort the all edges in ascending order.
    //     And choose edges according to minimum weighted edges(in increasing order).
    //UFA: ----------------------------- for cycle detection
    //     choose those edges which has two vertices belongs to different components(choose using hasPath).
    //     and time complexity of hasPath is E==V^2 that's why we should use 'union find algo.'
    private static int findParent(int v, int[] parent) {
        if (v == parent[v]){
            return v;
        }

        return findParent(parent[v], parent);
    }

    public static Edge[] KruskalAlgorithm(Edge[] edges, int n){
        Arrays.sort(edges);

        Edge[] mst = new Edge[n-1];
        int[] Parent = new int[n];
        for (int j=0; j<n; j++){
            Parent[j] = j;
        }

        int count = 0, i = 0;

        while (count != n-1){
            Edge currentEdge = edges[i++];
            // Now union find alogorithm
            int v1Parent = findParent(currentEdge.v1, Parent);
            int v2Parent = findParent(currentEdge.v2, Parent);
            if (v1Parent != v2Parent){
                //including current edge
                mst[count] = currentEdge;
                count++;
                //now updating parents
                Parent[v1Parent] = v2Parent;
            }

        }
        return mst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        Edge[] edges = new Edge[e];
        for (int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();

            Edge edge = new Edge(v1, v2, weight);
            edges[i] = edge;
        }

        Edge[] mst = KruskalAlgorithm(edges, n);

        for (int i=0; i< mst.length; i++){
            if (mst[i].v1<mst[i].v2){
                System.out.println(mst[i].v1+" "+mst[i].v2+" "+mst[i].weight);
            }else {
                System.out.println(mst[i].v2+" "+mst[i].v1+" "+mst[i].weight);
            }
        }
    }


}
