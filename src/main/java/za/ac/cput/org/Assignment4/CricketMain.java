package za.ac.cput.org.Assignment4;

import java.util.ArrayList;

public class CricketMain
{
    public static void bowlOver(Bowler bowler)
    {
        for (int i = 0; i < 6; i++)
        {
            System.out.println(i+1 + ". " + bowler.getName() + " bowled " + bowler.bowl() + " km/h");
        }
    }

    public static void main(String[] args)
    {
        SpinBowler spinBowler1 = new SpinBowler(1, "KG", 24, 20);
        SpinBowler spinBowler2 = new SpinBowler(2, "LT", 30, 15);
        SpinBowler spinBowler3 = new SpinBowler(3, "PR", 34, 1);

        FastBowler fastBowler1 = new FastBowler(4, "TD", 40, 10);
        FastBowler fastBowler2 = new FastBowler(5, "LN", 36, 0);
        FastBowler fastBowler3 = new FastBowler(6, "ER", 100, 50);

        bowlOver(spinBowler1);
        bowlOver(spinBowler2);
        bowlOver(fastBowler1);

        ArrayList<Bowler> bowlers = new ArrayList<>();
        bowlers.add(spinBowler1);
        bowlers.add(fastBowler1);

        ArrayList<SpinBowler> spinBowlers = new ArrayList<>();

        for (int i = 0; i < bowlers.size(); i++)
        {
            if(bowlers.get(i) instanceof SpinBowler)
            {
                SpinBowler spinBowler = (SpinBowler)bowlers.get(i);

                spinBowlers.add(spinBowler);
            }
            else
            {

            }
        }

    }
}
