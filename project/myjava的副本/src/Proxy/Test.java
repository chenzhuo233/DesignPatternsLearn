package Proxy;
/*代理模式-静态代理
* 定义：代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。通俗的来讲代理模式就是我们生活中常见的中介。
* 角色：
* 抽象角色 : 一般使用接口或者抽象类来实现
* 真实角色 : 被代理的角色
* 代理角色 : 代理真实角色 ; 代理真实角色后 , 一般会做一些附属的操作
* 客户 : 使用代理角色来进行一些操作
* 实现：抽象角色：增删改查UserService，真实对象：UserServiceImpl，代理对象：UserProxy，客户：Test
* */
public class Test {
    public static void main(String[] args) {
        /*创建被代理角色*/
        UserServiceImpl userService = new UserServiceImpl();
        /*代理角色*/
        UserProxy userProxy = new UserProxy(userService);
        userProxy.add();
    }
}
