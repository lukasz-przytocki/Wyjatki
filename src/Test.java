import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person("Jan", "Kowalski");
        BankAccount account1 = new BankAccount(1000, person1);
        System.out.println("Please choose what to do? ");
        System.out.println("Press 1 to withdraw money ");
        System.out.println("Press 2 to deposit money ");
        System.out.println("Press 3 to exit: ");


        switch (scanner.nextInt()){
            case 1:

        try {
            System.out.println("How much do you want withdraw?\n" +
                    "Your account balance: "+ account1.getBalance());
            account1.withdraw(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Balance after withdraw: "+account1.getBalance());

        } catch (NullPointerException ex) {
            System.out.println("Brak osoby");
        } catch (NotEnoughBalanceException ex) {
            System.out.println(ex.getMessage());
        }catch (ToMuchForOneTransaction ex) {
            System.out.println(ex.getMessage());
        }
        break;
            case 2:
                System.out.println("How much do you want deposit? ");
                account1.deposit(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Your balance: "+ account1.getBalance());
                break;
            case 3:
                default:
        }

    }
}
