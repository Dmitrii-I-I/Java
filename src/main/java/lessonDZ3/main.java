package lessonDZ3;

import java.text.DecimalFormat;
import java.util.*;
//  1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
//  2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//  3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

public class main {
    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
    }

    private static void task1() {
        System.out.println("Введите сначала размер массива, а затем верхнюю границу массива");
        int count = getNumber();
        int lastBound = getNumber();
        long time1 = timeRun();
//        List<Integer> numericList = new LinkedList<>();
//        numericList = createList(count, lastBound);
          List<Integer> numericList = createList(count, lastBound);
//
        printList(numericList, false);
        deleteEvenNumber(numericList);
        printList(numericList, true);
        System.out.printf("Время выполнения - %d", timeRun() - time1);
    }

    private static void task2() {
        System.out.println("Введите сначала размер массива, а затем верхнюю границу массива");
        int count = getNumber();
        int lastBound = getNumber();
        long time1 = timeRun();
        List<Integer> numericList = new ArrayList<>();
        numericList.addAll(createList(count, lastBound));
//            System.out.println(numericList.getClass());
        printList(numericList, false);
        List<Double> parameterList = new ArrayList<>();
        parameterList = getMathParameterList(numericList);
//            System.out.println(parameterList);
//            System.out.println(parameterList.getClass());
        printParameter3set(parameterList);
        System.out.printf("Время выполнения - %d", timeRun() - time1);

    }

    private static void task3() {
        System.out.println("Введите размер массива");
        int count = getNumber();
        long time1 = timeRun();
        List<String> beList = new ArrayList<>();
        int numericRandom = 100;
        createBeList(beList, count, numericRandom);
        System.out.println(beList);
        deleteEvenNumberInStringArray(beList);
        System.out.println(beList);
        System.out.printf("Время выполнения - %d", timeRun() - time1);
    }

    private static void deleteEvenNumberInStringArray(List<String> collection) {
        int i = 0;
//        System.out.println(collection.getClass());
        while (i < collection.size()) {
            if (isNumeric(collection.get(i))) {
                if (Integer.parseInt(collection.get(i)) % 2 == 0) {
                    collection.remove(i);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.equals("")) {
            System.out.println("Пустая строка");
            return false;
        }
        try {
            int values;
            values = Integer.parseInt(str);
//            values = Integer.valueOf(str);
            // str.isParsable(string) -> boolean (класс NumberUtils из Apache Commons)
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void createBeList(List<String> collection, int count, int lastBound) {
        String str = "абвгдеёжзийклмнопрстуфхцчшщЪыьэюя";
        Random rd = new Random();
        for (int i = 0; i < count; i++) {
            if (rd.nextBoolean()) {
                collection.add(String.valueOf(rd.nextInt(lastBound + 1)));
            } else {
                int start = rd.nextInt(str.length());
                int finish = rd.nextInt(str.length());
                if (start > finish) {
                    int third = start;
                    start = finish;
                    finish = third;
                }
                if (start != finish) {
                    collection.add(str.substring(start, finish));
                } else {
                    collection.add("СЮРПРИЗ");
                }
            }
        }
    }

    private static void printParameter3set(List<Double> parameterList) {
        DecimalFormat dF = new DecimalFormat("#.###"); // формат вида 74 554 542,22
        System.out.printf("Минимальное значение = %d\n", parameterList.get(0).intValue());
        System.out.printf("Максимальное значение = %d\n", parameterList.get(1).intValue());
//        System.out.println(parameterList.get(2).getClass());
        System.out.printf("Среднее арифметическое = %s\n", dF.format(parameterList.get(2)));
    }

    private static List<Double> getMathParameterList(List<Integer> numericList) {
        List<Double> parametersList = new ArrayList<>(2);
        double min = (double) numericList.get(0);
        double max = (double) numericList.get(0);
        double summa = 0;
        for (double item : numericList) {
            if (item > max) {
                max = item;
            } else if (item < min) {
                min = item;
            }
            summa += item;
        }
        parametersList.add(0, min);
        parametersList.add(1, max);
        parametersList.add(2, summa / numericList.size());
        return parametersList;
    }

    private static long timeRun() {
        return System.currentTimeMillis();
    }

    private static Integer getNumber() {
        boolean flag = true;
        while (flag) {
            System.out.print("Введите параметр: ");
            Scanner sc = new Scanner(System.in);
            int parameter = sc.nextInt();
            if (parameter > 0) {
                flag = false;
                return parameter;
            } else {
                System.out.println("Не корректно введены данные. Повторите ввод");
            }
        }
        return 1;
    }

    private static void printList(List<Integer> numericList, boolean typePrint) {
        if (typePrint) {
            for (int i = 0; i < numericList.size(); i++) {
                System.out.printf("элемент [%d] = %d\n", i, numericList.get(i));
            }
        } else {
            System.out.println(numericList);
        }
    }

    private static List<Integer> createList(int count, int lastBound) {
        List<Integer> valuesList = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < count; i++) {
            valuesList.add(rd.nextInt(lastBound + 1));
        }
        return valuesList;
    }

    private static void deleteEvenNumber(List<Integer> numericList) {
        int i = 0;
        while (i < numericList.size()) {
            if ((numericList.get(i) % 2) == 0) {
                numericList.remove(i);  // data.removeIf((n -> (n & 1) == 0)) - для ArrayList
            } else {
                i++;
            }
        }
    }
}
