package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length);
        }

        int[][] variant = {{1}, {2, 8}, {4, 5, 3}, {7, 8, 9, 3}};
        for (int i = 0; i < variant.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + variant[i].length);
        }
    }
}




