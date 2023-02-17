package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public class JDKDynamicProxy implements InvocationHandler {

    private Object bean;

    public JDKDynamicProxy(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("wakeup")) {
            System.out.println("早安~~~");
        } else if (methodName.equals("sleep")) {
            System.out.println("晚安~~~");
        }
        return method.invoke(bean,args);
    }
}
