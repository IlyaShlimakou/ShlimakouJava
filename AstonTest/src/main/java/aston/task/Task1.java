package aston.task;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число\n");
        while (!in.hasNextInt()) {
            System.out.println("Ошибка.Вы ввели не число. Повторите");
            in.next();
        }
        int checkNumber;
        checkNumber = in.nextInt();
        if (checkNumber > 7) {
            System.out.print("Привет\n");
            in.next();
        }else {
            System.out.println("Ошибка.Число меньше 7");
        }
    }
}






