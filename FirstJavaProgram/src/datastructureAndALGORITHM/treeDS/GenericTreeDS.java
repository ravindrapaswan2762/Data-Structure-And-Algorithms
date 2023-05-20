package datastructureAndALGORITHM.treeDS;

import java.util.*;

class TreeDataStructure {

    public static void main(String[] args) {
//      PARENT - ..........
//      CHILD - ...........
//      ANCESTOR - tree me LEAF se ROOT tak jane wali raste me jo jo nodes milte hain.
//      DESCENDANT - tree me ROOT se LEAF tak jane wali raste me jo jo nodes milte hain.
//      ROOT - FIRST OR TOP NODE

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1,
                                       120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

//                                       10
//                   INPUT :         /   |   \
//                                  /    |    \
//                                 /     |     \
//                                /      |      \
//                               20     30       40
//                              /  \   / | \      |
//                             50  60 70 80 90    100
//                                      /  \
//                                     110 120
//
//      CREATING BASE PROGRAM OF TREE DATA STRUCTURE.

//      creating stack memory of nodes
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
//                  stack me jo top pe hai, uske children me add karlo, kisko?, temp ko.
                    st.peek().children.add(temp);
                }
                else {
                    root = temp;
                }
                st.push(temp);
            }
        }
//      -------------------------
        treeClass obj = new treeClass();

       obj.level0rder(root);



    }

//  ----------------------------------------------------
    private static class Node{
        int data;

        ArrayList<Node> children = new ArrayList<>();

        Node(int data){
            this.data = data;
        }
        Node(){

        }
    }
