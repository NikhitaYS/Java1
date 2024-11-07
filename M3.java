public class M3{
  public static void main(String[] args){
     String input="Meera";
     reverse(input);
  }
  public static void reverse(String s1)
{
    String reversed="";
    for(int i=s1.length()-1;i>=0;i--){
      reversed+=s1.charAt(i);
    }
    System.out.println("Reversed string:" +reversed);
    }
}