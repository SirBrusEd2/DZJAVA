import java.util.Objects;
import java.util.Scanner;

public class Task8class {
    public static void task1() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер месяца (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            int daysInMonth;
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if (isLeapYear) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                default:
                    System.out.println("Некорректный номер месяца.");
                    return;
            }

            System.out.println("В месяце " + month + " года " + year + " " + daysInMonth + " дней.");

            System.out.println("Хотите продолжить? [1 - да/2 - нет]");
            int choice = scanner.nextInt();
            if (choice == 2) {
                break;
            }

        }
    }
    public static void task2_3() {
        for(int i = 0; i<10; i++ ){
            for(int j = 1; j <11; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void task2_1(){
        System.out.println();

        int size = 10;

        System.out.println("Таблица умножения:");
        System.out.print("   |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("--------------------------------------------");

        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public void task2_2(){
        System.out.println();

        int size = 10;
        int x = 1;

        System.out.println("Таблица умножения:");
        System.out.print("   |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("--------------------------------------------");

        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= x; j++) {
                System.out.printf("%4d", i * j);
            }
            x++;
            System.out.println();
        }
    }
}
