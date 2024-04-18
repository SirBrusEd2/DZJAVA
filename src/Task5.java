import java.util.Scanner;
public class Task5 {
    public void zadacha1 (){
        int n, n1;

        System.out.print("\nВведите год: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if ((n % 4 == 0) && ((n % 100 != 0 ) || (n % 400 == 0))) {
            System.out.printf("Год %d високосный!", n);
        }
        else{
            System.out.printf("Год %d не високосный!", n);
        }
    }
    public void zadacha2 (){
        double x, y;
        System.out.print("\nВведите x: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        if (x >= 3){
            y = -(Math.pow(x, 2) + 3*x +9);
        }
        else{
            y = x/(Math.pow(x, 3)-6);
        }
        System.out.println("Функция F(x) = " + y);
    }
    public void zadacha3 (){
        System.out.print("\nУгадайте загаданную букву: ");
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        // по таблице аски формируется алфавит (от A до Z)
        char riddle = (char) ('A' + (int) (Math.random() * 25));
        if (input == riddle){
            System.out.println("Вы угадали загаданную букву!");
        }
        else {
            System.out.println("Подсказка: " + (int) Math.abs(riddle - input));
        }
    }
    public void zadachaDZ (){
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nЗадайте x: ");
        x = scanner.nextDouble();
        System.out.print("\nЗадайте y: ");
        y = scanner.nextDouble();
        if ((y>=0 && x<=2 && x>=-2 && y<=4)||(y<=0 && x<=4.5 && x>=-4 && y>=-3)){
            System.out.println("Координаты входят в указанную область");
        }
        else{
            System.out.println("Координаты не входят в указанную область");
        }
    }
}
