package work5_6_21;

public class R implements Runnable {
    public void run() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        R r1 = new R();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}