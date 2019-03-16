package za.ac.cput.org.Assignment4;

import java.util.Random;

public class FastBowler extends Bowler
{ private Random random = new Random();

    public FastBowler(int id, String name, int matchesPlayed, int wickets)
    {
        super(id, name, matchesPlayed, wickets);
    }

    @Override
    public double bowl()
    {
        return random.nextInt(60) + 100;
    }
}
