/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;

class Vehical{
    void displayfeature(){
        System.out.println("Feature:manual power");}
    }
   class Motorbike extends Vehical{
       void displayfeature(){
       System.out.println("Feature:engine");
      
   }}
   class Electric extends Vehical{
       void displayfeature(){
           System.out.println("New feature :battery");
       
    }
   }


public class N13 {
    public static void main(String[] args){
        Vehical m=new Vehical();
        m.displayfeature();
        Motorbike m1=new Motorbike();
        m1.displayfeature();
        Electric mybike=new Electric();
        mybike.displayfeature();
        
    }
    
}
