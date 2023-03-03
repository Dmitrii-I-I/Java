package lesson1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        InputName();
        //printMaxNumber();
    }

    private static void printMaxNumber() {
//    Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        // int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) { // for (int i: arr){
            if (arr[i] == 1) {
                count++;
                if (count > max) max = count;
            } else {
                count = 0;
            }
        }
        System.out.printf("Максимальное колво 1 = ( %d )", max);
    }


    //    Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    public static void InputName() {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String word = iScaner.nextLine();
        System.out.printf("Привет %s", word);
        iScaner.close();
    }

}
