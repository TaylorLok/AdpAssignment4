package za.ac.cput.org.Assignment4;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubsitutionPrinciple
{
    class Bird
    {
        public void fly()
        {

        }

        public void eat()
        {

        }
    }

    class Crow extends Bird
    {

    }

    class Ostrich extends Bird
    {
        Ostrich()
        {
            throw new UnsupportedOperationException();
        }
    }

    public class BirdTest
    {
        public void main(String[] args) {
            List<Bird> birdList = new ArrayList<Bird>();
            birdList.add(new Bird());
            birdList.add(new Crow());
            birdList.add(new Ostrich());
        }
    }

    private void letTheBirdsFly(List<Bird> birdList)
    {
        for (Bird b : birdList)
        {
            b.fly();
        }
    }

    class Bird1
    {
        public void eat()
        {

        }

    }

        class FlightBird extends Bird
        {
            public void fly()
            {
            }
        }

        class NonFlight extends Bird
        {

        }

}

