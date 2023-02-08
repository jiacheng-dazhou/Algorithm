package Tree;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-08
 * @Description 二叉树
 **/
public class BinaryTree {
    private TreeNode root;

    public void prefixList() {
        if (root == null) {
            System.out.println("树为空！");
        }

        prefixList(root);
        System.out.println();
    }

    private void prefixList(TreeNode node) {
        if (node != null) {
            System.out.print(node);
        }
        if (node.getLeft() != null) {
            System.out.print("\t->\t");
            prefixList(node.getLeft());
        }
        if (node.getRight() != null) {
            System.out.print("\t->\t");
            prefixList(node.getRight());
        }
    }

    public void middleList() {
        if (root == null) {
            System.out.println("树为空！");
        }

        middleList(root);
        System.out.println();
    }

    private void middleList(TreeNode node) {
        if (node.getLeft() != null) {
            middleList(node.getLeft());
        }
        System.out.print(node + "\t->\t");
        if (node.getRight() != null) {
            middleList(node.getRight());
        }
    }

    public void suffixList() {
        if (root == null) {
            System.out.println("树为空！");
        }

        suffixList(root);
        System.out.println();
    }

    private void suffixList(TreeNode node) {
        if (node.getLeft() != null) {
            suffixList(node.getLeft());
        }

        if (node.getRight() != null) {
            suffixList(node.getRight());
        }

        System.out.print(node + "\t->\t");
    }

    public void add(TreeNode insert) {
        if (root == null) {
            root = insert;
            return;
        }
        addNode(insert,root);
    }

    private void addNode(TreeNode insert,TreeNode node) {

        if (node.getNo() == insert.getNo()) {
            node.setName(insert.getName());
            return;
        }

        if (insert.getNo() < node.getNo()) {
            if (node.getLeft() == null) {
                node.setLeft(insert);
                return;
            }
            addNode(insert,node.getLeft());
        }

        if (insert.getNo() > node.getNo()) {
            if (node.getRight() == null) {
                node.setRight(insert);
                return;
            }
            addNode(insert,node.getRight());
        }
    }

    public void addRight(TreeNode node) {
        if (root == null) {
            root = node;
            return;
        }

        TreeNode insert = root;
        while (insert.getRight() != null) {
            insert = root.getRight();
        }
        insert.setRight(node);
    }
}
