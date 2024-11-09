import java.util.InputMismatchException;
import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        double price, rrso = 0.0, monthly;
        int months;

        price = input("Podaj kwotę produktu");
        months = (int) input("Podaj ilość rat");

        if (months <= 12 && months >= 6) {
            rrso=2.5;
        } else if (months <= 24) {
            rrso=5;
        } else if (months < 48) {
            rrso=10;
        }

        monthly = price*(rrso/100+1)/months;
        System.out.print("Odsetki: ");
        System.out.printf("%.2f \n", (price*(rrso/100+1)-price));
        System.out.print("Twoja miesięczna rata to: ");
        System.out.printf("%.2f", monthly);
    }

    static double input(String message) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny typ danych!");
            return input(message);
        }
    }
}
