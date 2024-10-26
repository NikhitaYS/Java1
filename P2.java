import java.util.ArrayList;
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter end number: ");
        int end = scanner.nextInt();

        System.out.print("Even numbers: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        System.out.println("Even ArrayList: " + evenList);
        System.out.println("Odd ArrayList: " + oddList);

        ArrayList<Integer> list3 = generateMultiples(3);
        ArrayList<Integer> list4 = generateMultiples(4);
        ArrayList<Integer> list5 = generateMultiples(5);
        ArrayList<Integer> list6 = generateMultiples(6);
        ArrayList<Integer> list7 = generateMultiples(7);
        ArrayList<Integer> list8 = generateMultiples(8);
        ArrayList<Integer> list9 = generateMultiples(9);

        System.out.println("Multiples of 3: " + list3);
        System.out.println("Multiples of 4: " + list4);
        System.out.println("Multiples of 5: " + list5);
        System.out.println("Multiples of 6: " + list6);
        System.out.println("Multiples of 7: " + list7);
        System.out.println("Multiples of 8: " + list8);
        System.out.println("Multiples of 9: " + list9);

        ArrayList<Integer> primeList = generatePrimes(100);
        System.out.println("Prime numbers from 1 to 100: " + primeList);

        scanner.close();
    }

    public static ArrayList<Integer> generateMultiples(int n) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i = 1; i * n <= 100; i++) {
            multiples.add(i * n);
        }
        return multiples;
    }
    public static ArrayList<Integer> generatePrimes(int limit) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}