package design.Decorator;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public class Decorator2 extends Decorator1{

    public Decorator2(Sourceable sourceable) {
        super(sourceable);
    }

    @Override
    public void method1() {
        System.out.println("before decorator");
        super.method1();
        System.out.println("after decorator");
    }
}
