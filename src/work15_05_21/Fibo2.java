package work15_05_21;

class Fibo2 {

    static int a = 0, b = 1, c = 0;

    static void print(int count) {
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            print(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 25;
        System.out.println(a + "\n " + b);
        print(count - 2);
    }
}