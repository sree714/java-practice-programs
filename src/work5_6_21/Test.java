package work5_6_21;

 class Display extends Thread
{
    private String msg;
    private static String turn;
    public Display(String msg)
    {
        this.msg=msg;
    }
    public  void run()
    {
        while(true)
        {
            playTurn();
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public synchronized void playTurn()
    {
        if(!msg.equals(turn))
        {
            turn=msg;
            System.out.println(msg);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Display t1=new Display("ping");
        Display t2=new Display("pong");
        t1.start();
        t2.start();
    }
}
