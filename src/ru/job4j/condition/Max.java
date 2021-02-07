package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
        // return left > right ? left : right; короткий вариант написания кода
    }
}


