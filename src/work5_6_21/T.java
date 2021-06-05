package work5_6_21;

class T extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void  main(String []args)
    {
        T t1=new T();
        T t2=new T();
        t1.start();
        t2.start();
    }
}