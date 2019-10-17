package Decorator;

/*
 * 设计模式：装饰者模式
 * 应用实例：coffee
 * 设计原则：对扩展开放，对修改关闭
 * 模型设计：请你模拟一家咖啡店（Starbucks），它拥有很多种类的咖啡ƒ
 * 每一种咖啡可以加入一些调料：比如奶沫，牛奶，摩卡，豆浆。。。
 * 为了将来可以随时添加调料，或者当店内推出新的咖啡时，我们不修改原本的代码
 * 而只是对他们做出扩展。开始你的设计模式联系
 * */

/*定义一个抽象饮料类*/
abstract class Beverage{
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}

/*实现一个抽象调料类*/
abstract class Condiment extends Beverage{
    public abstract String getDescription();
}

public class Coffee {
    public static void main(String[] args) {
        /*定制一杯不加料的浓缩咖啡*/
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new  Foam(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage3 = new HouseBlend();
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new  Foam(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
