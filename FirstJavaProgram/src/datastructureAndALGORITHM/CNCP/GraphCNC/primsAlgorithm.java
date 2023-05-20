package datastructureAndALGORITHM.GraphCNC;

import java.util.Scanner;

public class primsAlgorithm {

    private static int findMinWeightedVertex(boolean[] visited, int[] weight) {
        int minWeightedVertex = -1;
        for (int i=0; i<visited.length; i++){
            if (!visited[i] && (minWeightedVertex==-1 || weight[i]<weight[minWeightedVertex]) ){
                minWeightedVertex = i;
            }
        }
        return minWeightedVertex;
    }

    public static void prims(int[][] adjMatrix){
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        int[] weight = new int[n];
        //source - vertex 0
        parent[0] = -1;
        weight[0] = 0;
        //rest vertex-weight
        for (int i=1; i<n; i++){
            weight[i] = Integer.MAX_VALUE;
        }

        for (int i=0; i<n; i++){
            int minWeightedVertex = findMinWeightedVertex(visited, weight);
            visited[minWeightedVertex] = true;
            //Explore neighbours of minWeightedVertex.
            for (int j=0; j<n; j++){
                if (adjMatrix[minWeightedVertex][j] != 0 && !visited[j]){
                    if (weight[j] > adjMatrix[minWeightedVertex][j]){
                        //update value
                        weight[j] = adjMatrix[minWeightedVertex][j];
                        parent[j] = minWeightedVertex;
                    }
                }
            }
        }
        //printing------------
        for (int i=1; i<n; i++){
            if (i<parent[i]){
                System.out.println(i+" "+parent[i]+" "+weight[i]);
            }else {
                System.out.println(parent[i]+" "+i+" "+weight[i]);
            }
        }
    }

    public static void main(String[] args) {
        //it has similar work like kruskal algorithm, but logic is different.
        //it is also used for MST.
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        int[][] adjMatrix = new int[v][v];
        for (int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();

            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
        }
        prims(adjMatrix);

    }
}
