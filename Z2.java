import java.util.InputMismatchException;
import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        int l1, l2, l3, max, min;

        String mess = "Podaj liczbę całkowitą";
        l1 = input(mess);
        l2 = input(mess);
        l3 = input(mess);

        if (l1 > l2 && l1 > l3) {
            max = l1;
        } else if (l2 > l1 && l2 > l3) {
            max = l2;
        } else {
            max = l3;
        }

        if (l1<l2 && l1<l3) {
            min = l1;
        } else if (l2<l1 && l2<l3) {
            min = l2;
        } else {
            min = l3;
        }

        System.out.println("Największą liczbą jest " + max);
        System.out.println("Najmniejszą liczbą jest " + min);
    }

    static int input(String message) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny typ danych!");
            return input(message);
        }
    }
}
