package za.ac.cput.org.Assignment4;

public class Batsman extends CricketPlayer
{
    private int highestScore;
    private int innings;

    public Batsman(int id, String name, int matchesPlayed, int highestScore, int innings)
    {
        super(id, name, matchesPlayed);
        this.highestScore = highestScore;
        this.innings = innings;
    }

    public int getHighestScore()
    {
        return highestScore;
    }

    public void setHighestScore(int highestScore)
    {
        this.highestScore = highestScore;
    }

    public int getInnings()
    {
        return innings;
    }

    public void setInnings(int innings)
    {
        this.innings = innings;
    }
}
