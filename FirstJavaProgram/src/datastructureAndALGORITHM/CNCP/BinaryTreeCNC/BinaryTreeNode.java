package datastructureAndALGORITHM.CNCP.BinaryTreeCNC;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    BinaryTreeNode(){

    }
    BinaryTreeNode(T data){
        this.data = data;
    }
}
