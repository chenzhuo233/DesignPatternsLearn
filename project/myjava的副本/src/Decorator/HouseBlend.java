package Decorator;

/*另一种饮料"综合"*/
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
