import java.util.Scanner;

public class ReleaseCar {
    Scanner scanner = new Scanner(System.in);
    private Car car = new Car();

    private void displayMenu() {
        System.out.println("Меню:");
        System.out.println("Создать новую машину (1)/ показать имеющуюся (2)/ завершить программу (3)");
    }

    public void vkuscar() {
        int k;
        do {
            displayMenu();
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    create();
                    break;
                case 2:
                    pocaz();
                    break;
                case 3:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Завершение программы.");
            }
        } while (k != 3);
    }

    public void create() {
        System.out.println("Введите название машины: ");
        String a = scanner.next();
        System.out.println("Введите скорость в км/ч ");
        int b = scanner.nextInt();
        System.out.println("Введите вес машины ");
        int c = scanner.nextInt();
        car.setName(a);
        car.setKmchas(b);
        car.setWeight(c);
    }

    public void pocaz() {
        System.out.println("Получившаяся машина: ");
        System.out.println("Название: " + car.getName());
        System.out.println("Скорость: " + car.getKmchas() + " км/ч");
        System.out.println("Вес: " + car.getWeight() + " кг");
    }
}