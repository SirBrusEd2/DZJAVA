import java.util.Scanner;

public class Musor {
    public void ttry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Индекс элемента [" + i + "]");
            mass[i] = scanner.nextInt();
        }
        System.out.print("Хотите узнать числа в массиве? ");
        System.out.println("Да (1) /Нет (2) ");
        int k = scanner.nextInt();
        switch (k){
            case 1:
                for(int i = 0; i < n; i++){
                    System.out.println("Индекс элемента [" + i + "]" + "  Значение: " + mass[i]);
                }
                break;
            case 2:
                System.out.print("Конец программы");
        }
    }
    public class Human {
        public int age;
        public int length;
        public int weight;

        public static void trry(Human human) {
            human.age = 3;
            human.length = 120;
            human.weight = 20;
            System.out.println(human.age + ", " + human.length + ", " + human.weight);
        }
    }
}


