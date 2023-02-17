package design.adapter;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 * @Description 类的适配器
 **/
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
