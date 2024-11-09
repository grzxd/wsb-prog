import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        double price, rrso = 0.0, monthly;
        int months;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj kwotę produktu");
        price = input.nextDouble();
        System.out.println("Podaj ilość rat");
        months = input.nextInt();

        if (months <= 12 && months >= 6) {
            rrso=2.5;
        } else if (months <= 24) {
            rrso=5;
        } else if (months < 48) {
            rrso=10;
        }

        monthly = price*rrso/months;
        System.out.print("Twoja miesięczna rata to: ");
        System.out.printf("%.2f", monthly);
    }
}
