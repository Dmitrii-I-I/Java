package lessonDZ5;

import java.util.*;

public class main {
    public static void main(String[] args) {
        task1();  // 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     //   task2();  // 2. Пусть дан список сотрудников:***
                //    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
    }

    private static void task2() {
        List<String> listStaff = listData();
        printStaff(listStaff);
        printRating(listStaff);
    }

    private static void printStaff(List<String> list) {
        System.out.println("--- Сотрудники ---");
        int count = 0;
        for (String item : list) {
            System.out.println(item);
            count++;
        }
        System.out.printf("---Всего %d сотрудников ---%n", count);
    }



    private static void printRating(List<String> list) {
        Map<String, Integer> mapEmployee = new HashMap<>();
        for (String item : list) {
            List<String> itemList = Arrays.asList(item.split(" "));
            mapEmployee.put(itemList.get(0), mapEmployee.containsKey(itemList.get(0)) ? mapEmployee.get(itemList.get(0)) + 1 : 1);
        }
//        for (Map.Entry<String, Integer> itemMap : mapEmployee.entrySet()) {
//            System.out.println(itemMap);
//        }
        System.out.println("=== Сортировка по популярности ===");
        List<Map.Entry<String, Integer>> listSort = new ArrayList<>(mapEmployee.entrySet());
        Collections.sort(listSort, Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(listSort);
        int count = 0;
        for (Map.Entry<String, Integer> itemSort : listSort) {
            System.out.printf("%s - %d%n", itemSort.getKey(), itemSort.getValue());
            count += itemSort.getValue();
        }
        System.out.printf("---Всего %d сотрудников ---%n", count);
    }

    private static List<String> listData() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"));
        return list;
    }


    private static void task1() {
        Map<String, List<String>> phoneMap = new HashMap<>();
        boolean flag = true;
        while (flag) {
            switch (getMenu()) {
                case 1:
                    phoneMap.putAll(readData());
                    System.out.println("Данные считаны");
                    break;
                case 2:
                    if (!phoneMap.isEmpty()) {
                        for (Map.Entry<String, List<String>> entry : phoneMap.entrySet()) {
                            printAbonent(entry);
                        }
                    } else {
                        System.out.println("Справочник пуст");
                    }
                    break;
                case 3:
                    System.out.print("Введите аботента: ");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.next();
                    if (phoneMap.containsKey(name)) {
                        printAbonent2(name, phoneMap.get(name));
                    } else {
                        System.out.println("Данный абонент отсутствует");
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Не корректный ввод");
            }
        }
    }


    private static void printAbonent(Map.Entry<String, List<String>> abonent) {
        System.out.printf("Абонент: %s | номера: %s%n", abonent.getKey(), abonent.getValue());
    }

    private static void printAbonent2(String name, List<String> listPhones) {
//        System.out.printf("абонент: %s%nномера: %s%n", name, listPhones);
        System.out.printf("абонент: %s%n", name);
        for (String item : listPhones) {
            System.out.printf("номер - %s%n", item);
        }
    }

    private static Map<String, List<String>> readData() {
        Map<String, List<String>> phonePrev = new HashMap<>();
        phonePrev.put("Иванов", Arrays.asList("5555", "6666", "7777"));
        phonePrev.put("Петров", Arrays.asList("1111", "2222", "3333"));
        phonePrev.put("Сидоров", Arrays.asList("4444", "8888", "9999"));
        phonePrev.put("Пупкин", Arrays.asList("1234", "2345", "3456"));
        phonePrev.put("Мольцев", Arrays.asList("4567", "5678", "6789"));
        return phonePrev;
    }

    private static Integer getMenu() {
        System.out.println("------------------");
        System.out.printf("Введите пункт меню:%n" +
                "1 - считать данные;%n" +
                "2 - вывести список абонентов;%n" +
                "3 - найти абонента %n" +
                "4- выход%n");
        Scanner sc = new Scanner(System.in);
        System.out.print("=> ");
        return sc.nextInt();
    }

}
