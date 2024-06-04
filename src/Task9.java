import java.util.Random;
import java.util.Scanner;


public class Task9 {
    void task1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        double[] nums = new double[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.print("nums[" + i + "] = ");
            nums[i] = scanner.nextDouble();
        }

        double[] numsX = new double[n];
        for (int i = 0; i < n; i ++) {
            numsX[i] = nums[i];
            if (i%2!=0){
                numsX[i] = numsX[i] + 1;
            }
        }

        System.out.println("\nТаблица:");
        System.out.println(" Номер элемента | Исходное значение  |  Новое значение");
        for (int i = 0; i < n; i++) {
            System.out.printf("%10d      |%19.2f | %15.2f\n", (i + 1), nums[i], numsX[i]);
        }
    }
    void task2(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = 20;
        double[] nums = new double[n];
        double x;
        double[] numz = new double[n];
        double y;
        for (int i = 0; i < n; i++) {
            double minValue = 1;
            double maxValue = 3;

            x = minValue + random.nextDouble() * (maxValue - minValue);
            nums[i] = x;
        }
        for (int i = 0; i < n; i++) {
            y = Math.pow(nums[i], 2) - Math.pow(Math.cos(Math.PI*nums[i]),2);
            numz[i] = y;
        }
        System.out.println(" Изначальный массив | Полученный массив  ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%19.6f | %15.6f\n", nums[i], numz[i]);
        }

        double sumPositive =0;
        double sumNegative =0;
        double averagePositive =0;
        int countPositive =0;
        int countNegative =0;

        for (int i = 0; i < n; i++) {
            if(nums[i] > 0){
                sumPositive += numz[i];
                countPositive++;
            }
            if(nums[i] > 0){
                sumNegative += numz[i];
                countNegative++;
            }
        }
        averagePositive = sumPositive / n;

        System.out.printf("Накопленное значение: %.2f\n", sumPositive);
        System.out.println("Средне знач. полож. : " + averagePositive);
    }
    void task2_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шаг (от 0.1 до 0.5): ");
        double step = scanner.nextDouble();

        int n = 20;
        double[] nums = new double[n];
        double[] numz = new double[n];

        for (int i = 0; i < n; i++) {
            nums[i] = 1 + i * step;
            if (nums[i] > 3) {
                nums[i] = 3;
            }
        }

        for (int i = 0; i < n; i++) {
            numz[i] = Math.pow(nums[i], 2) - Math.pow(Math.cos(Math.PI * nums[i]), 2);
        }

        System.out.println(" Изначальный массив | Полученный массив  ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%19.6f | %15.6f\n", nums[i], numz[i]);
        }

        double sumPositive = 0;
        double sumNegative = 0;
        double averagePositive = 0;
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                sumPositive += numz[i];
                countPositive++;
            }
            if (nums[i] < 0) {
                sumNegative += numz[i];
                countNegative++;
            }
        }

        averagePositive = sumPositive / countPositive;

        System.out.printf("Накопленное значение: %.2f\n", sumPositive);
        System.out.println("Средне знач. полож. : " + averagePositive);
    }
    void task3(){
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.print("Введите число: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Элемент не найден в массиве.");
        } else {
            System.out.println("Элемент " + target + " найден по индексу " + index);
        }

    }
    public int binarySearch(int[] arr, int target) {
        int a = 0;
        int b = arr.length - 1;
        int c;

        while (a <= b) {
            c = a + (b - a) / 2; // вычисление среднего элемента

            if (arr[c] == target) {
                return c;
            } else if (arr[c] < target) {
                a = c + 1;
            } else {
                b = c - 1;
            }
        }
        return -1;
    }


    void task4(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];

        System.out.println("Выберите способ заполнения массива:");
        System.out.println("1. Ввод с клавиатуры");
        System.out.println("2. Генерация случайных чисел");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) {
                    System.out.print("arr[" + i + "] = ");
                    arr[i] = scanner.nextDouble();
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    arr[i] = (random.nextDouble() * 100)-50;
                }
                System.out.println("Массив заполнен случайными числами.");
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.println("Полученный массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        double sum = 0;
        boolean foundLastPositive = false;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0 && !foundLastPositive) {
                foundLastPositive = true;
            }
            if (foundLastPositive) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов: " + sum);
    }

    void task5(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];

        System.out.println("Выберите способ заполнения массива:");
        System.out.println("1. Ввод с клавиатуры");
        System.out.println("2. Генерация случайных чисел");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) {
                    System.out.print("arr[" + i + "] = ");
                    arr[i] = scanner.nextDouble();
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    arr[i] = (random.nextDouble() * 100)-50;
                }
                System.out.println("Массив заполнен случайными числами.");
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.println("Полученный массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("Введите первый индекс: ");
        int first = scanner.nextInt();
        System.out.print("Введите последний индекс: ");
        int last = scanner.nextInt();

        if (first < 0 || first >= n || last < 0 || last >= n || first > last) {
            System.out.println("Некорректные индексы!");
            return;
        }

        int newLength = last - first + 1;
        double[] newArray = new double[newLength];

        for (int i = 0; i < newLength; i++) {
            newArray[i] = arr[first + i];
        }

        System.out.println("Новый массив:");
        for (int i = 0; i < newLength; i++) {
            System.out.println(newArray[i]);
        }
    }


}
