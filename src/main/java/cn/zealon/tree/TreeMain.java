package cn.zealon.tree;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public class TreeMain {

    private static Tree tree = new Tree();

    public static void main(String[] args){

        tree.insert(50,1.4);
        tree.insert(12,6.1);
        tree.insert(55,8.1);
        tree.insert(1,1);
        tree.insert(76,6.1);
        tree.insert(159,5.5);

        Node node = tree.find(12);
        node.printNode();

    }
}
