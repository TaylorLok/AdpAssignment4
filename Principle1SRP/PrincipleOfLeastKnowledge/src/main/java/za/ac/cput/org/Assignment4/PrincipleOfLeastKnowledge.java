package za.ac.cput.org.Assignment4;


public class PrincipleOfLeastKnowledge
{
    public boolean isValidEmployee(Employee employee) /// Bad example
    {
        // Notice method chaining
        String primaryEmailAddress = employee.getEmail().getPrimaryEmailAddress();
        // Notice method chaining
        long mobile = employee.getContactNumber().getMobile();

        // some good conditions
        return primaryEmailAddress != null && mobile != 0;
    }


    public boolean isValidEmployee(Employee employee) // Good example
    {
        boolean isValidPrimaryEmailAddress = employee.isValidPrimaryEmailAddress();

        boolean isValidMobile = employee.isValidMobile();

        // some good conditions
        return isValidPrimaryEmailAddress && isValidMobile;
    }

}
