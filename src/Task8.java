import java.util.Scanner;

public class Task8 {
    private static char contourSymbol = '0'; //контур
    private static char fillSymbol = '-'; //заливка
    private static char emptiness = ' '; //пустота

    public void main() {
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
                    drawContour(a, b);
                    break;
                case 4:
                    fillFigure(a, b);
                    break;
                case 5:
                    drawFilledFigure(a, b);
                    break;
                case 6:
                    System.out.println("Завершение программы");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 6);
    }

    private static void displayMenu() {
        System.out.println("\nМеню:");
        System.out.println("1) Задать символ контура и заливки");
        System.out.println("2) Задать параметры фигуры");
        System.out.println("3) Нарисовать контур");
        System.out.println("4) Залить фигуру");
        System.out.println("5) Нарисовать фигуру с заливкой");
        System.out.println("6) Выйти из программы");
        System.out.print("Выберите пункт меню: ");
    }

    private static void setSymbols(Scanner scanner) {
        System.out.print("Введите символ для контура: ");
        contourSymbol = scanner.next().charAt(0);
        System.out.print("Введите символ для заливки: ");
        fillSymbol = scanner.next().charAt(0);
    }
    /*Цвет контура гипотинузы выводится только тогда, когда есть пересечения при отрисовке прямоугольного треугольника, то есть если точка (с её координатами)
     * точно по формуле пренадлежит (её координаты) гипотинузе, то контур выведется, в ином случае ничего не поятися (чем больше треугольник тем больше точность*/
    //контур
    private static void drawContour(double a, double b) {
        for(int y = (int) a; y>0; y--){
            for(int x = 0; x< (int)b; x++) {
                if (y <= -(a / b * x) + a) {
                    if(y == 1 || x == 0 || y == -(a / b * x) + a){
                        System.out.printf(" %c ", contourSymbol);                    }
                    else {
                        System.out.printf(" %c ", emptiness);
                    }
                }
                else {
                    System.out.printf(" %c ", emptiness);
                }
            }
            System.out.print("\n");
        }
    }
    //заливка
    private static void fillFigure(double a, double b) {
        for(int y = (int) a; y>0; y--){
            for(int x = 0; x< (int)b; x++) {
                if (y <= -(a / b * x) + a) {
                    if(y == 1 || x == 0 || y == -(a / b * x) + a){
                        System.out.printf(" %c ", emptiness);
                    }
                    else {
                        System.out.printf(" %c ", fillSymbol);
                    }
                }
                else {
                    System.out.printf(" %c ", emptiness);
                }
            }
            System.out.print("\n");
        }
    }
    //полная фигура
    private static void drawFilledFigure(double a, double b) {
        for(int y = (int) a; y>0; y--){
            for(int x = 0; x< (int)b; x++) {
                if (y <= -(a / b * x) + a) {
                    if(y == 1 || x == 0 || y == -(a / b * x) + a){
                        System.out.printf(" %c ", contourSymbol);
                    }
                    else {
                        System.out.printf(" %c ", fillSymbol);
                    }
                }
                else {
                    System.out.printf(" %c ", emptiness);
                }
            }
            System.out.print("\n");
        }
    }
}
