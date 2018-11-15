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
