package cn.zealon.tree;

/**
 * 二叉树
 * @Author: zealon
 * @Version: 1.0
 */
public class Tree {
    private Node root;
    public Tree(){
        root = null; //定义一个空树
    }

    //查询
    public Node find(int key){
        Node current = root; //从根目录开始查询
        while (key != current.iData){
            if (key < current.iData){
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }
            if (current == null){
                return null; // 没有存储key的值，返回Null
            }
        }

        return current;
    }

    /**
     * 插入
     * @param id
     * @param value
     */
    public void insert(int id,double value){
        Node node = new Node();
        node.iData = id;
        node.dData = value;

        if (root == null){
            root = node;
        }else {
            Node current = root;  //从root开始查找
            Node parent;  // 定义父节点
            while (true){
                parent = current; // 初始化赋值
                if (id<current.iData){
                    current = current.leftChild;
                    // 当前节点为空，说明有位置可以插入新节点
                    if (current == null){
                        parent.leftChild = node;
                        return;
                    }
                }else {
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    // 删除
    public boolean delete(int key){
        Node current = root; // 要删除的节点
        Node parent = root;  // 父节点
        boolean isLeftChild = false;

        // 查找要删除的节点
        while (current.iData!=key){
            parent = current;
            if (key<current.iData){
                parent = current.leftChild;
            }else {
                parent = current.rightChild;
            }

            // 找不到节点，无法删除
            if (current != null){
                return false;
            }
        }

        // 1.当前是叶节点的话，直接删除节点
        if (current.leftChild==null && current.rightChild==null){
            if (current == root){  // 删除的是父节点，直接赋予空值
                root = null;
            }else if (isLeftChild){  // 如果删除的是左子节点，那么父节点的左子节点即为空
                parent.leftChild = null;
            }else {
                parent.rightChild = null;
            }
        }
        // 2.如果没有右节点，只有左节点，直接用左节点代替当前节点
        else if (current.rightChild == null ){
            if (current == root){
                root = current.leftChild;
            }else if (isLeftChild){
                // 如果删除了当前节点，需要将当前节点的父节点指向进行一个下移
                parent.leftChild = current.leftChild;
            }else {
                parent.rightChild = current.rightChild;
            }
        }
        // 3.如果没有左节点，只有右节点，直接用右节点代替当前节点
        else if (current.leftChild == null ){
            if (current == root){
                root = current.rightChild;
            }else if (isLeftChild){
                parent.leftChild = current.rightChild;
            }else {
                parent.rightChild = current.rightChild;
            }
        }
        // 4.左右节点均不为空
        else {
            // 定义继承者
            Node successor = null;

            if (current == root){
                root = successor;
            }else if (isLeftChild){
                // 当前被删除节点的父类的一个赋值操作
                parent.leftChild = successor;
            }else{
                parent.rightChild = successor;
            }

            successor.leftChild = current.leftChild;
        }

        return true;
    }
}

class Node{
    // 左子树
    public Node leftChild;
    // 右子树
    public Node rightChild;
    // 索引值
    public int iData;
    // 元素数据
    public double dData;

    public void printNode(){
        System.out.println("{left:" +leftChild
                + ",right:"+rightChild
                + ",iData:"+iData
                + ",dData:"+dData
                + "}");
    }
}
