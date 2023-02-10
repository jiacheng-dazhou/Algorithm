package Cloneable;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-09
 **/
public class CloneTest {
    public static void main(String[] args) throws Exception{
        Clone clone = new Clone(1,"dazhou",new CloneSon(2,"dafan"));
        Clone clone1 = (Clone)clone.clone();
        CloneSon son = clone.getSon();
        son.setName("liting");
        System.out.println();
    }
}
