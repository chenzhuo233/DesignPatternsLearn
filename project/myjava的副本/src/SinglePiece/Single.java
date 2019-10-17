package SinglePiece;

import static SinglePiece.Schatten.*;

/*单件模式：确保一个类只有一个实例，并提供一个全局访问点
* 在Runtime类和线程池中用到
* 不通过外部实例化，只能通过自身
* 静态方法创建自身，并且只能创建一个自身。
* */
/*随便创建一个类*/
class Schatten{
    private volatile static Schatten schatten;
    private boolean sleeping;
    private boolean coding;
    private Schatten(){
      sleeping = false;
      coding = true;
    }
    public static Schatten getInter(){
        if(schatten == null) {
            schatten = new Schatten();
        }
        return schatten;
    }
    public void getup(Schatten schatten){
        if(isSleeping(schatten)){
            sleeping = false;
            coding = true;
        }
        System.out.println("cz is getup to coding!!");
    }
    public void gobed(Schatten schatten){
        if(isCoding(schatten)){
            coding = false;
            sleeping = true;
        }
        System.out.println("cz is go to bed!");
    }

    public boolean isCoding(Schatten schatten) {
        if(schatten.coding)
            return true;
        else {
            return false;
        }
    }

    public boolean isSleeping(Schatten schatten) {
        if(schatten.sleeping)
            return true;
        else{
            return false;
        }
    }
    public void getstatus(){
        System.out.println("cz's status:codeing:"+this.coding+" sleeping:"+this.sleeping);
    }
}

public class Single {
    public static void main(String[] args) {
        Schatten cz = Schatten.getInter();
        cz.getstatus();
        System.out.println("Now cz is coding ,we need to let him go to bed!!");
        cz.gobed(cz);
        cz.getstatus();
        System.out.println("------NEXT DAY-------");
        cz.getstatus();
        System.out.println("Now cz is sleeping,we need to let him to coding!!!");
        cz.getup(cz);
        cz.getstatus();
    }
}
