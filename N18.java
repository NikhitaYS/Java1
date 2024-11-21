
package oopj41;
class Outer{
    void display(){
        System.out.println("Outer class display method");}
    class Inner{
        void display(){
            System.out.println("Inner class display method");   
        }}}
    
    


public class N18 {
    public static void main (String[] args){
        String title0="Lab 8 program -Nested class";
        String title1="develop a java program to create an outer class with a display function";
        String title2=" Create another class inside the outer class named inner with a function called display";
        String title3="Call the two functions in the main class";
        System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3);
        Outer o1=new Outer();
        o1.display();
        Outer.Inner i1=o1.new Inner();
        i1.display();
    }
}
