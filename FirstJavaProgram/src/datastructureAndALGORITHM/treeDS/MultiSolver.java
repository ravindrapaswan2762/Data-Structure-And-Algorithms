package datastructureAndALGORITHM.treeDS;

import java.util.ArrayList;
import java.util.Stack;

public class MultiSolver {
    public static void main(String[] args) {


        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1,
                120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};


        Stack<Node> st = new Stack<>();

        Node root = null;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == -1){
                st.pop();
            }
            else {
                Node temp = new Node();
                temp.data = arr[i];

                if (st.size()>0){
//                  stack me jo top pe hai, uske children me add karlo, lisko?, temp ko.
                    st.peek().children.add(temp);
                }
                else {
                    root = temp;
                }
                st.push(temp);
            }
        }
//      -----------------------
        MultiSolver obj = new MultiSolver();

//        size = 0;
//        min = Integer.MAX_VALUE;
//        max = Integer.MIN_VALUE;
//        height = 0;

//        obj.travelANDchange(root, 0);
//        System.out.println("size = "+size);
//        System.out.println("min = "+min);
//        System.out.println("max = "+max);
//        System.out.println("height = "+height);
//        ------------
//        obj.predecessorandSuccessor(root, 90);
//        System.out.println("predecessor = "+predecessor.data);
//        System.out.println("Successor = "+successor.data);
//        ------------

//        ceil = Integer.MAX_VALUE;
//        floor = Integer.MIN_VALUE;
//
//        obj.ceil_and_Floor(root, 95);
//
//        System.out.println("ceil = "+ceil);
//        System.out.println("floor = "+floor);
//        --------------
//        obj.kth_largest(root, 1);
//        --------------------
//        obj.largestSum0f_subTreee(root);
//        System.out.println("subTreeNODE-> "+node0fMaxtSum+", maxSum0fSubTree-> "+maxSum);
//        ---------------------
        obj.calculateDiaReturnHieght(root);
        System.out.println(dia);



    }
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        Node(int data){
            this.data = data;
        }
        Node(){

        }
    }

    //  ----------------------------------------------------
    static int size;
    static int min;
    static int max;
    static int height;
    public static void travelANDchange(Node node, int depth){
        size++;
        min = Math.min(min, node.data);
        max = Math.max(max, node.data);
        height = Math.max(height, depth);

        for (Node child : node.children){
            travelANDchange(child, depth+1);
        }
    }
//  -----------------------------------------------------------
    static Node predecessor;
    static Node successor;
    static int state;
    public static void predecessorandSuccessor(Node node, int data){
        if (state == 0){
            if (node.data == data){
                state = 1;
            }
            else {
                predecessor = node;
            }
        }
        else if (state == 1){
            successor = node;
            state = 2;
        }
        for (Node child : node.children){
            predecessorandSuccessor(child, data);
        }
    }
//  ----------------------------------------------------------
//  ceil = top, floor = bottom
    static int ceil;
    static int floor;
    public static void ceil_and_Floor(Node node, int data){
        if (node.data>data){
            if (node.data<ceil){
                ceil = node.data;
            }
        }

        if (node.data<data){
            if (node.data>floor){
                floor = node.data;
            }
        }

        for (Node child : node.children){
            ceil_and_Floor(child, data);
        }
    }
//  ------------------------------------------------------------
    public static int kth_largest(Node node, int kth){
    floor = Integer.MIN_VALUE;
    int factor = Integer.MAX_VALUE;

    for (int i=0; i<kth; i++){
//             infinity se compare karke floor me maximum value set kar dega.
               ceil_and_Floor(node, factor);

               factor = floor;

               floor = Integer.MIN_VALUE;
    }
    System.out.println(factor);
    return factor;
}
//  ------------------------------------------------------------
//  return kuchh aur ho raha hai, aur calculate kuchh aur ho raha hai.
    public static int node0fMaxtSum = 0;
    public static int maxSum = Integer.MIN_VALUE;
    public static int largestSum0f_subTreee(Node node){

        int sum = 0;
        for (Node child : node.children){
            int cSUM = largestSum0f_subTreee(child);
            sum += cSUM;
        }
        sum = node.data;

        if (sum>maxSum){
            maxSum = sum;
            node0fMaxtSum = node.data;
        }
        return sum;
    }
//  -----------------------------------------------------------
//  calculate diameter, like maximum edges between two nodes.
    private static int dia = 0;
    public static int calculateDiaReturnHieght(Node node){
//      ch = child height
//      dch = deepest child height
//      sdch = second deepest child height

        int dch = -1;
        int sdch = -1;
        for (Node child : node.children){
            int ch = calculateDiaReturnHieght(child);
            if (ch>dch){
                sdch = dch;
                dch = ch;
            }
            else if (ch>sdch){
                sdch = ch;
            }
        }

        int candidate = dch + sdch + 2;
        if (candidate>dia){
            dia = candidate;
        }
        dch += 1;
        return dch;
    }








}
