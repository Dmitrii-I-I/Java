package lessonDZ1;
import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер ДЗ (1 или 2 или 3): ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                // Задать одномерный массив и найти в нем минимальный и максимальный элементы
                System.out.println("ДЗ №1 Задание №1");
                System.out.print("Введите размер массива: ");
                int inputCount = in.nextInt();
                int[] array = CreateArrayAndPrint(inputCount);
                PrintArrayInt(array);
                System.out.println(ReturndMinAndMaxInArray(array));
                break;
            case 2:
                // Написать метод, который определяет, является ли год високосным, и возвращает boolean
                // (високосный - true, не високосный - false). Каждый 4-й год является високосным,
                // кроме каждого 100-го, при этом каждый 400-й – високосный.
                System.out.println("ДЗ №1 Задание №2");
                System.out.print("Введите год: ");
                int inputYear = in.nextInt();
                if (ReturnLeapYear(inputYear)) {
                    System.out.printf("Год %d високосный", inputYear);
                } else {
                    System.out.printf("Год %d НЕ високосный", inputYear);
                }
                break;
            case 3:
                //Дан массив nums = [3, 2, 2, 3] и число val = 3.
                //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
                //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
                System.out.println("ДЗ №1 Задание №3");
                int[] arrayFix = {3, 2, 1, 0, 3, 2, 3, 7};
                PrintArrayInt(arrayFix);
                System.out.print("Введите число: ");
                int inputValues = in.nextInt();
                arrayFix = SortArrayBubble(arrayFix, inputValues);
                PrintArrayInt(arrayFix);
                break;
            default:
                System.out.println("Задание не выбрано.");
        }
        in.close();
    }

    private static int[] SortArrayBubble(int[] array, int values) {
        int glass = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == values) {
                for (int j = i; j < array.length - 1; j++) {
                    glass = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = glass;
                }
            }
        }
        return array;
    }

    private static boolean ReturnLeapYear(int year) {
        if ((year % 4 == 0 & year % 100 != 0) | year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String ReturndMinAndMaxInArray(int[] array) {
        if (array.length == 0) {
            return "Массив пуст!";
        }
        int iMin = 0;
        int iMax = 0;
        int Min = array[0];
        int Max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                iMax = i;
                Max = array[i];
            } else if (array[i] < Min) {
                iMin = i;
                Min = array[i];
            }
        }
        return "Минимальный элемент [" + iMin + "] = " + Min + ", Максимальный элемент [" + iMax + "] = " + Max;
    }

    public static int[] CreateArrayAndPrint(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            //System.out.printf("%d, ", array[i]);
        }
        return array;
    }

    private static void PrintArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}