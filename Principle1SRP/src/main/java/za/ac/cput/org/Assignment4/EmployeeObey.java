package za.ac.cput.org.Assignment4;

import java.util.Objects;

public class EmployeeObey
{
    private String EmployeeId;
    private String name;
    private String DateOfJoining;


    public EmployeeObey()
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
        EmployeeObey that = (EmployeeObey) o;
        return Objects.equals(EmployeeId, that.EmployeeId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(EmployeeId);
    }
}
