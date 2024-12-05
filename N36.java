package pkg1;
import pkg2.MyPackage3;
public class N36{

        public static void main(String[] args) {
                System.out.println("Package");
                MyPackage2 mypack1=new MyPackage2();
                mypack1.display();
                
                MyPackage3 mp3 = new MyPackage3();
                mp3.display();
                
        }
}