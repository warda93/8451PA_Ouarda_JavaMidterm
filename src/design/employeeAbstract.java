package design;

public abstract class employeeAbstract {
    String name;
    String emailAdress;
    int phoneNumber;
    private static int idNumber;

    public employeeAbstract(int employeeId) {

    }

    public employeeAbstract(String name) {
        this.name = name;
    }


    public void employeeAbstract(String name, String emailAdress) {
        this.name = name;
        this.emailAdress = emailAdress;
    }

    public employeeAbstract(String name, String emailAdress, int phoneNumber) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

}
