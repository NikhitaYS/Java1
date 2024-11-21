/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
class Outer1{
    void display(){
        System.out.println("outer class method");
        
    }
    class Inner1{
        void display(){
            System.out.println("Inner class method");
        }
    }
}
public class N10 {
    public static void main(String[] args){
        Outer1 o1=new Outer1();
        o1.display();
        Outer1.Inner1 i1=o1.new Inner1();
        i1.display();
    }
    
}
