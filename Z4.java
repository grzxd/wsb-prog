import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        System.out.println("Kalkulator");
        double number1, number2;
        char operation;

        number1 = input("Podaj pierwszą liczbę: ");
        operation = charinput("Podaj operację");
        number2 = input("Podaj drugą liczbę:");
        System.out.println("------------");

        switch (operation) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println(number1 / number2);
                } else {
                    System.out.println("Nie można dzielić przez zero");
                }
                break;
            default:
                System.out.println("Podano błędną operację");
        }
    }

    static int input(String message) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            int input = scanner.nextInt();
            scanner.close();
            return input;
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny typ danych!");
            return input(message);
        }
    }

    static char charinput(String message) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            char input = scanner.next().charAt(0);
            scanner.close();
            return input;
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny typ danych!");
            return charinput(message);
        }
    }
}
