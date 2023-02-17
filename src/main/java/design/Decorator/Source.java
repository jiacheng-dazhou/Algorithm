package design.Decorator;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public class Source implements Sourceable{
    @Override
    public void method1() {
        System.out.println("this is a source method!");
    }
}
