package lessonDZ6;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;

// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков (ArrayList).
// 3. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям. Например, спросить у
// пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию
public class main {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("ASUS", "XX-501", "black", "1.3*4", "16.0", "500", "15.0", "TFT", "Win10");
        Notebook note2 = new Notebook("ASUS", "XX-502", "white", "2.6", "8.0", "500", "17.0", "LTE", "WinX");
        Notebook note3 = new Notebook("HP", "XX-501", "green", "1.3*4", "8.0", "1000", "17.0", "TFT", "Linux");
        Notebook note4 = new Notebook("HP", "XX-503", "yellow", "3.6", "16.0", "500", "17.0", "TFT", "Win10");
        Notebook note5 = new Notebook("Lenovo", "XX-504", "red", "4*4", "32.0", "1000", "18.0", "LTE", "WinX");
        List<Notebook> list = new ArrayList<>();
        list.addAll(List.of(note1, note2, note3, note4));
        list.add(note5);
        boolean flag = true;
        while (flag) {
            printNotes(list);
            Map<String, String> criteria = loadCriteria();
//            System.out.printf("%s | %s\n", criteria.keySet(), criteria.values());
            sortList(list, criteria);
            System.out.println("Для выхода нажмите 1, иначе любую цифру");
            if (scan().equals("1")) {
                flag = false;
            }
        }
    }

    private static void sortList(List<Notebook> list, Map<String, String> criteria) {
        Set<Notebook> tempSet = new HashSet<>();
        tempSet.addAll(list);
        System.out.println(criteria);
        for (Notebook item : tempSet) {
            if (criteria.containsKey("1")
                    && criteria.get("1").equalsIgnoreCase(item.getFirmName())) {
                System.out.println(item.printShot());
            } else if (criteria.containsKey("2")
                    && criteria.get("2").equalsIgnoreCase(item.getColor())) {
                System.out.println(item.printShot());
            } else if (criteria.containsKey("3")
                    && criteria.get("3").equalsIgnoreCase(item.getScreenSize())) {
                System.out.println(item.printShot());
            } else if (criteria.containsKey("4")
                    && criteria.get("4").equalsIgnoreCase(item.getRam())) {
                System.out.println(item.printShot());
            } else if (criteria.containsKey("5")
                    && criteria.get("5").equalsIgnoreCase(item.getHddValues())) {
                System.out.println(item.printShot());
            }
        }
    }

    private static String scan() {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        return value;
    }

    private static Map<String, String> loadCriteria() {
        Map<String, String> criteria = new HashMap<>();
        System.out.println("Выберите параметр: \n" +
                "1 - Бренд\n" +
                "2 - Цвет\n" +
                "3 - Размер экрана\n" +
                "4 - Размер ОЗУ\n" +
                "5 - Размер диска");
        System.out.print("=> ");
        String key = scan();
        System.out.print("введите значение параметра: ");
        System.out.print("=> ");
        String value = scan();
        criteria.put(key, value);
        return criteria;
    }

    private static void printNotes(List<Notebook> lists) {
        for (Notebook item : lists)
            System.out.println(item.printShot());
    }
}
