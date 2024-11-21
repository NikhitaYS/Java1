/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
class Vehical1{
    private String brand;
    public Vehical1(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void honk(){
        System.out.println("Honking ");
        
        
    }
}
interface Electric1{
    void charge();
}
interface Autonomus{
    void autodrive();
}
class ElectricCar extends Vehical1 implements Electric1, Autonomus {
         public ElectricCar(String brand){
          super(brand);}

@Override
public void charge(){
  System.out.println("charging");
}
public void autodrive(){
 System.out.println("drive autonomusly");
}
}

public class N7{
    public static void main(String[] args){
        ElectricCar ec1=new ElectricCar("Tata");
        ec1.charge();
        ec1.autodrive();
    }
}

