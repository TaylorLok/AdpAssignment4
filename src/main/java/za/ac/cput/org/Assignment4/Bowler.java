package za.ac.cput.org.Assignment4;

public abstract class Bowler extends CricketPlayer
{
    private int wickets;

    public Bowler(int id, String name, int matchesPlayed, int wickets)
    {
        super(id, name, matchesPlayed);
        this.wickets = wickets;
    }

    public int getWickets()
    {
        return wickets;
    }

    public void setWickets(int wickets)
    {
        this.wickets = wickets;
    }

    abstract double bowl();
}
