
package oopj41;
import java.io.*;
import java.util.*;
import static oopj41.fact.factorial;
        
class fact{
    static int factorial(int n){
        if(n==0||n==1){
            return 1;}
        return n*factorial(n-1);
            
        }
    
}

public class N8 {
    public static void main (String[] args){
        int ans=factorial(0);
        System.out.println("the factorial of 0 is"+ans );
        
    }
}


    

