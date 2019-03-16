package za.ac.cput.org.Assignment4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CricketPlayerTest
{

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void getId()
    {
        Assert.assertEquals("Id","45","45");
    }

    @Test
    public void getName()
    {
        Assert.assertEquals("Taylor","Taylor");
    }

    @Test
    public void getMatchesPlayed()
    {
      CricketPlayer cri = new CricketPlayer(22,"Taylor",3);
      cri.getMatchesPlayed();

    }
}