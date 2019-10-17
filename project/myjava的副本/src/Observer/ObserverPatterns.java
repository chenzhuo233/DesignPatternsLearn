package Observer;
/*观察者模式*/
import java.util.ArrayList;

/*定义观察者接口*/
interface Ob{
    void updata(float tem,float hum,float psr);
}

/*主题接口
 * 定义注册和
 * 删除方法*/
interface Observable1{
    void registerObserver(Ob o);
    void removeObserver(Ob o);
    void notifyObservers();
}

class WeatherDate implements Observable1{
    private ArrayList<Ob> observers;
    /*定义温度，湿度，压强*/
    private float tem;
    private float hum;
    private float psr;

    public WeatherDate(){
        observers = new ArrayList<Ob>();
    }
    @Override
    public void registerObserver(Ob o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Ob o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        /*通知所有观察者*/
        for (int i = 0; i < observers.size(); i++) {
            Ob observer = observers.get(i);
            observer.updata(tem,hum,psr);
        }
    }

    public void setMeasurements(float tem,float hum,float psr){
        this.tem = tem;
        this.hum = hum;
        this.psr = psr;
    }
    /*调用更新方法*/
    public void measurementsCanged(){
        notifyObservers();
    }
}


class CurrentDisplay implements Ob{
    private float tem;
    private float hum;
    private float psr;
    Observable1 weatherDate;

    public CurrentDisplay(Observable1 weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void updata(float tem,float hum,float psr) {
        System.out.println("这是布告板内的方法！");
        this.tem=tem;
        this.hum= hum;
        this.psr= psr;
        display();
    }

    public void display(){
        System.out.println("这是一个展示方法，温度："+tem+",湿度："+hum+"，压强："+psr);
    }
}

public class ObserverPatterns {
    public static void main(String[]args){
        WeatherDate weatherDate = new WeatherDate();
        CurrentDisplay currentDisplay =
                new CurrentDisplay(weatherDate);
        weatherDate.setMeasurements(80,65,30.4f);
        weatherDate.measurementsCanged();
    }
}

