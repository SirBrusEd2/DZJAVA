public class Task2 {
    public void Task7() {
        double SeaMile = 1.852;
        double DryMile = 1.609;
        System.out.println("-------------------------------------------------");
        System.out.println("|      км       |   10          |    12          |");
        System.out.println("__|");
        System.out.printf("|Морская миля   | %f     |     %f  |\n", 10 * SeaMile, 12 * SeaMile);
        System.out.println("-------------------------------------------------|");
        System.out.printf("|Сухопутная миля|  %f    |    %f   |\n", 10 * DryMile, 10 * DryMile);
        System.out.println("__");
    }
    public void Task8() {
        int n = 123;
        System.out.println((byte) n % 10);
        System.out.println(n / 100);
        System.out.println(n % 10 + n / 10 % 10 + n /100);
        System.out.println("" + n % 10 + n / 10 % 10 + n /100 );
    }
    public void task9() {
        int a = 11, b = 3;
        int x = a/b;
        float y = (float) (a/b);
        double z = (float) a/b;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public void task10() {
        char ch1 = 'A', ch2 = 10;
        int chr1 = ch1 + ch2 - 'c';
        char chr2 = (char) (ch1 + ch2 - 'c');
        System.out.println(chr1);
        System.out.println(chr2);
    }
}
