package za.ac.cput.org.Assignment4;

import java.util.Objects;

public class EmployeeObeySRP
{
    private String EmployeeId;
    private String name;
    private String DateOfJoining;

    public EmployeeObeySRP()
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeObeySRP that = (EmployeeObeySRP) o;
        return Objects.equals(EmployeeId, that.EmployeeId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(EmployeeId);
    }

    @Override
    public String toString()
    {
        return "EmployeeObeySRP{" + "EmployeeId='" + EmployeeId + '\'' + ", name='" + name + '\'' + ", DateOfJoining='" + DateOfJoining + '\'' + '}';
    }
}
