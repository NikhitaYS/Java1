public class M4{
    public static void main(String[] args) {
        String s1 = "Hello, World!";
        String result = reverse(s1);
        System.out.println("Reversed String: " + result);
    }
    public static String reverse(String s1) {
        String s2 = ""; 
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        return s2;
    }
}