package Multithread;

public class Thread1 {
    synchronized void m1(){
        System.out.println(Thread.currentThread().getName() + " is start!");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /*m2();*/
        System.out.println(Thread.currentThread().getName()  + " is end..");
    }

    public  /*synchronized*/ void m2() {
        System.out.println(Thread.currentThread().getName() + " is start!!");
        try {
            Thread.sleep(100);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("I want to use t1");
        m1();
        System.out.println(Thread.currentThread().getName() + " is end");
    }


    public static void main(String[] args){
        Thread1 t = new Thread1();
        new Thread(t :: m1 , "t1").start();
        new Thread(t :: m2,"t2").start();
    }

}
