package datastructureAndALGORITHM.CNCP.BinaryTreeCNC;

import java.util.Scanner;

public class BinaryTreeUse {
//  --------------------------------------------------------------------------------------------------bt1
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");

        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInput();
        BinaryTreeNode<Integer> rightChild = takeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data: ");
        }else{
            if(isLeft){
                System.out.println("Enter left child of "+parentData);
            }else {
                System.out.println("Enter right child of "+parentData);
            }
        }

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if (root == null){
            return;
        }

        System.out.print(root.data+":");
        if (root.left != null){
            System.out.print("L"+root.left.data+", ");
        }
        if (root.right != null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
    //Q: largest node data
    public static int height(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }

        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l, r)+1;
    }
    public static int countLeafNodes(BinaryTreeNode<Integer> root){
        if (root == null){ //base case
            return 0;
        }

        if (root.left==null && root.right==null){// condition
            return 1;
        }
        int l = countLeafNodes(root.left);
        int r = countLeafNodes(root.right);

        return l+r;
    }

    public static void printNodeAtDepthK(BinaryTreeNode<Integer> root, int k){
        if (root == null){
            return;
        }

        if(k==0){
            System.out.println(root.data);
            return;
        }
        printNodeAtDepthK(root.left, k-1);
        printNodeAtDepthK(root.right, k-1);
    }
//  ---------------------------------------------------------------------------------------------------bt2
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if (root == null){// base case
            return null;
        }

        if (root.left==null && root.right==null){// condition according to question
            return null;
        }

        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }
    //-----------------------------------
    //Q: mirror binary tree
    //BalancedTree = |height of left subtree ~ height of right subtree| <= 1
     public static boolean isBalenced(BinaryTreeNode<Integer> root){
        if (root == null){
            return true;
        }

        int l = height(root.left);
        int r = height(root.right);

        if (Math.abs(l-r)>1){
            return false;
        }

        boolean isLeftBalenced = isBalenced(root.left);
        boolean isRightBalenced = isBalenced(root.right);

        return isLeftBalenced && isRightBalenced;

     }
     //-----------------------------------
     public static class isBalencedReturn{
        int height;
        boolean isBalenced;
     }
     public static isBalencedReturn isBalencedBetter(BinaryTreeNode<Integer> root){
        if (root == null){
            isBalencedReturn ans = new isBalencedReturn();
            ans.height = 0;
            ans.isBalenced = true;
            return ans;
        }

        isBalencedReturn l = isBalencedBetter(root.left);
        isBalencedReturn r = isBalencedBetter(root.right);

        isBalencedReturn ans = new isBalencedReturn();
        ans.height = 1 + Math.max(l.height, r.height);

        boolean isBal = true;
        if (Math.abs(l.height - r.height)>1 || !l.isBalenced || !r.isBalenced){
            isBal = false;
        }
        ans.isBalenced = isBal;

        return ans;
     }
     //-----------------------------------



    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, true);
        printTreeDetailed(root);
        System.out.println(isBalenced(root));

    }
}
