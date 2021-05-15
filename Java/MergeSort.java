package Java;

import java.util.Scanner;

public class MergeSort {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }

    static void merge(int[] arr, int p, int q, int r) {
        int i, j = 0, k = 0;
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for (i = 0; i < n1; i++) {
            L[i] = arr[p + i];
        }
        for (i = 0; i < n2; i++) {
            R[i] = arr[q + 1 + i];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        i = 0;
        for (k = p; k < r + 1; k++) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
        }

    }

    static void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            int size = scn.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scn.nextInt();
            }
            mergeSort(arr, 0, size - 1);
            printArray(arr);

        } finally {
            scn.close();
        }
    }
}