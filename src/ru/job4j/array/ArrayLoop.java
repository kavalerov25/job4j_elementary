package ru.job4j.array;

import java.util.List;

public class ArrayLoop {
        public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
//            System.out.println("");
//        List.of(1, 2, 3).stream().forEach(System.out::println);
    }
}