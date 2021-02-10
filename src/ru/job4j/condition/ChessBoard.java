package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? Math.abs(x1 - x2) : 0; // лучший способ решить задание

           /* int rsl = 0;
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
            return rsl; */
        // длинный способ решить задание
        }
    }
