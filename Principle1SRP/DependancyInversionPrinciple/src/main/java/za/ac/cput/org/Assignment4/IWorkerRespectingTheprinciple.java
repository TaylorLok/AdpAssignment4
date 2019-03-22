package za.ac.cput.org.Assignment4;

public interface IWorkerRespectingTheprinciple
{
    void work();

}

class Worker implements IWorkerRespectingTheprinciple
{
    public void work()
    {
        // ....working
    }
}

class SuperWorker1  implements IWorkerRespectingTheprinciple
{
    public void work()
    {
        //.... working much more
    }
}

class Manager2
{
    IWorkerRespectingTheprinciple worker;

    public void setWorker(IWorkerRespectingTheprinciple w)
    {
        worker = w;
    }

    public void manage()
    {
        worker.work();
    }
}

//////***** This a good example which is not violating the dependancy inversion*****///////