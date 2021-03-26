package design;

public class FortuneEmployee {

    /**
     FortuneEmployee class has a main method where you will be able to create Object from
        EmployeeInfo class to use fields and attributes
     <p>
     Demonstrate as many methods as possible to use with proper business work flow.
        Try to think like a Software Architect/Developer.
        This application should provide basic employee information services
     </p>
     <p>
     Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     </p>
     **/
    public static void main(String[] args) {

 EmployeeInfo obj = new EmployeeInfo("warda", "benbahmed");
 PersonalInfo obj1=new PersonalInfo();

 obj.employeeId();
 obj.assignDepartment("IT");
 obj.benefitLayout();
 obj.getEmailAdress();
 obj.setSalary(1000);
 obj.calculateEmployeePension(10,obj.getSalary());
 obj.calculateEmployeeBonus(10,70,obj.getSalary());
 obj1.signUpForInsurance("");
 obj1.benefitLayout();

    }

}
