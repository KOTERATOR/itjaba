package ru.mirea.it;

import java.util.Scanner;

public class Main {

    private static int task5_9(int a, int b, int prev) {
        if (a == 0 && b == 0) {
            return 1;
        }
        else if (a < 0 || b < 0) {
            return 0;
        }

        if (prev == 0) {
            if (b != 0) {
                return task5_9(a, b - 1, 1);
            }
            else {
                return 0;
            }
        }
        else {
            return task5_9(a-1, b, 0) + task5_9(a, b-1, 1);
        }
    }

    private static void task5_15(int number) {
        if (number == 0)
            System.out.println(number + " ");
        else {
            System.out.print((number % 10) + " ");
            number = number / 10;
            if (number != 0)
                task5_15(number);
        }
    }

    private static int task5_19()
    {
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        if (value == 0)
            return 0;
        int nextMax = task5_19();
        return Math.max(nextMax, value);
    }

    public static void main(String[] args) {
        System.out.println(task5_19());
	    task5_15(0);
        System.out.println(task5_9(1, 3, -1));

        new Task4().setVisible(true);
    }
}
