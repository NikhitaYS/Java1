/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
class Animal{
    void eat(){
        System.out.println("aninals can eat");
    }
}
   class Cat extends Animal{
       @Override void eat(){
           System.out.println("cat can eat");
       }
       
   }

public class N12 {
    public static void main(String[] args){
        Animal obj1=new Animal();
        obj1.eat();
        Animal obj2=new Cat();
        obj2.eat();
    }
    
}
