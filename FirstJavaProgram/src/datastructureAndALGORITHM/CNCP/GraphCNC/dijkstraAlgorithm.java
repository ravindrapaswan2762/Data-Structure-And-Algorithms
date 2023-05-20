package datastructureAndALGORITHM.GraphCNC;

import java.util.Scanner;

public class dijkstraAlgorithm {

    private static int findMinDistacedVertex(boolean[] visited, int[] distance) {
        int minDistancedVertex = -1;
        for (int i=0; i<visited.length; i++){
            if (!visited[i] && (minDistancedVertex==-1 || distance[i]<distance[minDistancedVertex])){
                minDistancedVertex = i;
            }
        }
        return minDistancedVertex;
    }

    public static void dijkstraAlgo(int[][] adjMatrix){
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        distance[0] = 0;
        for (int i=1; i<n; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i=0; i<n; i++){
            int minDistacedVertex = findMinDistacedVertex(visited, distance);
            visited[minDistacedVertex] = true;
            for (int j=0; j<n; j++){
                //                              for positive
                if (adjMatrix[minDistacedVertex][j]>0 && adjMatrix[minDistacedVertex][j]<Integer.MAX_VALUE && !visited[j]){
                    // j is unvisited neighbour of minDistacedVertex.
                    // calculate distance to reach j from source via minDistacedVertex.
                    int newDistance = distance[minDistacedVertex] + adjMatrix[minDistacedVertex][j];//total dis==till dis + edge value
                    if (newDistance<distance[j]){
                        distance[j] = newDistance;
                    }
                }
            }
        }
        // print distance value from all vertex
        for (int i=0; i<n; i++){
            System.out.println(i+" "+distance[i]);
        }
    }

    public static void main(String[] args) {
        //dijkstraAlgorithm: finding the shortest path from source-vertex to all other vertex.
        //Time complexity: in dijkstraAlgo --> v + v(2*v) == v^2

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
        dijkstraAlgo(adjMatrix);


    }
}
