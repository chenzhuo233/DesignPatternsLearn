package Decorator;

/*实现奶沫调料类*/
public class Foam extends Condiment{
    Beverage beverage;
    public Foam(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Foam";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }
}
