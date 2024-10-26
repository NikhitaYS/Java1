import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (num1): ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number (num2): ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        double div1 = (double) num1 / num2;
        int div2 = num1 / num2;
        int rem1 = num1 % num2;
        double exp1 = Math.pow(num1, num2);

        System.out.println("Sum = " + sum);
        System.out.println("Diff = " + diff);
        System.out.println("Prod = " + prod);
        System.out.println("Div1 (Decimal Division) = " + div1);
        System.out.println("Div2 (Quotient) = " + div2);
        System.out.println("Rem1 (Remainder) = " + rem1);
        System.out.println("Exp1 (Power) = " + exp1);

        scanner.close();
    }
}