package design.adapter;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 * @Description 对象的适配器
 **/
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
