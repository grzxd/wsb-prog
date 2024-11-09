import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        //Kalkulator
        double number1, number2;
        char operation;

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        number1 = input.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        number2 = input.nextDouble();
        System.out.println("Podaj operację:");
        operation = input.next().charAt(0);
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
        }
    }
}
