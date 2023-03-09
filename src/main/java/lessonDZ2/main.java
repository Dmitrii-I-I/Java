package lessonDZ2;
import java.util.Scanner;

//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку
// в простой текстовый файл, обработайте исключения.
public class main {
    public static void main(String[] args) {
        System.out.print(" Домашнее задание №2\n" +
                "1. Задача 'Полиндром' \n" +
                "2. Задача 'Запись в файл и Исключения'\n" +
                "Введите пункт: ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            default:
                System.out.println("Не введен № задачи");
        }
    }
    private static void task2() {
        String str = makeWord(100,"TEST");
//        makeFileWord(makeFileWord(); Text.txt);
    }

    private static void makeFileWord() {

    }


    private static String makeWord(int circle, String word) {
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<circle; i++){
            sb.append(word);
        }
        return sb.toString();
    }


    private static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово:");
        String inWord = in.next();
        System.out.println(inWord);
        if (checkPolindrom(inWord)) {
            System.out.printf("Слово %s полиндром", inWord);
        } else {
            System.out.printf("Слово %s НЕ полиндром", inWord);
        }
    }

    private static Boolean checkPolindrom(String word) {
        Boolean flag = true;
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < wordArray.length / 2; i++) {
            if (wordArray[i] != wordArray[wordArray.length - i - 1]) {
                flag = false;
            }
        }
        return flag;
    }
}