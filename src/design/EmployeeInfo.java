package design;

import java.util.Scanner;

public class EmployeeInfo extends employeeAbstract implements Employee{

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */
    static String companyName;
    private String firstName;
    public String name;
    private int phoneNumber;
    private String department;
    public static int employeeId;
    private static double numYearEmployment;
    private static double salary;
    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(String name, String companyName) {
        super(name);

    }

    public EmployeeInfo(String name, String emailAdress, int phoneNumber, String firstName, String name1, int phoneNumber1, String department) {
        super(name, emailAdress, phoneNumber);
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public String getFirstName() {
        return firstName;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public EmployeeInfo(int employeeId) {
        super(employeeId);
    }

    @Override
    public String getEmailAdress() {
        return super.getEmailAdress();
    }

    /*
             You need to implement the logic of this method as such:
                It should calculate Employee bonus based on salary and performance.
                It should return the total yearly bonus.
                    Example: 10% of salary for best performance, 8% of salary for average performance and so on.
                    You can set arbitrary number for performance, so you probably need to send 2 arguments.
             *
             */
    public static int calculateEmployeeBonus(int numberOfYearsWithCompany,int performance, int salary) {
        int total = 0;
        if (performance >= 80 && performance < 100) {
            total = (int) salary * 10 * numberOfYearsWithCompany / 100;
        } else if (performance >= 60 && performance <= 90) {
            total = (int) salary * 8 * numberOfYearsWithCompany / 100;
        } else if (performance >= 40 && performance <= 70) {
            total = (int) salary * 5 * numberOfYearsWithCompany / 100;
        } else {
            total = (int) salary * 2 * numberOfYearsWithCompany / 100;
        }
        System.out.println(total);


        return total;
    }






    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public static int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension

        return total;
    }

    @Override
    public int employeeId() {
        return employeeId;
    }

    @Override
    public String employeeName() {
        return name;
    }

    @Override
    public void assignDepartment() {
        System.out.println(department);
    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    @Override
    public void employeeAbstract(String name, String emailAdress) {
        super.employeeAbstract(name, emailAdress);
    }

    public EmployeeInfo(String name) {
        super(name);
    }

    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
