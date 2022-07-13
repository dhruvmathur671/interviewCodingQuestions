import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static int size = 10;

    public static void generateArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * size);

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
    public static void main(String[] args) {
        int[] array = new int[size];
        String choice = "Reset";
        switch (choice) {
            case "Reset":
                generateArray(array);
                printArray(array);
                sortArray(array);
                System.out.println();
                printArray(array);
                break;
            case "Print All":
                printArray(array);
                break;
            case "Sort":
                sortArray(array);
                break;
        }
    }
}