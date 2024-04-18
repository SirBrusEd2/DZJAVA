import java.util.Scanner;

public class Task4 {

    private int N;
    private int K;

    Scanner scanner = new Scanner(System.in);

    public void print(){
        System.out.println("\n1)");
        System.out.printf("%2d:%2d", N, K);
        System.out.println("\n2)");
        System.out.printf("\nСейчас %d часов %d минут 00 секунд", N, K);
        System.out.printf("\nИдёт %d минута суток", K);
        System.out.printf("\nДо полуночи осталось %d часов и %d минут", 23-N, 60-K);
        System.out.printf("\nС 8:00 прошло %d секунд", N*60*60+K*60);
        System.out.printf("\nТекущий час = %.2f суток и текущая минута = %.2f часа", N/24., K/60.);


    }
    public void random() {
        N = (int) (Math.random() * 23);
        K = (int) (Math.random() * 60);

        print();
    }

    public  void ruchkami () {
        System.out.print("Введите часы: ");
        N = scanner.nextInt();
        System.out.print("Введите минуты: ");
        K = scanner.nextInt();
        print();
    }

    public void domashka () {
        double x, y, z, u, u1, u2;
        System.out.print("Введите x: ");
        x = scanner.nextDouble();
        System.out.print("Введите y: ");
        y = scanner.nextDouble();
        System.out.print("Введите z: ");
        z = scanner.nextDouble();
        u = (Math.pow(8 + Math.pow(x-y,2) + 1,1/3.))/(Math.pow(x,2) + Math.pow(y,2) + 2);
        u1 = (Math.exp(Math.abs(x-y))*Math.pow((Math.pow(Math.tan(z), 2) + 1),x));
        u2 = u-u1;
        System.out.printf("Решение: %3.4f", u2);
    }

    public void zadacha3 (){
        int n, n1, n2, n3, n12;
        System.out.print("\nВведите трёхзначное число n: ");
        n = scanner.nextInt();
        n1 = n%10;
        n12 = (n%100-n%10)/10;
        n2 = (n - n%100)/100;
        n3 = n%10 + (n - n%100)/100 + (n%100-n%10)/10;
        System.out.print("\nПоследняя цифра числа n: " + n1);
        System.out.print("\nПервая цифра числа n: " + n2);
        System.out.print("\nСумма цифра числа n: " + n3);
        System.out.print("\nЧисло наоборот: " + n1 + n12 + n2 );
    }

}
