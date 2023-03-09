package lessonDZ2;
import java.util.Scanner;

//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку
// в простой текстовый файл, обработайте исключения.
public class main1() {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово:");
        StringBuilder sb = new StringBuilder();
        sb.append(in.next());
        System.out.println(sb);
//        checkPolindrom();

//
//    private static void checkPolindrom(String word) {
//
//    }
    }
}