/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
class Test1{
    public static void m1(){
        System.out.println("from m1 of Test1");
    }
}
class Test2{
    public static void m1(){
        System.out.println("from m1 of Test2");
    }
}

public class N9 {
    public static void main(String[] args){
        Test1.m1();
        Test2.m1();
       
    }
    
}
