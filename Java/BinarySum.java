package Java;

import java.util.Scanner;

public class BinarySum {
    static void binarySum(int[] arr1, int[] arr2, int size) {
        int[] ans = new int[size + 1];
        int temp, i, carry = 0;
        for (i = 0; i < size; i++) {
            temp = carry + arr1[i] + arr2[i];
            ans[i] = temp % 2;
            if (temp >= 2)
                carry = 1;
            else
                carry = 0;
        }
        ans[size] = carry;
        for (i = size; i >= 0; i--) {
            System.out.print(ans[i]);
            System.out.print(' ');
        }
    }

    public static void main(String[] args) {
        int size, i;
        Scanner scn = new Scanner(System.in);
        size = scn.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        try {
            for (i = 0; i < size; i++) {
                arr1[i] = scn.nextInt();
            }
            for (i = 0; i < size; i++) {
                arr2[i] = scn.nextInt();
            }
        } finally {
            scn.close();
        }
        binarySum(arr1, arr2, size);
        scn.close();
    }
}
