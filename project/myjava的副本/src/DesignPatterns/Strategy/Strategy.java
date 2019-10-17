package DesignPatterns.Strategy;

abstract class Duck{
    Flyable flyable;
    Quackable quackable;

    abstract void display();

    public void perfromFly(){
        flyable.fly();
    }

    public void perfromQuack(){
        quackable.quack();
    }

    public void swim(){
        System.out.println("all can swim");
    }
}

interface Flyable{
    public void fly();
}

interface Quackable{
    public void quack();
}

/*Can Fly*/
class FlyWithWing implements Flyable{
    public void fly(){
        System.out.println("I can fly!!");
    }
}

/*Cannot Fly*/
class FlyNoWay implements Flyable{
    public void fly(){
        System.out.println("I cannot fly!!");
    }
}

/*Can quack*/
class Quack implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}

/*Cannot qucak*/
class QuackNo implements Quackable{
    @Override
    public void quack() {
        System.out.println("NoNoNo Quack!!");
    }
}

class ModDuck extends Duck{
    public ModDuck(){
        flyable = new FlyWithWing();
        quackable = new Quack();
    }
    @Override
    void display() {
        System.out.println("I.m Blue");
    }


}

public class Strategy {
    public static void main(String[] args) {
        Duck md = new ModDuck();
        md.display();
        md.perfromFly();
        md.perfromQuack();
    }
}

