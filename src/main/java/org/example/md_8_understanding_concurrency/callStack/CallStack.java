package org.example.md_8_understanding_concurrency.callStack;

public class CallStack {

    public static int fun2(){
        return  0;
    }

    public static int fun1(){
        int x=fun2();
        if(x==0) throw new RuntimeException();
        return x;
    }

    public static void main(String[] args) {
        try{
            //fun1();
            Thread t=new Thread(new MyRunnable());
            t.start();
        }
        catch (Exception e){
            System.out.println("Caught exceptions ..... ");
        }
    }
}
