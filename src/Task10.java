import java.util.Scanner;
import java.util.Random;

public class Task10 {
    void task1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол. строк: ");
        int rows = scanner.nextInt();;
        System.out.print("Введите кол. столбцов: ");
        int cols = scanner.nextInt();;

        char[][] charArray = new char[rows][cols];

        // Заполнение массива буквами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                charArray[i][j] = (char) ('a' + j); // Присваиваем букву, соответствующую номеру столбца
            }
        }

        // Вывод массива в виде таблицы
        System.out.print("    "); // Пустой столбец для выравнивания
        for (int j = 0; j < cols; j++) {
            System.out.print(j + "  "); // Вывод индексов столбцов
        }
        System.out.println();
        System.out.println("---------------------------------");

        for (int i = 0; i < rows; i++) {
            System.out.print(i + " | "); // Вывод индекса строки
            for (int j = 0; j < cols; j++) {
                System.out.print(charArray[i][j] + "  "); // Вывод элементов массива
            }
            System.out.println();
        }

        // Вывод элемента в левом нижнем углу массива
        System.out.println("Элемент в левом нижнем углу массива: " + charArray[rows - 1][0]);

        // a) Минимальный элемент в заданной строке
        System.out.print("Введите номер строки для поиска минимального элемента: ");
        int rowIndex = scanner.nextInt();
        char minChar = Character.MAX_VALUE;
        for (int j = 0; j < cols; j++) {
            if (charArray[rowIndex][j] < minChar) {
                minChar = charArray[rowIndex][j];
            }
        }
        System.out.println("Минимальный элемент в строке " + rowIndex + ": " + minChar);

        // б) Максимальный элемент в указанном столбце
        System.out.print("Введите номер столбца для поиска максимального элемента: ");
        int colIndex = scanner.nextInt();
        char maxChar = Character.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            if (charArray[i][colIndex] > maxChar) {
                maxChar = charArray[i][colIndex];
            }
        }
        System.out.println("Максимальный элемент в столбце " + colIndex + ": " + maxChar);

        // в) Заданное значение среди элементов, лежащих на диагонали
        System.out.print("Введите значение для поиска на диагонали: ");
        char target = scanner.next().charAt(0);
        boolean found = false;
        int minDim = Math.min(rows, cols);
        for (int i = 0; i < minDim; i++) {
            if (charArray[i][i] == target) {
                found = true;
                break;
            }
        }
        System.out.println("Элемент " + target + (found ? " найден" : " не найден") + " на диагонали.");
    }


    void task2(){
        int[][] originalArray = generateArray(7, 7, -10, 10);
        System.out.println("Исходный массив:");
        printArray(originalArray);

        int[][] transposedArray = transposeArray(originalArray);
        System.out.println("\nТранспонированный массив:");
        printArray(transposedArray);

        int sumOfThirdRow = getSumOfThirdRowLessThanTwentyFive(originalArray);
        System.out.println("\nСумма элементов третьей строки массива, не превышающих 25: " + sumOfThirdRow);

        int rowNeighbors = countEqualRowNeighbors(originalArray);
        int colNeighbors = countEqualColumnNeighbors(originalArray);
        int allNeighbors = countEqualAllNeighbors(originalArray);
        System.out.println("Количество пар одинаковых соседних элементов в строках: " + rowNeighbors);
        System.out.println("Количество пар одинаковых соседних элементов в столбцах: " + colNeighbors);
        System.out.println("Количество пар одинаковых соседних элементов во всем массиве: " + allNeighbors);

        int[] maxCoordinates = findMaxElementCoordinates(originalArray);
        System.out.println("Координаты максимального элемента: [" + maxCoordinates[0] + ", " + maxCoordinates[1] + "]");
    }

    int[][] generateArray(int rows, int cols, int minValue, int maxValue) {
        int[][] array = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(maxValue - minValue + 1) + minValue;
            }
        }

        return array;
    }

    // Транспонирование массива
    int[][] transposeArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
    }

    // Вывод двумерного массива на экран
    void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Вычисление суммы элементов третьей строки массива, не превышающих 25
    int getSumOfThirdRowLessThanTwentyFive(int[][] array) {
        int sum = 0;
        int thirdRow = 2; // Индекс третьей строки равен 2

        for (int j = 0; j < array[0].length; j++) {
            if (array[thirdRow][j] < 25) {
                sum += array[thirdRow][j];
            }
        }

        return sum;
    }

    int countEqualRowNeighbors(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            for (int j = 0; j < row.length - 1; j++) {
                if (row[j] == row[j + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    int countEqualColumnNeighbors(int[][] arr) {
        int count = 0;
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    int countEqualAllNeighbors(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < arr.length - 1 && arr[i][j] == arr[i + 1][j]) {
                    count++;
                }
                if (j < arr[i].length - 1 && arr[i][j] == arr[i][j + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    int[] findMaxElementCoordinates(int[][] arr) {
        int maxRow = 0;
        int maxCol = 0;
        double maxValue = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= maxValue) {
                    maxValue = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                } else if (arr[i][j] == maxValue) {
                    // Если значение равно максимальному, но строка ниже
                    if (i > maxRow) {
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }
        }

        return new int[]{maxRow, maxCol};
    }

    void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n для треугольника Паскаля: ");
        int n = scanner.nextInt();

        int[][] pascalTriangle = generatePascalTriangle(n);
        System.out.println("Треугольник Паскаля:");

        for (int[] row : pascalTriangle) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }    }

    int[][] generatePascalTriangle(int n) {
        int[][] triangle = new int[n][];

        triangle[0] = new int[]{1};

        for (int i = 1; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // Первый элемент каждой строки равен 1
            triangle[i][i] = 1; // Последний элемент каждой строки равен 1

            // Вычисляем значения между первым и последним элементами
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }


    void task4(){
        int[][] scores = new int[20][5]; // Создаем двумерный массив для хранения баллов

        // Заполняем массив случайными значениями от 0 до 100
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                scores[i][j] = random.nextInt(101);
            }
        }

        // Выводим двумерный массив на экран
        System.out.println("Баллы спортсменов:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Спортсмен " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        int thirdAthleteSum = 0;
        for (int j = 0; j < 5; j++) {
            thirdAthleteSum += scores[2][j]; // Суммируем баллы третьего спортсмена (индекс 2) по всем видам спорта
        }

        System.out.println("Общая сумма баллов, набранных третьим спортсменом: " + thirdAthleteSum);
    }
}
