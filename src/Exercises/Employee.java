package Exercises;

import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

        public String getFirstName () {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public double getMonthlySalary () {
            return monthlySalary;
        }

        public void setMonthlySalary ( double monthlySalary){
            this.monthlySalary = monthlySalary;
        }

        public double getAnnualSalary () {
            monthlySalary *= 12;
            return monthlySalary;
        }

        public double getIncreaseSalary() {

        double increasedSalary = (monthlySalary * 10 / 100) + monthlySalary;

       // double inc1 = inc / monthlySalary * 100;

        return increasedSalary;
        }


        public static void main (String[]args){

            Employee employee1 = new Employee("Ovie", "Oddiri", 10000);
            Employee employee2 = new Employee("Orhie", "Adewunmi", 20000);

        System.out.printf("initial name and salary for employee1: %s %s N%.2f%n%n",employee1.getFirstName(), employee1.getLastName(),
                employee1.getMonthlySalary());
            System.out.printf("initial name and salary for employee2: %s %s N%.2f%n%n",employee2.getFirstName(), employee2.getLastName(),
                    employee2.getMonthlySalary());

            //create Scanner class to take inputs
            Scanner input = new Scanner(System.in);

           /* System.out.println("enter first name");
            String firstN = input.nextLine();
            System.out.println("enter last name");
            String lastN = input.nextLine();
            System.out.println("enter new salary");
            double salary = input.nextDouble();
            employee1.setFirstName(firstN);
            employee1.setLastName(lastN);
            employee1.setMonthlySalary(salary);
            System.out.println(); */

           // System.out.printf("new employee1 name and salary, %s %s N%.2f", employee1.getFirstName(), employee1.getLastName(),
//                    employee1.getMonthlySalary());

            //calculate annual salary
           // System.out.printf("annual salary for employee1 is: %s %s N%.2f%n%n", employee1.getFirstName(), employee1.getLastName(),
               //     employee1.getAnnualSalary());
           // System.out.printf("annual salary for employee1 is: %s %s N%.2f", employee1.getFirstName(), employee1.getLastName(),
                   // employee1.getAnnualSalary());

            //calculate 10% increase in salary


            System.out.printf("employee1's salary is: N%.2f%n%n", employee1.getMonthlySalary());
            System.out.printf("employee1 has a ten percent increase of: N%.2f", employee1.getIncreaseSalary());

    }
    }
