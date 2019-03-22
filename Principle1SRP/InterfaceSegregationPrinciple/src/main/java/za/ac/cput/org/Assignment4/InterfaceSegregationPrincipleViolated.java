package za.ac.cput.org.Assignment4;

public class InterfaceSegregationPrincipleViolated
{
    public interface Person
    {

        void cry();

        void walk();

        void jump();

        void run();

    }
    public class Taylor implements Person {

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

        @Override
        public void jump()
        {

        }

        @Override
        public void cry ()
        {

        }
    }
}

//The violation is because a class cannot implement an interface when it does not need to use all its methods
