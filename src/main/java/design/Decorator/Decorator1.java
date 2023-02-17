package design.Decorator;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public abstract class Decorator1 implements Sourceable{
    private Sourceable sourceable;

    public Decorator1(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method1() {
        sourceable.method1();
    }
}
