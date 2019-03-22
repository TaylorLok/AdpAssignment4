package za.ac.cput.org.Assignment4;

public class WorkerViolationOfPriciple
{
    public void work()
    {


    }

}

class Manager
{

    WorkerViolationOfPriciple worker;



    public void setWorker(WorkerViolationOfPriciple w)
    {
        worker = w;
    }

    public void manage()
    {
        worker.work();
    }
}

class SuperWorker
{
    public void work()
    {
        //.... working much more
    }
}

////------------ this example Above show the bad example of dependancy inversion//////-------



