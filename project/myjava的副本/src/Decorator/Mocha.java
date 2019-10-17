package Decorator;

/*实现摩卡调料类*/
public class Mocha extends Condiment{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}