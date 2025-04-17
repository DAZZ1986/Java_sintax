package main.Company1;

public class Employee {
    private String employeeName;
    private String employeeAddress;
    private float annualSalary;


    public static void main(String[] args) {
        /*
        AbstractClass o1 = new AbstractClass("Anatoly", "St.Petersburg", 30000);
        AbstractClass o2 = new AbstractClass("Evgeny", "Moscow", 255000);
        AbstractClass o3 = new AbstractClass("Sergei", "Dubai", 455000);

        System.out.println(o1.displayDetails());
        System.out.println(o2.displayDetails());
        System.out.println(o3.displayDetails());

        System.out.println("Сумма = "+(o1.annualSalary + o2.annualSalary + o3.annualSalary));
        System.out.println(o3.askMeeting(o1));
        System.out.println(o2);

        System.out.println((new AbstractClass("Peter", "New-York", 40000)));
        */
    }







    Employee(String name, String address, float salary) {
        employeeName = name;
        employeeAddress = address;
        annualSalary = salary;
    }

    Employee() {

    }



    public String displayDetails() {
        return employeeName + " " + employeeAddress+ " " + annualSalary;
    }
/*
    public String askMeeting(AbstractClass e) {
        return "Дорогой " + e.getEmployeeName() + " я буду рад(а) встрече с Вами, это " + employeeName +
                " встретимся по моему адресу " + employeeAddress;
    }
*/




    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public float getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", annualSalary=" + annualSalary +
                '}';
    }



}
