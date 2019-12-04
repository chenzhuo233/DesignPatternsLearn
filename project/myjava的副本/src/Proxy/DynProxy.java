package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynProxy implements InvocationHandler {
    /*生成代理类*/
    private Object targe;

    public void setTarge(Object targe) {
        this.targe = targe;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                targe.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        proxyme(method.getName());
        Object result = method.invoke(targe,args);
        return result;
    }

    public void proxyme(String str){
        System.out.println("使用代理的"+str);
    }
}
