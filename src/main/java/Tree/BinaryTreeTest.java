package Tree;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-08
 **/
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(new TreeNode(6,"zero"));
        tree.add(new TreeNode(2,"one"));
        tree.add(new TreeNode(4,"two"));
        tree.add(new TreeNode(8,"three"));
        tree.add(new TreeNode(9,"three"));
        tree.prefixList();
        tree.middleList();
        tree.suffixList();
    }
}
