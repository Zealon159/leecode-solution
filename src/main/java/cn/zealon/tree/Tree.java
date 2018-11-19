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
            Node successor = getSuccessor(current);

            if (current == root){
                root = successor;
            }else if (isLeftChild){
                // 是左子节点，当前被删除节点的父类的一个赋值操作
                parent.leftChild = successor;
            }else{
                // 右子节点，父类指向赋值
                parent.rightChild = successor;
            }

            // 给继承者左子节点赋值
            successor.leftChild = current.leftChild;

        }

        return true;
    }

    // 寻找继承者 并且 右子节点赋值
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode; // 初始化

        // 先向右节点寻找一位
        Node current = delNode.rightChild;

        // 向左节点寻找最终的继承者
        while (current!=null){
            successorParent = successor;
            successor = current;
            current =  current.leftChild;
        }

        // 如果继承者不是当前被删除节点的右子节点，说明右节点并不是只有一层，是一个右子树
        if (successor != delNode.rightChild){
            // 继承者的右子树成为了父类的左子树
            successorParent.leftChild = successor.rightChild;
            // 右节点赋值
            successor.rightChild = delNode.rightChild;
        }
        return successor;
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
