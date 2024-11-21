/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
class Multithreadingtwo extends Thread implements Runnable{
    public void run(){
        try{
        System.out.println("thread"+Thread.currentThread().getName()+" is running");
    }
      
    catch(Exception e){
            System.out.println("Exeption is caught");
        }
        }
}



/**
 *
 * @author smv
 */
public class N15 {
    public static void main(String[] args){
        for(int i=0;i<9;i++){
       Multithreadingtwo mt1=new Multithreadingtwo();
       Thread t1=new Thread(mt1);
       t1.start();
      
}
    
}
}

