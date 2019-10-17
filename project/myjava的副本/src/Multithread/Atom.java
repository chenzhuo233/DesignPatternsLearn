package Multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Atom {
    AtomicInteger count = new AtomicInteger(0);
    /*synchronized*/ void m(){
        System.out.println("m start!");
        try {
            count.incrementAndGet();
            System.out.println("count is add :" + count);
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("something is wrong!");
        }
        System.out.println("m end!");
    }
    void m1(){
        System.out.println("m1 start!!");
        try {
            count.incrementAndGet();
            System.out.println("count is add2 :" + count);
        }catch (Exception e){
            System.out.println("something is wrong!");
        }
        System.out.println("m1 end!!");
    }
    public static void main(String[] args) {
        Atom t = new Atom();
        new Thread(t::m, "thread1").start();
        new Thread(t::m1,"thread2").start();
    }
}
