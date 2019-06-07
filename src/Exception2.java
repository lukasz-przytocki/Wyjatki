import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean incorrect;

        for (int i = 0; i < 5; i++) {

            do {
                try {
                    System.out.printf("Enter number: \n");
                    sum += scanner.nextInt();
                    scanner.nextLine();
                    incorrect = false;
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    //i-- wtedy bez petli
                    System.out.println("Error, please enter correct values: ");
                    incorrect = true;
                }
            } while (incorrect);


        }
        System.out.println("Suma: " + sum);

    }
}
