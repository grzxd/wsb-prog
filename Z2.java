import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        boolean todo=true;
        int l1 = 0, l2 = 0, l3 = 0, max, min;

        System.out.println("Podaj 3 liczby całkowite");
        while (todo) {
            try {
                Scanner input = new Scanner(System.in);
                l1 = input.nextInt();
                l2 = input.nextInt();
                l3 = input.nextInt();
                input.close();

                todo=false;
            } catch (Exception e) {
                System.out.println("Należy podać liczby całkowite");
            }
        }

        if (l1>l2) {
            if (l1>l3) {
                max = l1;
                if (l3>l2) {
                    min = l2;
                } else {
                    min = l3;
                }
            } else {
                max = l3;
                min = l2;
            }
        } else if (l2>l3) {
            max = l2;
            if (l3 > l1) {
                min = l1;
            } else {
                min = l3;
            }
        } else {
            max = l3;
            min = l1;
        }
        System.out.println("Największą liczbą jest " + max);
        System.out.println("Najmniejszą liczbą jest " + min);
    }
}
