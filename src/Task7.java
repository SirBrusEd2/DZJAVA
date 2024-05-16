import java.util.Scanner;
public class Task7 {

    public void DZ (){
        double a, b, sum, c;
        sum = 0;
        System.out.print("\nВведите a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        int lens;
        System.out.print("\nВведите количество значений ряда: ");
        lens = scanner.nextInt();
        b = 1;
        for(int i=0; i<=lens; i++ ){

            c =  b/Math.pow(a, Math.pow(2, i));
            System.out.print("\nЗначение c: " + c);
            sum += c;
            System.out.print("\nСумма ряда: " + sum);
        }
    }

}
