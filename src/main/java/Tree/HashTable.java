package Tree;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-08
 * @Description 哈希表
 **/
public class HashTable {
    private Node[] linkList;
    private int size;

    public HashTable(int size) {
        this.linkList = new Node[size];
        this.size = size;
    }

    public void add(Node node){
        int index = node.getNo() % size;
        if (linkList[index] == null) {
            linkList[index] = node;
            return;
        }

        Node insert = linkList[index];
        while (insert.getNext() != null) {
            insert = insert.getNext();
        }
        insert.setNext(node);
    }

    public void printf(){
        for (int i = 0; i < linkList.length; i++) {
            System.out.print(linkList[i]);
            System.out.println();
        }
    }

    public Node get(int no){
        int index = no % size;
        Node node = linkList[index];
        if (node == null) {
            return null;
        }
        if (node.getNo() == no) {
            return node;
        }

        Node select = null;
        while (node.getNext() != null) {
            node = node.getNext();
            if (node.getNo() == no) {
                select = node;
                break;
            }
        }
        return select;
    }
}
