/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;

class Sum{
    public int Sum(int x,int y){
        return x+y;}
    public int Sum(int x,int y,int z){
        return x+y+z;
        
    
    }
}
public class N11 {
    public static void main(String args[]){
        Sum s=new Sum();
        System.out.println(s.Sum(10,20));
        System.out.println(s.Sum(10, 20,30));
    }
}
