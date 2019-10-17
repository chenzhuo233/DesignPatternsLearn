package Decorator;

/*开始实现一个饮料浓缩咖啡类*/
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
