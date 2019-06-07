import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] table = new String[3];

        for (int i = 0; i <table.length ; i++) {
            System.out.printf("Enter text: ");
            table[i] = scanner.nextLine();
        }

        System.out.printf("Please enter index to be displayed: \n");

        try {
            int index = scanner.nextInt();
            System.out.println(table[index]);
            System.out.println("Index prawidłowy");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Zły index tablicy");
        }catch (InputMismatchException e){
            System.out.println("Nieprawidłowy format");

        }finally {
            System.out.println("Godbye!");
        }
    }
}
