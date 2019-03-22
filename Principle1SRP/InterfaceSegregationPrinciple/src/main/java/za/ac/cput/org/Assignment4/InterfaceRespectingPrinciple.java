package za.ac.cput.org.Assignment4;


public class InterfaceRespectingPrinciple
{
   public interface Person
   {

        void cry();

       void walk();

        void jump();

       void run();

  }


    public interface Person1 extends Person
    {

        void run();

        void walk();

    }

    public interface Person2 extends Person
    {

        void jump();

        void cry();
    }

    private abstract class Taylor implements Person
    {

        @Override
        public void run()
        {
            System.out.println("Taylor started running");
        }

        @Override
        public void walk()
        {
            System.out.println("Taylor started walking");
        }

    }
}


