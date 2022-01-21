import java.util.Scanner;

public class BasicExponentialNumbersCalculator {
    public static void main(String[] args) {
        System.out.println("----- Exponantial Numbers -----");
        Scanner input = new Scanner(System.in);
        int n, e;
        System.out.print("Number: ");
        n = input.nextInt();
        System.out.print("Exponent: ");
        e = input.nextInt();

        int total = 1;

        for (int i = 1; i<=e; i++){
            total *= n;
        }
        System.out.print("Answer: " + total);

    }
}
