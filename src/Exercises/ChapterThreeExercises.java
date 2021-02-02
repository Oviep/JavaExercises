package Exercises;

public class ChapterThreeExercises {
    //example code in textbook of class Account

    //3.11 Modified class account
  /* private String name;
    private double balance;

    public ChapterThreeExercises (String name, double balance) {
        if (balance > 0.0) {
        this.balance = balance;
        }
        this.name = name;

    }

    public void setDeposit(double deposit) {
        balance += deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void withdraw(double withdrawal) {
        if(withdrawal <= balance) {
            balance -= withdrawal;
        } else {
            System.out.printf("cannot withdraw amount because it exceeds balance N%.2f", withdrawal);
        }
    }

    public static void main(String[] args) {
        // Creation of objects account1 and account2 and providing initial values for constructor
        ChapterThreeExercises account1 = new ChapterThreeExercises("Ovie Oddiri", 200.50);
        ChapterThreeExercises account2 = new ChapterThreeExercises("Orhie Adewunmi", 500.50);

        // printing name and initial account balances for account1 and account2
        System.out.printf("account1 name is %s and initial deposit is N%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("account1 name is %s and initial deposit is N%.2f%n%n", account2.getName(), account2.getBalance());

        //creation of an object from the Scanner class to read input from user
        Scanner input = new Scanner(System.in);

       //User enters deposit for account1
       System.out.println("Enter deposit for account 1");
       double deposit = input.nextDouble();
       account1.setDeposit(deposit);

       // display name and current account balance of account1
       System.out.printf("%s balance is: N%.2f%n%n", account1.getName(), account1.getBalance());

       //User1 withdraws amount
        System.out.println("Enter amount to withdraw");
        double withdrawal = input.nextDouble();
        account1.withdraw(withdrawal);

        // display name and current account balance of account1
        System.out.printf("%s balance is: N%.2f%n%n", account1.getName(), account1.getBalance());

       // User enters deposit for account2
       System.out.println("Enter deposit for account 2");
        deposit = input.nextDouble();
        account2.setDeposit(deposit);

        //display name and current account balance of account2
        System.out.printf("%s balance is: N%.2f%n%n", account2.getName(), account2.getBalance());

        //User2 withdraws amount
        System.out.println("Enter amount to withdraw");
        withdrawal = input.nextDouble();
        account2.withdraw(withdrawal);

        // display name and current account balance of account2
        System.out.printf("%s balance is: N%.2f%n%n", account2.getName(), account2.getBalance());





    } */


    //3.12 Invoice class
    /* private String partNumber;
    private String partDescription;
    private int quantityItem;
    private double price;


   public ChapterThreeExercises(String partNumber, String partDescription, int quantityItem, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantityItem > 0.0) {
            this.quantityItem = quantityItem;
        }
        if (price > 0.0) {
            this.price = price;
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(int quantityItem) {
        this.quantityItem = quantityItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount(double priceT, int quantity) {

        if (priceT > 0.0) {
            price += priceT;
        }

        if(quantity > 0) {
            quantityItem += quantity;
        }

        double invoice = price * quantityItem;
        return invoice;

    }

    public static void main(String[] args) {
        ChapterThreeExercises invoice1 = new ChapterThreeExercises();
        ChapterThreeExercises invoice2 = new ChapterThreeExercises();

        //Displaying initial values of objects
        System.out.printf("invoice one: part " +
                "number- %s, part description- %s, quantity item- %d, price- N%.2f%n%n ", invoice1.partNumber,
                invoice1.partDescription, invoice1.quantityItem, invoice1.price);

        System.out.printf("invoice two: part " +
                        "number- %s, part description- %s, quantity item- %d, price- N%.2f%n%n ", invoice2.partNumber,
                invoice2.partDescription, invoice2.quantityItem, invoice2.price);

        //Set the quantity and price for goods
        Scanner input = new Scanner(System.in);

       /* System.out.println("Input part description");
        String productD = input.nextLine();
        invoice1.setPartDescription(productD);
        System.out.println();

        System.out.println("Input price");
        double priceC = input.nextDouble();
        invoice1.setPrice(priceC);
        System.out.println();

        //Display new values
        System.out.printf("invoice1 part description is- %s%n. Invoice1s new price is N%.2f%n%n",
                invoice1.partDescription, invoice1.price);

        //problem with this line of code. compiler is skipping variable description. Ask for help to solve
        System.out.println("Input product description for invoice2");
        String description = input.nextLine();
        invoice2.setPartDescription(description);
        System.out.println();

        System.out.println("Input price");
        priceC = input.nextDouble();
        invoice2.setPrice(priceC);
        System.out.println();

        //Display new values
        System.out.printf("invoice2 part description is- %s. Invoice12 new price is N%.2f%n%n",
                invoice2.partDescription, invoice2.price);

       problematic code. Need help in resolving this method issue. It is returning an amount not expected
        System.out.println("input price");
        double priceT = input.nextDouble();
        System.out.println("input quantity");
        int quantity = input.nextInt();
        invoice1.getInvoiceAmount(priceT, quantity);
        System.out.println();

        System.out.printf("invoice amount is: N%.2f", invoice1.getInvoiceAmount(priceT, quantity));*/



    //3.13 Employee Class

    private String firstName;
    private String lastName;
    private double salary;

    public ChapterThreeExercises(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if(salary > 0.0)
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double annualSalary() {
        salary *= 12;
        return salary;
    }

    public static void main(String[] args) {
        ChapterThreeExercises employee1 = new ChapterThreeExercises("Tunji","Sijuwade",5000);
        ChapterThreeExercises employee2 = new ChapterThreeExercises("Bisi","Folwawiyo",6000);

        System.out.printf("employee1 name and surname plus salary:", employee1.firstName, employee1.lastName, employee1.salary);
    }


}




