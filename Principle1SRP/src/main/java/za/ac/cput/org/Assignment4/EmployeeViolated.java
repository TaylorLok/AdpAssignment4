package za.ac.cput.org.Assignment4;

public class EmployeeViolated
{
    private String EmployeeId;
    private String name;
    private String DateOfJoining;


    public EmployeeViolated()
    {

    }

    public String getEmployeeId()
    {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId)
    {
        EmployeeId = employeeId;
    }

    public String getName()
    {
        return name;
    }

    public String getDateOfJoining()
    {
        return DateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining)
    {
        DateOfJoining = dateOfJoining;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Boolean isPromotionDueThisYear() /// violation its not suposse to be here
    {
        return false;
    }

    public double calcIncomeTaxForCurrentYear()/// violation
    {
        return 200;
    }

    @Override
    public String toString() {
        return "EmployeeViolated{" + "EmployeeId='" + EmployeeId + '\'' + ", name='" + name + '\'' + ", DateOfJoining='" + DateOfJoining + '\'' + '}';
    }
}
