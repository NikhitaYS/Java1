public class M1 {
    public static void main(String[] args) {
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nOdd Numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        for (int multiple = 3; multiple <= 10; multiple++) {
            System.out.println("\n\nMultiples of " + multiple + ":");
            for (int i = 1; i <= 100; i++) {
                if (i % multiple == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}