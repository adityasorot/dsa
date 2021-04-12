package Java;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] arr, int size) {
        int key, j;
        for (int i = 1; i < size; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
            System.out.print(' ');
        }
    }

    public static void main(String[] args) {
        int size;
        Scanner scn = new Scanner(System.in);
        size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        insertionSort(arr, size);
        printArray(arr);
        scn.close();
    }
}