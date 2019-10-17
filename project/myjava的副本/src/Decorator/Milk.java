package Decorator;

/*实现牛奶调料类*/
public class Milk extends Condiment{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.18;
    }
}
