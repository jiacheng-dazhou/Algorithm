package Tree;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-08
 **/
public class HashTableTest {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(8);
        hashTable.add(new Node(1,"dazhou"));
        hashTable.add(new Node(9,"dafan"));
        hashTable.add(new Node(0,"dadi"));
        hashTable.add(new Node(17,"dali"));

        hashTable.printf();

        Node node = hashTable.get(9);
        System.out.println(node);
    }
}
