package ru.mirea.it;

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

    public static void main(String[] args) {
	// write your code here
        System.out.println(task5_9(1, 3, -1));

        new Task4().setVisible(true);
    }
}
