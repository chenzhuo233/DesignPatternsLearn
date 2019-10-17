package Decorator;

/*实现豆浆调料类*/
public class Soy extends Condiment{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.22;
    }
}
