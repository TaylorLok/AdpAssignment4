package za.ac.cput.org.Assignment4;

public class CricketPlayer
{
    private int id;
    private String name;
    private int matchesPlayed;

    public CricketPlayer(int id, String name, int matchesPlayed)
    {
        this.id = id;
        this.name = name;
        this.matchesPlayed = matchesPlayed;
    }

    public CricketPlayer()
    {

    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMatchesPlayed()
    {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed)
    {
        this.matchesPlayed = matchesPlayed;
    }
}
