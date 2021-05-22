package work15_05_21;

class Fibo1 {
    public static void main(String[] args) {
        int a = 0, b = 1, c, i, count = 20;
        System.out.println(a + " \n" + b);
        for (i = 2; i < count; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}