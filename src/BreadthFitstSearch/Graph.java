package BreadthFitstSearch;

import BreadthFitstSearch.Node;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
     matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);

    }

    public void addEdge(int source, int dest){
        matrix[source][dest] = 1;

    }

    public boolean checkEdge(int source, int dest){

        if (matrix[source][dest] == 1){
            return true;
        }else {
            return false;
        }

    }

    public void print(){

        System.out.print("  ");

        for(Node node : nodes){
            System.out.print(node.data + " ");
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length]; // Array to store whether each node is visited. Node is identified by the index
//        for (boolean each : visited){
//            System.out.println(each);} // false false false false false
//        System.out.println(matrix.length); => 5
        dFSHelper(src, visited);

    }

    private void dFSHelper(int src, boolean[] visited) {

        // Check if the passed node is a visited node. Starting from the given starting point

        if (visited[src]){
            return;
        }else {
            // else we mark that node as visited
            visited[src] = true;
            System.out.println(nodes.get(src).data + "Visited");
        }

        // Looping through a row

        for (int i = 0; i < matrix[src].length; i++){
            if (matrix[src][i] == 1){
                dFSHelper(i, visited);

                // Going in each row, we find "1", that column is related with the row hence we go to that column's row.


            }
        }
        return;
    }


}
