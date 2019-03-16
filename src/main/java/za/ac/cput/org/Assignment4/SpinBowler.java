package za.ac.cput.org.Assignment4;

import java.util.Random;

public class SpinBowler extends Bowler
{
    private Random random = new Random();

    public SpinBowler(int id, String name, int matchesPlayed, int wickets)
    {
        super(id, name, matchesPlayed, wickets);
    }

    @Override
    public double bowl()
    {
        return random.nextInt(40) + 50;
    }
}
