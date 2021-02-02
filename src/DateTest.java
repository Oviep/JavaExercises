import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Date calendar = new Date(0, 13,3000);
        System.out.printf("the day, month and year are: %d %d %d", calendar.getDay(), calendar.getMonth(),
                calendar.getYear());
        System.out.println();

        //Instantiating Scanner object
      Scanner input = new Scanner(System.in);
       /* System.out.println("enter new date");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        calendar.setDay(day);
        calendar.setMonth(month);
        calendar.setYear(year);
        System.out.printf("The new date is: %d/%d/%d", calendar.getDay(), calendar.getMonth(), calendar.getYear()); */

        System.out.println("enter new date");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        calendar.setDay(day);
        calendar.setMonth(month);
        calendar.setYear(year);

        System.out.printf("The new date is: %s", calendar.displayDate());

    }

}
