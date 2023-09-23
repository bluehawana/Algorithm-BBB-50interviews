package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* 1. median of Arrays
        Question : Find the median of two sorted arrays.
● Eg.
arr1 = [1, 3, 5]
arr2 = [2, 4, 6]
median(arr1, arr2) = 3.5
         */
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] arr3 = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        java.util.Arrays.sort(arr3);
        System.out.println(java.util.Arrays.toString(arr3));

        System.out.println("Median of arrays is : " + findMedian(arr3));
    }
    private static double findMedian(int[] arr3) {
        int length= arr3.length;
        if(length%2==0){
            return (double) (arr3[length/2]+arr3[length/2-1])/2;
        }
        else{
            return arr3[length/2];
        }

        }
    }