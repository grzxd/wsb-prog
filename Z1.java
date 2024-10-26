import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        boolean todo = true;

        System.out.println("Podaj stopnie Celsjusza");

        while (todo) {
            try {
                Scanner input = new Scanner(System.in);
                float cels = input.nextFloat();

                System.out.println("Temperatura w stopniach Fahrenheita'a wynosi:" + ((cels*1.8)+32));

                todo = false;
                input.close();
            } catch (Exception e) {
                System.out.println("Należy podać liczbę zmiennoprzecinkową");
            }
        }
    }
}