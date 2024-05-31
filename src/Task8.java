import java.util.Scanner;

public class Task8 {
    /**/
    private Prymougolnic prymougolnic = new Prymougolnic ();
    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        double a = 10, b = 10;
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    setSymbols(scanner);
                    break;
                case 2:
                    System.out.print("Введите a: ");
                    a = scanner.nextDouble();
                    System.out.print("Введите b: ");
                    b = scanner.nextDouble();

                    break;
                case 3:
                    prymougolnic.drawContour(a, b);
                    break;
                case 4:
                    prymougolnic.fillFigure(a, b);
                    break;
                case 5:
                    prymougolnic.drawFilledFigure(a, b);
                    break;
                case 6:
                    System.out.println("Завершение программы");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 6);
    }

    private void displayMenu() {
        System.out.println("\nМеню:");
        System.out.println("1) Задать символ контура и заливки");
        System.out.println("2) Задать параметры фигуры");
        System.out.println("3) Нарисовать контур");
        System.out.println("4) Залить фигуру");
        System.out.println("5) Нарисовать фигуру с заливкой");
        System.out.println("6) Выйти из программы");
        System.out.print("Выберите пункт меню: ");
    }

    private void setSymbols(Scanner scanner) {
        System.out.print("Введите символ для контура: ");
        char contourSymbol = scanner.next().charAt(0);
        System.out.print("Введите символ для заливки: ");
        char fillSymbol = scanner.next().charAt(0);
        prymougolnic.setContourSymbol(contourSymbol);
        prymougolnic.setFillSymbol(fillSymbol);
    }

}
