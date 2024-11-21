/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import pkg2.Tools3;
public class M11 {
    public static void main(String[] args)throws IOException {
        File f1=new File("names.txt");
        FileWriter fw1=new FileWriter("names_out.txt");
         Scanner sc1=new Scanner(f1);
        String name=" ";
       String name_rev=" ";
        
        Tools3 t1=new Tools3();
        while(sc1.hasNext()){
            name=sc1.nextLine();
            name_rev=t1.reverse(name);
            fw1.write(name_rev+"\n");
            System.out.println(name_rev);
        }
        fw1.close();
    }
    
            
}
