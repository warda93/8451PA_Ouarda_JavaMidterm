package design;

public class PersonalInfo extends EmployeeInfo{

    int ssn;
    String adress;
    String insurancePolicy;
    public void signUpForInsurance(String insurancePolicy){
        System.out.println("insurance policy is " + insurancePolicy);
    }

    @Override
    public void benefitLayout() {
        System.out.println("health insurance covers 80% os your expenses");
    }
    public PersonalInfo (String firstName, String lastName){
        super (firstName,lastName);

    }
    public PersonalInfo( ){

    }
}
