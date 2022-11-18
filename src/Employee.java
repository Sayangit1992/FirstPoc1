public class Employee {
    private int eId;
    private String empName;
    Employee()
    {
        System.out.println("Constructor getting called!!!!");
        this.eId = 123;
        this.empName = "Sayan";
    }

    public void DisplayEmpDetails()
    {
        System.out.println("Hi !! " + empName + " your EmployeeId is : " + eId);
    }
    public void DisplayEmpDetails(boolean flag)
    {
        System.out.println("your EmployeeId is : " + eId);
    }
}