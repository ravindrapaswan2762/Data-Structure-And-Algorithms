

import java.util.*;

public class MainClass {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {

//       INPUTS :              50      BINARY TREE
//                            /  \
//                           /    \           12  25  30  37  50  62  70  75  87
//                          /      \
//                        25        75
//                       /  \      /  \
//                      /    \    /    \
//                    12     37  62    87
//                          /      \
//                         /        \
//                        30         70
//
//
//      state 1 = push as a left node,  state 2 = push as a right node,  state 3 = pop
//      rtp = root pair, lp = left ka pair, rp = right ka pair,
//      ln = left node, rn = right node
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size()>0){
            Pair top = st.peek();

            if (top.state == 1){

                idx++;
                if (arr[idx] != null){
                    Node ln = new Node(arr[idx], null, null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln, 1);
                    st.push(lp);
                }
                else {
                    top.node.left = null;
                }
                top.state++;
            }
            else if (top.state == 2){
                idx++;
                if (arr[idx] != null){
                    Node rn = new Node(arr[idx], null, null);
                    top.node.right = rn;

                    Pair rp = new Pair(rn, 1);
                    st.push(rp);
                }
                else {
                    top.node.right = null;
                }
                top.state++;

            }
            else{
                st.pop();
            }
        }
//      -----------------------------------------
        levelOrederLineWise(root);

    }

    public static void display(Node node){
//      base case
        if (node == null){
            return;
        }

        String str = "";
        str += node.left==null?"." : node.left.data+"";
        str += " <- "+ node.data + " -> ";
        str += node.right==null?"." : node.right.data+"";
        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    public static int height(Node node){
//       height = longest path (root to leaf) or (leaf to root)
//      -1 for edges,  0 for nodes
        if (node == null){
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh);

        return th+1;


    }
    public static int bigestElement(Node node){
//      biggest element in the tree.
        if (node == null){
            return 0;
        }

        int lmax = bigestElement(node.left);
        int rmax = bigestElement(node.right);

        int tmax = Math.max(node.data, Math.max(lmax, rmax));

        return tmax;
    }
    public static int smallestElement(Node node){
//      biggest element in the tree.
        if (node == null){
            return Integer.MAX_VALUE;
        }

        int lmax = smallestElement(node.left);
        int rmax = smallestElement(node.right);

        int tmax = Math.min(node.data, Math.min(lmax, rmax));

        return tmax;
    }
    public static int sum(Node node){
//      sum of all nodes in the tree.
        if (node == null){
            return 0;
        }

        int lsum = sum(node.left);
        int rsum = sum(node.right);

        int tsum = lsum + rsum + node.data;

        return tsum;
    }
    public static int size(Node node){
//      size = total number of elements in the tree
        if (node == null){
            return 0;
        }

        int lsize = size(node.left);
        int rsize = size(node.right);

        int tsize = lsize + rsize + 1;

        return tsize;
    }
    public static void traverse(Node node){
        if (node==null){
            return;
        }
//      pre order
        System.out.println(node.data+" pre order");

        traverse(node.left);

//      in oreder
        System.out.println(node.data+" in order");

        traverse(node.right);

//      post order
        System.out.println(node.data+" post order");

    }
    public static void levelOrederLineWise(Node node){
//      rpa : remove -> print -> add
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while (mq.size()>0){
            int count = mq.size();

            for (int i=0; i<count; i++){

                node = mq.remove();
                System.out.print(node.data+":"+"L:"+node.left+","+"R:"+node.right);

                if (node.left != null){
                    mq.add(node.left);
                }
                if (node.right != null){
                    mq.add(node.right);
                }
            }
            System.out.println();
        }
    }
    public static void itrativePreInPostTraversal(Node node){
//       if states:
//                 1 : write in Pree -> state++ -> and go on left node
//                 2 : write in In -> state++ -> and go on right node
//                 3 : write in post -> pop

        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(node, 1);
        st.push(rtp);

        String pre = "";
        String in = "";
        String post = "";

        while (st.size()>0){
            Pair top = st.peek();
            if (top.state==1){
                pre += top.node.data+" ";
                top.state++;

                if (top.node.left != null){
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }
            }
            else if (top.state==2){
                in += top.node.data+" ";
                top.state++;

                if (top.node.right != null){
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }
            }
            else {
                post += top.node.data+" ";
                st.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
//  -------------------------------------------------------------
    static ArrayList<Integer> path = new ArrayList<>();
    public static boolean NodeToRootPaath(Node node, int leaf_data){
        if (node == null){
            return false;
        }
//      -----------------------
        if (node.data == leaf_data){
            path.add(node.data);
            return true;
        }

        boolean filc = NodeToRootPaath(node.left, leaf_data);
        if (filc){
            path.add(node.data);
            return true;
        }

        boolean firc = NodeToRootPaath(node.right, leaf_data);
        if (firc){
            path.add(node.data);
            return true;
        }
        return false;
    }
//  -------------------------------------------------------------
    public static void KlevelPrintDown(Node node, int k){
        if (node==null || k<0){
            return;
        }
        if (k==0){
            System.out.print(node.data+" ");
        }
        KlevelPrintDown(node.left, k-1);
        KlevelPrintDown(node.right, k-1);
    }
//  ---------------------------------------------------------------

//  starting from i = 0th  : N edges away nodes = N nodes away nodes
//  NodeToRootpath: node1     node2     node3     node4
//                  down(k-1) down(k-2) down(k-3) down(k-4)

    static ArrayList<Node> path1;
    public static boolean NodeToRootPaath1(Node node, int data){
        if (node == null){
            return false;
        }
//      -----------------------
        if (node.data == data){
            path1.add(node);
            return true;
        }

        boolean filc = NodeToRootPaath1(node.left, data);
        if (filc){
            path1.add(node);
            return true;
        }

        boolean firc = NodeToRootPaath1(node.right, data);
        if (firc){
            path1.add(node);
            return true;
        }
        return false;
    }
    public static void KlevelPrintDown1(Node node, int k, Node blocker){
        if (node==null || k<0 || node==blocker){
            return;
        }
        if (k==0){
            System.out.print(node.data+" ");
        }
        KlevelPrintDown1(node.left, k-1, blocker);
        KlevelPrintDown1(node.right, k-1, blocker);
    }
    public static void printNodesKedgesFar(Node node, int data, int k){
        path1 = new ArrayList<>();
        NodeToRootPaath1(node, data);
        for (int i=0; i<path1.size(); i++){
            KlevelPrintDown1(path1.get(i), k-i, i==0?null:path1.get(i-1));
        }


    }
    //  ---------------------------------------------------------------
//  print paths who's sum is lies in the given range.
    public static void pathToLeafFromRoot(Node node, String path, int sum, int low, int high){
        if (node==null){
            return;
        }

        if (node.left==null && node.right==null){
            sum += node.data;
            if (sum>=low && sum<=high){
                System.out.println(path+node.data);
            }
            return;
        }

        pathToLeafFromRoot(node.left, path+node.data+" ", sum+node.data, low, high);
        pathToLeafFromRoot(node.right, path+node.data+" ", sum+node.data, low, high);
    }
//  -------------------------------------------------------------
    public static Node createLeftNodeCloneTree(Node node){
//       sabhi nodes ke left me uski khud ki copy node laga deni hai.
//       lcr = left cloned node, rcr = right cloned node, nn = new node

        if (node==null){
            return null;
        }

//      keep feth on left-node and right-node
        Node lcr = createLeftNodeCloneTree(node.left);
        Node rcr = createLeftNodeCloneTree(node.right);

        Node nn = new Node(node.data, lcr, null);
        node.left = nn;
        node.right = rcr;

        return node;
    }
//  ---------------------------------------------------------------
    public static Node normalFormTO_createLeftNodeCloneTree(Node node){
        if (node==null){
            return null;
        }

//      keep feth on left-node(original node, not copied node) and right-node
        Node lcr = normalFormTO_createLeftNodeCloneTree(node.left.left);
        Node rcr = normalFormTO_createLeftNodeCloneTree(node.right);

        node.left = lcr;
        node.right = rcr;


        return node;
    }
//  ---------------------------------------------------------------
    public static void printSingleChildNode_helper(Node node, ArrayList<Integer> ans){
//      aise child ko print karna hai jiske parent ke paas single child hai.

//      during pre-order traversal, check nodes it should not leaf-node or null-node.
        if (node==null || (node.left==null && node.right==null)){
            return;
        }
//      otherwise if satisfy one in both then add the node in our answer.
        if (node.left==null || node.right==null){
            ans.add(node.data);
        }
        printSingleChildNode_helper(node.left, ans);
        printSingleChildNode_helper(node.right, ans);

    }
    public static ArrayList<Integer> printSingleChildNode(Node node){
        ArrayList<Integer> res = new ArrayList<>();
        printSingleChildNode_helper(node, res);
        return res;
    }
//  ---------------------------------------------------------------
    public static Node removeLeaves(Node node){
        if (node==null){
            return null;
        }

        if (node.left==null && node.right==null){
            return null;
        }

        Node ln = removeLeaves(node.left);
        Node rn = removeLeaves(node.right);

        node.left = ln;
        node.right = rn;

        return node;
    }
//  --------------------------------------------------------------
    public static class daiPair {
        int ht;
        int dia;
    }
    public static daiPair diameter(Node node){
//      diameter : first longest path + second longest path (according to edges)
        if (node==null){
            daiPair bp = new daiPair();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }

//      feth :
//      max distance b/w two nodes in lhs
        daiPair lp = diameter(node.left);

//      max distance b/w two nodes in rhs
        daiPair rp = diameter(node.right);

        daiPair mp = new daiPair();
        mp.ht = Math.max(lp.ht, rp.ht) + 1;

//      max distance b/w left's dipest and right's dipest
        int dia1 = lp.ht + rp.ht + 2;

        mp.dia = Math.max(dia1, Math.max(lp.dia, rp.dia));

        return mp;
    }
//  ---------------------------------------------------------------
    static  int tilt = 0;
    public static int tilt(Node node){
//      tilt of a node = sum of lhs and sum of rhs and then take absolute of both
        if (node==null){
            return 0;
        }

        int lt = tilt(node.left);
        int rt = tilt(node.right);

//      side effect in till variable
        int til = Math.abs(lt-rt);
        tilt += til;

        return lt+rt+node.data;
    }
//  ---------------------------------------------------------------
    public static class BSTPair{
        int min;
        int max;
        boolean isBST;
    }
    public static BSTPair isBST(Node node){

        if (node==null){
            BSTPair bp = new BSTPair();

            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.isBST = true;
            return bp;
        }

        BSTPair lp = isBST(node.left);
        BSTPair rp = isBST(node.right);

        BSTPair mp = new BSTPair();
//      left node as a treeBST, and right node as a treeBst, and yourself node as a nodeBst
        mp.isBST = lp.isBST && rp.isBST && (node.data > lp.max && node.data < rp.min);

        mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
        mp.max = Math.max(node.data, Math.max(lp.max, rp.max));

        return mp;
    }
//  ---------------------------------------------------------------
    public static class BSTPair_2{
        int min;
        int max;
        boolean isBST;
        Node lbNODE;
        int lbSize;
//  lbn = largest bst node,    lbs = largest bst node size
    }
    public static BSTPair_2 longestBST(Node node){

        if (node==null){
            BSTPair_2 bp = new BSTPair_2();

            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.isBST = true;
            bp.lbNODE = node;
            bp.lbSize = 0;
            return bp;
        }

        BSTPair_2 lp = longestBST(node.left);
        BSTPair_2 rp = longestBST(node.right);

        BSTPair_2 mp = new BSTPair_2();
//      left node as a treeBST, and right node as a treeBst, and yourself node as a nodeBst
        mp.isBST = lp.isBST && rp.isBST && (node.data > lp.max && node.data < rp.min);

        mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
        mp.max = Math.max(node.data, Math.max(lp.max, rp.max));

//      ------------------------------- extra logic compare to isBST------------
        if (mp.isBST){
            mp.lbNODE = node;
            mp.lbSize = lp.lbSize+ rp.lbSize+1;
        }
        else if (lp.lbSize> rp.lbSize){
            mp.lbNODE = lp.lbNODE;
            mp.lbSize = lp.lbSize;
        }
        else {
            mp.lbNODE = rp.lbNODE;
            mp.lbSize = rp.lbSize;
        }

        return mp;
    }
//  ---------------------------------------------------------------
    static boolean isBal = true;
    public static int isBalanced(Node node){
//        1 left se hight layega
//        2 right se hight layega
//        3 dono ka gap check karega, (lh,rh) ka gap 1 se jyda nai hone chahiye,
//          other than whole tree unbalanced.
//        4 then hight return karega, Math.max(lh + rh)+1;

        if (node == null){
            return 0;
        }

        int lh = isBalanced(node.left);
        int rh = isBalanced(node.right);

        int gap = Math.abs(lh-rh);
        if (gap>1){
            isBal = false;
        }

        int th = Math.max(lh, rh) + 1;
        return th;

    }
    //                       OR
    public static class BalPair{
        int ht;
        boolean isBal1;
    }
    public static BalPair isBAL(Node node){
        if (node==null){
            BalPair bp = new BalPair();
            bp.ht = 0;
            bp.isBal1 = true;
            return bp;
        }

        BalPair lp = isBAL(node.left);
        BalPair rp = isBAL(node.left);

        BalPair mp = new BalPair();
        mp.isBal1 = Math.abs(lp.ht- rp.ht)<=1 && lp.isBal1 && rp.isBal1;
        mp.ht = Math.max(lp.ht, rp.ht) + 1;

        return mp;


    }
//  --------------------------------------------------------------
    public static Node buildTreeHelper(int[] post0rder, int psi, int pei, int[] in0rder, int isi, int iei){
//      1 : find left and right subtree through pei, then calculate total no. of element in
//          in left sub-tree.

//      left_SubTree_Postorder = psi, psi+TN0LSE-1
//      leftt_SubTree_Inorder = isi, idx-1

//      right_SubTree_Postorder = psi+TN0LSE, pei-1
//      right_SubTree_Intorder = idx+1, iei

        if (isi>iei){
            return null;
        }
//      creating root node through last index of post0rder.
        Node node = new Node(post0rder[pei], null, null);

//      then finding root node in in0rder Arr
        int idx = isi;
        while (post0rder[pei] != in0rder[idx]){
            idx++;
        }
//       calculating total no. of element in left sub-tree (TN0LSE=totalN0ofLeftSubTreeELEMENT)
        int TN0LSE = idx - isi;

//      if found then  re-initialize values of left-subTree and right-subTree.
        node.left = buildTreeHelper(post0rder,psi,psi+TN0LSE-1,          in0rder,isi,idx-1 );
        node.right = buildTreeHelper(post0rder,psi+TN0LSE,pei-1,     in0rder,idx+1,iei);

        return node;
    }
    public static Node buildTree(int[] post0order, int[] in0rder){

        int n = in0rder.length;

        return buildTreeHelper(post0order,0,n-1,  in0rder,0,n-1 );
    }
//  --------------------------------------------------------------
    public static Node buildTreePreIN(int[] pre0rder, int psi, int pei, int[] in0rder, int isi, int iei){

        if (isi>iei){
            return null;
        }

        Node node = new Node(pre0rder[psi], null, null);


        int idx = isi;
        while (pre0rder[pei] != in0rder[idx]){
            idx++;
        }

        int TN0LSE = idx - isi;

        node.left = buildTreePreIN(pre0rder,psi+1,psi+TN0LSE,          in0rder,isi,idx-1 );
        node.right = buildTreePreIN(pre0rder,psi+TN0LSE+1,pei,             in0rder,idx+1,iei);

        return node;
    }
    public static Node buildTree2(int[] pre0order, int[] in0rder){

        int n = in0rder.length;

        return buildTreePreIN(pre0order,0,n-1,  in0rder,0,n-1 );
    }
//  ---------------------------------------------------------------
    public static Node construct_FromIn0rder(int[] in0reder, int si, int ei){
//      in0rder always a sorted array in BST.

        if (si > ei){
            return null;
        }
        int mid = (si+ei)/2;

        Node node = new Node(in0reder[mid], null, null);

        node.left = construct_FromIn0rder(in0reder, si,mid-1 );
        node.right = construct_FromIn0rder(in0reder,mid+1, ei );

        return node;

    }
    public static Node construct(int[] in0reder){
        int n = in0reder.length;

        return construct_FromIn0rder(in0reder, 0, n-1);
    }

//  -------------------------------------------------------------
    public static void printVerticalOrder(Node node){
        if (node==null){
            return;
        }
        int hd = 0;
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<Integer, ArrayList<Integer>>();

        getVerticalOrder(node, hd, m);
        for (Map.Entry<Integer, ArrayList<Integer>> cm : m.entrySet()){
            System.out.println(cm.getValue());
        }
    }
    public static void getVerticalOrder(Node node, int hd, TreeMap<Integer, ArrayList<Integer>>m){
        if (node==null){
            return;
        }
        if (m.get(hd)==null){
            ArrayList<Integer> l = new ArrayList<Integer>();
            l.add(node.data);
            m.put(hd, l);
        }
        else {
            ArrayList<Integer> l = m.get(hd);
            l.add(node.data);
            m.put(hd, l);
        }

        getVerticalOrder(node.left, hd-1, m);
        getVerticalOrder(node.right, hd+1, m);
    }
//  -------------------------------------------------------------
    public static class vPair{
        Node node;
        int hl;

        vPair(Node node, int hl){
        this.node = node;
        this.hl = hl;
        }
}
    public static void width(Node node, int h1, int[] ans){
        if (node==null){
            return;
        }

        ans[0] = Math.min(ans[0], h1);
        ans[1] = Math.max(ans[1], h1);

        width(node.left, h1-1, ans);
        width(node.right, h1+1, ans);
    }
    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(Node node){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (node == null){
            return ans;
        }
        int[] minMax = new int[2];
        width(node, 0, minMax);
        int len = (minMax[1] - minMax[0]) + 1;
        System.out.println(len);

        for (int i=0; i<len; i++){
            ans.add(new ArrayList<>());
        }

        LinkedList<vPair> que = new LinkedList<>();
        que.add(new vPair(node, Math.abs(minMax[0])));

        while (que.size() != 0){
            int size = que.size();
            while (size-->0){
                vPair rp = que.removeFirst();
                int hl = rp.hl;
                Node node1 = rp.node;

                ans.get(hl).add(node1.data);

                if (node1.left != null){
                    que.addLast(new vPair(node1.left, hl-1));
                }
                if (node1.right != null){
                    que.addLast(new vPair(node1.right, hl+1));
                }
            }
        }

        return ans;

    }
//  ---------------------------------------------------------------
    private static int idx = 0;
    public static Node BSTfromPre0order(int[] pre0rder, int Lr, int Rr){

        if (idx>= pre0rder.length || pre0rder[idx]<Lr || pre0rder[idx]>Rr){
            return null;
        }

        Node node = new Node(pre0rder[idx++], null, null);

        node.left = BSTfromPre0order(pre0rder, Lr, node.data);
        node.right = BSTfromPre0order(pre0rder, node.data, Rr);

        return node;
    }
    public static Node pre0rder(int[] pre0rder){
        int n = pre0rder.length;
        int Lr = Integer.MIN_VALUE;
        int Rr = Integer.MAX_VALUE;

        return BSTfromPre0order(pre0rder, Lr, Rr);
    }
//  ---------------------------------------------------------------
    private static int idx2 = 0;
    public static Node BSTfromPost0order(int[] post0rder, int Lr, int Rr){
        if (idx<0 || post0rder[idx]<Lr || post0rder[idx]>Rr){
            return null;
        }

//      node create hone ke baad idx ki value dicrease ho rahi hai.
        Node node = new Node(post0rder[idx--], null, null);

        node.right = BSTfromPost0order(post0rder, node.data, Rr);
        node.left = BSTfromPost0order(post0rder, Lr, node.data);

        return node;
    }
    public static Node post0rder(int[] post0rder){
        int idx2 = post0rder.length-1;
        int Lr = Integer.MIN_VALUE;
        int Rr = Integer.MAX_VALUE;

        return BSTfromPost0order(post0rder, Lr,Rr);

    }
//  ---------------------------------------------------------------




    


}
