package design;

import java.util.Random;

public class EmployeeInfo extends Email implements Employee{

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
    static String companyName= "DELL";
    private String firstName;
    public String lastName;
    private int phoneNumber;
    private String department;
    public  int employeeId;
    private double numYearEmployment;
    private int salary;
    String emailAdress;
    String fullName;
    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(){
    }
    public EmployeeInfo(String firstName,String lastName) {
        this.firstName= firstName;
        this.lastName=lastName;
    }

    public EmployeeInfo(int employeeId, String emailAdress) {

        this.employeeId = employeeId;
        this.emailAdress = emailAdress;

    }

    public int getSalary() {
        return salary;
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

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmailAdress() {
        System.out.println(emailAdress=firstName + lastName +"@"+ companyName +".com");
        return emailAdress;
    }

    /*
             You need to implement the logic of this method as such:
                It should calculate Employee bonus based on salary and performance.
                It should return the total yearly bonus.
                    Example: 10% of salary for best performance, 8% of salary for average performance and so on.
                    You can set arbitrary number for performance, so you probably need to send 2 arguments.
             *
             */
    public int calculateEmployeeBonus(int numberOfYearsWithCompany,int performance, int salary) {
        int total = 0;
        if (performance >= 80 && performance < 100) {
            total = salary * 10 * numberOfYearsWithCompany / 100;
        } else if (performance >= 60 && performance <= 90) {
            total = salary * 8 * numberOfYearsWithCompany / 100;
        } else if (performance >= 40 && performance <= 70) {
            total =  salary * 5 * numberOfYearsWithCompany / 100;
        } else {
            total = salary * 2 * numberOfYearsWithCompany / 100;
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
    public  int calculateEmployeePension(int numberofYearsEmployment, int salary) {
        int total = 0;
        if(numberofYearsEmployment>=15){
            total=salary/100*50;
            System.out.println("your pension is "+ total);
        }if(numberofYearsEmployment<15 && numberofYearsEmployment>=10 ){
            total = salary/100*40;
            System.out.println("your pension is "+ total);
        }if (numberofYearsEmployment<10 && numberofYearsEmployment>=5){
            total = salary/100*30;
            System.out.println("your pension is "+ total);
        }if(numberofYearsEmployment<5 ){
            total= salary/100*20;
            System.out.println("your pension is "+ total);
        }
     return total;
        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension

    }

    @Override
    public int employeeId() {
        Random rand = new Random();
        int num = rand.nextInt(10000);
        System.out.println("Your employee ID is " + num);
        return num;
    }

    @Override
    public String employeeName(String firstName,String lastName) {
        System.out.println("employee name is "+ firstName+" "+ lastName);
        return fullName;
    }

    @Override
    public void assignDepartment(String department ) {
        System.out.println("employee department is" + department);
    }


    @Override
    public void benefitLayout() {
        System.out.println("***your benefits ***\n\t health insurance \n\t vacation \n\t life insurance \n\t student loan");

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

