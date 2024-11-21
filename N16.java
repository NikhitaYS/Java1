/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
class Multithreadingthree extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
    try{
        Thread.sleep(1000);    
        }
    catch(InterruptedException e){
            
            }
    }
}
}
/**
 *
 * @author smv
 */
public class N16 {
    public static void main(String[] args){
        
       Multithreadingthree mt1=new Multithreadingthree();
       mt1.start();
      

    
}
}


