package Tree;

import lombok.Data;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-08
 **/
@Data
public class TreeNode {
    private Integer no;
    private String name;
    private TreeNode left;
    private TreeNode right;

    @Override
    public String toString() {
        return "TreeNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public TreeNode(Integer no, String name) {
        this.no = no;
        this.name = name;
    }
}
