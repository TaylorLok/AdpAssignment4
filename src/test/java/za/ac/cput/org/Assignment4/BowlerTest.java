package za.ac.cput.org.Assignment4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlerTest
{

    @Before
    public void setUp() throws Exception
    {
        new Bowler(68, "Taylor", 9, 5)
        {
            @Override
            double bowl()
            {
                return 0;
            }
        };
        final Bowler b;

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void getWickets()
    {
        Assert.assertEquals("Id","6","6");
    }

    @Test
    public void bowl()
    {
        Bowler bowler = new Bowler(69,"sizwe",8,5)
        {
            @Override
            double bowl()
            {
                return 0;
            }
        };
        Assert.assertTrue("False",true);
    }
}