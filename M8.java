/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pkg2.Tools3;
/*class Tools1{
    String s1=" ";
    String s2=" ";
    int len1=0;
    public static String reverse(String s1){
        String s2=" ";
        int len1=s1.length();
         for(int i=0;i<len1;i++)
     {
         s2=s2+s1.substring(len1-(i+1),len1-i);
         
     }
         return s2;
  }
  
}*/


public class M8 {
    public static void main(String[] args)throws FileNotFoundException {
        File f1=new File("names.txt");
        Scanner sc1=new Scanner(f1);
        String name=" ";
        Tools3 t1=new Tools3();
        name=sc1.nextLine();
        System.out.println(t1.reverse(name));
        name=sc1.nextLine();
        System.out.println(t1.reverse(name));
        name=sc1.nextLine();
        System.out.println(t1.reverse(name));
        
        
        
    }
    
}
