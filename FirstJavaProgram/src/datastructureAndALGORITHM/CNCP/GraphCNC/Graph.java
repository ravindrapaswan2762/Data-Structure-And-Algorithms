package datastructureAndALGORITHM.GraphCNC;

import java.util.*;

public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of vertices
        int e = sc.nextInt(); // number of edges
        int[][] adjMatrix = new int[n][n];

        for (int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        int source = sc.nextInt();
        int des = sc.nextInt();
        boolean[] visited = new boolean[adjMatrix.length];
        ArrayList<Integer> path = getPathBFS(adjMatrix, source, des, visited);
        for (int v: path){
            System.out.print(v+" ");
        }
    }
    //-------------------------------------------------deftFirstTravel==prerder travel
    public static void deftFirstTravel(int[][] adjMatrix, int currVertx, boolean[] visited){
        visited[currVertx] = true;
        System.out.print(currVertx+" ");

        for (int i=0; i< adjMatrix.length; i++){
            if (adjMatrix[currVertx][i]==1 && visited[i]==false){
                deftFirstTravel(adjMatrix, i, visited);
            }
        }
    }
    public static void deftFirstTravel(int[][] adjMatrix){
        boolean[] visited = new boolean[adjMatrix.length];
        deftFirstTravel(adjMatrix, 0, visited);
    }
    //------------------------------------------------breathFirstTravel==levelorder travel  or distance wise travelling
    public static void breathFirstTravel(int[][] adjMatrix){
        Queue<Integer> pendingVertices = new LinkedList<>();
        boolean[] visited = new boolean[adjMatrix.length];
        pendingVertices.add(0);
        visited[0] = true;

        while (! pendingVertices.isEmpty()){
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex+" ");
            for (int i=0; i< adjMatrix.length; i++){
                if (adjMatrix[currentVertex][i]==1 && !visited[i]){
                    // i is unvisited nighbour of current vertex.
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    //------------------------------------------------- DFS/BFS for disconnected graph
    public static void dfs(int[][] adjMatrix, int currVertx, boolean[] visited){
        visited[currVertx] = true;
        System.out.print(currVertx+" ");

        for (int i=0; i< adjMatrix.length; i++){
            if (adjMatrix[currVertx][i]==1 && visited[i]==false){
                dfs(adjMatrix, i, visited);
            }
        }
    }
    public static void dfs(int[][] adjMatrix){
        boolean[] visited = new boolean[adjMatrix.length];
        for (int i=0; i<adjMatrix.length; i++){
            if (!visited[i]){
                dfs(adjMatrix, i, visited);
                System.out.println();
            }
        }
    }
    //------------------------------------------------- Has Path
    public static boolean hasPath(int[][] adjMatrix,int V1, int V2,boolean visited[]){
        if(adjMatrix[V1][V2]==1){
            return true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(V1);
        visited[V1]=true;

        while(!q.isEmpty()){
            int n = q.poll();
            for(int i=0; i<adjMatrix.length; i++)
            {
                if(adjMatrix[n][i]==1 && !visited[i])
                {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        if(visited[V2]==true)
            return true;
        else
            return false;
    }
    //------------------------------------------------- Get Path
    public static ArrayList<Integer> getPathDFS(int[][] adjMatrix, int v1, int v2, boolean[] visited){
        if(v1==v2){
            ArrayList<Integer> ans = new ArrayList<>();
            visited[v1] = true;
            ans.add(v1);
            return ans;
        }

        visited[v1] = true;

        for (int i=0; i<adjMatrix.length; i++){
            if(adjMatrix[v1][i]==1 && !visited[i])
            {
                ArrayList<Integer> arr = getPathDFS(adjMatrix,i ,v2, visited);
                if(arr!=null)
                {
                    arr.add(v1);
                    return arr;
                }
            }
        }
        return null;
    }
    public static ArrayList<Integer> getPathBFS(int[][] adjMatrix, int s, int d, boolean[] visited){

        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        q.add(s);
        visited[s] = true;
        map.put(s, -1);

        boolean isPathFound = false;

        while (!q.isEmpty()){
            int x = q.poll();
            for (int i=0; i<adjMatrix.length; i++){
                if (adjMatrix[x][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                    map.put(i, x);

                    if (i==d){
                        // path found
                        isPathFound = true;
                        break;
                    }
                }
            }

        }
        if (isPathFound){
            ArrayList<Integer> path = new ArrayList<>();
            int currVertex = d;
            while (currVertex != -1){
                path.add(currVertex);
                int parent = map.get(currVertex);
                currVertex = parent;
            }
            return path;
        }else {
            return null;
        }

    }
    //------------------------------------------------ isConnected
    public static boolean isConnected(int[][] adjMatrix, int currVertex, boolean[] visited){
        if(adjMatrix.length==0){
            return true;
        }
        visited[currVertex] = true;

        for(int i=0; i<adjMatrix.length; i++){
            if(adjMatrix[currVertex][i]==1 && !visited[i]){
                isConnected(adjMatrix, i, visited);
            }
        }
        //-------------------------
        boolean ans = true;
        for(int i=0; i<visited.length; i++){
            ans  = ans && visited[i];
        }
        return ans;
    }
    //------------------------------------------------- search word
    public static boolean dfs(char[][] adjMatrix, int i, int j, int count, String word){
        if(count == word.length()){
            return true;
        }

        if(i==-1 || i==adjMatrix.length || j==-1 || j==adjMatrix[0].length || adjMatrix[i][j] != word.charAt(count)){
            return false;
        }

        char temp = adjMatrix[i][j];
        adjMatrix[i][j] = '*';
        count++;

        boolean found = dfs(adjMatrix, i+1, j, count, word)||
                dfs(adjMatrix, i-1, j, count, word)||
                dfs(adjMatrix, i, j+1, count, word)||
                dfs(adjMatrix, i, j-1, count, word)||
                dfs(adjMatrix, i-1, j-1, count, word)||
                dfs(adjMatrix, i+1, j+1, count, word)||
                dfs(adjMatrix, i-1, j+1, count, word)||
                dfs(adjMatrix, i+1, j-1, count, word);

        adjMatrix[i][j] = temp;
        return found;
    }
    int solve(String[] Graph , int N, int M) {
        // creating grapgh................
        char[][] adjMatrix = new char[N][M];
        String word = "CODINGNINJA";

        for(int i=0; i<N; i++) {
            String s = Graph[i];
            for(int j=0; j<M; j++){
                adjMatrix[i][j] = s.charAt(j);
            }
        }
        //searching first character.........
        for(int i=0; i<N; i++) {

            for(int j=0; j<M; j++){
                if(adjMatrix[i][j]==word.charAt(0) ){
                    boolean is = dfs(adjMatrix, i, j, 0, word);
                    if(is){
                        return 1;
                    }
                }
            }
        }
        return 0;

    }

}
