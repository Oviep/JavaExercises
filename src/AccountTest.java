import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("Ovie Oddiri",10000);
        Account account2 = new Account("Orhie Adewunmi", 20000);
// Display initial balance of Account objects
        displayAccount(account1, account2);
//       System.out.printf("account1 details are: %s N%.2f%n%n", account1.getName(), account1.getBalance());
//        System.out.printf("account1 details are: %s N%.2f%n%n", account2.getName(), account2.getBalance());

        //Deposit amount
        Scanner input = new Scanner(System.in);

        System.out.println("input name");
        String name= input.nextLine();
        account1.setName(name);
        displayAccount(account1,account2);

        System.out.println("input amount");
        double amount = input.nextDouble();
        account1.setBalance(amount);
        displayAccount(account1,account2);

        System.out.println("input name");
         name= input.nextLine();
        account2.setName(name);
        displayAccount(account1,account2);


        System.out.println("input amount");
         amount = input.nextDouble();
        account2.setBalance(amount);

//        System.out.printf(" new account1 details are and the deposit is: %s N%.2f%n%n");

//        System.out.println("input deposit");
//        double deposit = input.nextDouble();
//        account1.setDeposit(deposit);
//        System.out.printf("account1 deposit is:N%.2f%n%n", account1.getBalance());



    }

    public static void displayAccount(Account account1, Account account2) {
        System.out.printf("account1 details are: %s N%.2f%n%n", account1.getName(), account1.getBalance());
      System.out.printf("account2 details are: %s N%.2f%n%n", account2.getName(), account2.getBalance());
    }
}
