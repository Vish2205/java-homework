import java.util.Scanner;

public class ReverseNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversedNumber = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
// example of while loop
