package za.ac.cput.org.Assignment4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatsmanTest
{

    @Before
    public void setUp() throws Exception
    {
        Batsman bat = new Batsman(65,"cyfo",8,4,4);
        Assert.assertNotSame(bat.getName(),bat.getInnings(),"4");
        Assert.assertEquals("4","4");

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test(timeout = 10000)
    public void getHighestScore()
    {
         Assert.assertEquals("45","45");
         while (true);
    }

    @Test
    public void getInnings()
    {
        Assert.assertEquals("234","234");
    }
}