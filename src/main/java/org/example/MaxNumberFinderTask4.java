package org.example;
//Завдання 4:
//Напишіть метод, який повертає максимальне з чотирьох чисел.
//Числа передаються як параметри
public class MaxNumberFinderTask4 {
    public static int findMax(int num1, int num2, int num3, int num4) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num4 > max) {
            max = num4;
        }

        return max;
    }

    public static void main(String[] args) {
        int result = findMax(10, 5, 8, 12);
        System.out.println("Максимальне число: " + result);
    }
}