//  ---------------------------------------------------
    public static class treeClass{
//  d(10) -> 10 wil print itself and its family.
//  d(20), d(30), d(40) will print themself and there family.
//  d(10) = s(10)+ d(20) + d(30) + d(40),    d=display, s=self
        public static void display(Node node){
            String str = node.data + " -> ";
//      --------------------------------- printing root and its children
            for (Node child : node.children){
                str += child.data + ", ";
            }
            str += ".";
            System.out.println(str);
//      --------------------------------- printing [root-children] and its own children.
//          simply calling children again 20, 30, 40.
            for (Node child : node.children){
                display(child);
            }
        }
        public static int size(Node node){
            int s = 0;
            for (Node child : node.children){
                int cs = size(child);
                s = s + cs;
            }
            s = s + 1;

            return s;
        }
        public static int maxValue(Node node){
            int max = Integer.MIN_VALUE;

            for (Node child0F : node.children){
                int cm = maxValue(child0F);

//              niche jaate time jo initilise hua tha usko uper jaate time
//              update karte jayega.
                max = Math.max(cm, max);
            }
            max = Math.max(node.data, max);

            return max;
        }
        public static int height(Node node){
//          for initial size according to adges
            int ht = -1;

            for (Node child0F : node.children){

//              child node wapas apna value ko yahan pe llaya
                int cHeight = height(child0F);

//              aur, child value aur uske uper,parent value ka copmpare.
                ht = Math.max(cHeight, ht);

            }
            ht += 1;

            return ht;
        }
        public static void heightOfBinaryTree(Node node){
//            if (node==null){
//                return -1;
//            }
//            int lh = heightOfBinaryTree(node.left);
//            int lh = heightOfBinaryTree(node.right);

//            return Math.max(lh, rh) + 1;
    }
        public static void traversals(Node node){
//                                     10
//                      Pre Edge-->  /  |  \ <-- Post Edge
//                                  /   |   \
//                     Pre Node--> 20   30   40 <--Post Node
//                                      |
//                                      50
            System.out.println("Node Pre "+node.data);
            for (Node child : node.children){
                System.out.println("Edge Pre "+node.data+"--"+child.data);
                traversals(child);
                System.out.println("Edge Post "+node.data+"--"+child.data);
            }
            System.out.println("Node Post "+node.data);

        }
        public static void level0rder(Node node){
//          RPA method - Remove Print then Add childrens.
            Queue<Node> q = new ArrayDeque<>();
            q.add(node);

            while (q.size()>0){
//              always removing first Addind last and in qeue.
                node = q.remove();
                System.out.print(node.data+" ");

                for (Node child : node.children){
                    q.add(child);
                }
            }

        }

        public static void level0rderingLineWise(Node node){
//          RPA - "REMOVE PRINT ADD" CONCEPT IN QEUE FOR level ordering printing
//          mq = main queue,  cq = child queue

            Queue<Node> mq = new ArrayDeque<>();
            mq.add(node);

            Queue<Node> cq = new ArrayDeque<>();
            while (mq.size()>0){

                node = mq.remove();

                System.out.println(node.data+" ");

                for (Node child0F : node.children){
                    cq.add(child0F);
                }

                if (mq.size() == 0){
                    mq = cq;
                    cq = new ArrayDeque<>();
                    System.out.println();
                }

            }

        }
        public static void level0rderingLineWise_2(Node node){

            Queue<Node> mq = new ArrayDeque<>();
            mq.add(node);
            mq.add(new Node(-1));

            while (mq.size()>0){
                mq.remove();

                if (node.data != -1){

                    System.out.print(node.data+" ");
                    for (Node child : node.children){
                        mq.add(child);
                    }
                }
                else {
                    if (mq.size()>0){
                        mq.add(new Node(-1));
                        System.out.println();
                    }
                }
            }

        }
        public static void level0rderingLineWise_3(Node node){

            Queue<Node> mq = new ArrayDeque<>();
            mq.add(node);

            while (mq.size()>0){
                int cicl = mq.size();

                for (int i=0; i<cicl; i++){
                    node = mq.remove();
                    System.out.print(node.data+" ");

                    for (Node child : node.children){
                        mq.add(child);
                    }
                }
                System.out.println();
            }
    }

        private static class pair{
            Node node;
            int level;
            pair(Node node, int level){
                this.node = node;
                this.level = level;
            }
        }
        public static void level0rderingLineWise_4(Node node){
            Queue<pair> mq = new ArrayDeque<>();
            mq.add(new pair(node, 1));

            int level = 1;
            while (mq.size()>0){
                pair p = mq.remove();
                if (p.level>level){
                    level = p.level;
                    System.out.println();
                }
                System.out.print(p.node.data+" ");

                for (Node child : p.node.children){
                    pair cp = new pair(child, p.level+1);
                    mq.add(cp);
                }
            }
        }

        public static void level0rderingLineWise_ZigZag(Node node){
//       RPA METHOD
//           INPUT :           ---->    10  --->
//                                   /  |  \                ZIG-ZAG
//                                  /   |   \
//                        <----    20   30   40 <----
//                                      |
//                              ---->   50  ---->
//           OUTPUT :
//                  10
//                  40, 30, 20
//                  50

            Stack<Node> ms = new Stack<>();
            ms.push(node);

            Stack<Node> cs = new Stack<>();
            int level = 1;

            while (ms.size()>0){
                node = ms.pop();
                System.out.print(node.data+" ");

                if (level%2==1){
//                  (1, 3) means, odd level pe -> reft to right ja rahe the.
//                   jis direction se jaa rahe the usi direction ke according stack
//                   me node ke child ko add karna hai.
                    for (int i=0; i<node.children.size(); i++){
                        Node child = node.children.get(i);
                        cs.push(child);
                    }
                }
                else {
//                  (2, 4) means, even level pe -> right to left ja rahe the.
                    for (int i=node.children.size()-1; i>=0; i--){
                        Node child = node.children.get(i);
                        cs.push(child);
                    }
                }
                if (ms.size() == 0){
                    ms = cs;
                    cs = new Stack<>();
                    level++;
                    System.out.println();
                }
            }
        }

        public static void mirro0rdering(Node node){

            for (Node child : node.children){
                mirro0rdering(child);
                System.out.println(child.data+" ");
            }
            Collections.reverse(node.children);
        }

        public static void removeLeaves(Node node){
            for (int i=node.children.size()-1; i>=0; i--){
                Node child = node.children.get(i);
                if (child.children.size() == 0){
                    node.children.remove(child);
                }
            }
            for (Node child : node.children){
                removeLeaves(child);
            }

        }

        public static void lenearizeTree(Node node){
            for (Node child : node.children){
                lenearizeTree(child);
            }

            while (node.children.size()>1){
                Node lastChild = node.children.remove(node.children.size()-1);
                Node sS_child = node.children.get(node.children.size()-1);

                Node sS_tail = getTAIL(sS_child);

                sS_tail.children.add(lastChild);
            }
        }
        private static Node getTAIL(Node node){
            while (node.children.size() == 1){
                node = node.children.get(0);
            }
            return node;
        }

        public static Node lenearizeTree_2(Node node){
            if (node.children.size()==0){
                return node;
            }
            Node last_K_tail  = lenearizeTree_2(node.children.get(node.children.size()-1));
             while (node.children.size()>1){
                 Node last = node.children.remove(node.children.size()-1);
                 Node s_last = node.children.get(node.children.size()-1);

                 Node s_last_K_tail = lenearizeTree_2(s_last);

                 s_last_K_tail.children.add(last);
             }
             return last_K_tail;
        }

        public static boolean findValue(Node node, int data){
            if (node.data == data){
                return true;
            }
            for (Node child : node.children){

                boolean fic = findValue(child, data);

//              agar data mil gaya to bina next child ko call kiye, sidha root ki taraf
//              data lekar jayega.
                if (fic){
                    return true;
                }
            }
            return false;
        }

        public static ArrayList<Integer> nodeToRootPath(Node node, int data){
            if (node.data == data){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(node.data);
                return list;
            }
            for (Node child : node.children){
                ArrayList<Integer> path_till_child = nodeToRootPath(child, data);

                if (path_till_child.size()>0){
                    path_till_child.add(node.data);
                    return path_till_child;
                }
            }
            return new ArrayList<>();
        }

        public static int nearestCommonAncestor0fnode(Node node, int data1, int data2){
            ArrayList<Integer> path1 = nodeToRootPath(node, data1);
            ArrayList<Integer> path2 = nodeToRootPath(node, data2);

            int i = path1.size()-1;
            int j = path2.size()-1;

            while (i>=0 && j>=0 && path1.get(i) == path2.get(j)){
                i--;
                j--;
            }
            i++;
            j++;

            return path1.get(i);
        }

        public static int distanceBTW_nodes(Node node, int data1, int data2){

            ArrayList<Integer> path1 = nodeToRootPath(node, data1);
            ArrayList<Integer> path2 = nodeToRootPath(node, data2);

            int i = path1.size()-1;
            int j = path2.size()-1;

            while (i>=0 && j>=0 && path1.get(i) == path2.get(j)){
                i--;
                j--;
            }
            i++;
            j++;

//          i aur j ye batate hai ki wo apne diye gaye do "data" se common
//          acenstor tak kitne duri pe hain.
            return i+j;
        }

        public static boolean areSimilarTreeShap(Node node1, Node node2){
            if (node1.children != node2.children){
                return false;
            }

            for (int i=0; i<node1.children.size(); i++){

                Node tc1 = node1.children.get(i);
                Node tc2 = node1.children.get(i);

                if (areSimilarTreeShap(tc1, tc2) == false){
                    return false;
                }
            }
            return true;
        }

        public static boolean areMirroImage(Node node1, Node node2){
            if (node1.children != node2.children){
                return false;
            }

            for (int i=0; i<node1.children.size(); i++){
                int j = node2.children.size()-1-i;

                Node c1 = node1.children.get(i);
                Node c2 = node2.children.get(j);

                if (areMirroImage(c1, c2) == false){
                    return false;
                }
            }
            return true;
        }

        public static boolean areSymmetric(Node node){
//          symmetric property  : mirror image of own shape.
            return areMirroImage(node, node);
        }




    }






}
// TreeDataStructure Ends