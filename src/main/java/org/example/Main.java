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

        Knapsack();
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

        /*0-1 Knapsack
● Question: Given a list of items with values and weights, as well as a max weight,
find the maximum value you can generate from items where the sum of the
weights is less than the max.
● Eg.
items = {(w:1, v:6), (w:2, v:10), (w:3, v:12)}
maxWeight = 5
knapsack(items, maxWeight) = 22
         */
    private static void Knapsack(){
        int[] weight = {1,2,3};
        int [] value = {6,10,12};
        int maxWeight = 5;
        int [] [] dp = new int[weight.length+1][maxWeight+1];
        for(int i=1;i<=weight.length;i++){
            for(int j=1;j<=maxWeight;j++){
                if(weight[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],value[i-1]+dp[i-1][j-weight[i-1]]);
                }
            }
        }
        System.out.println("Maximum value for knapsack with weight " + maxWeight + " is: " + dp[weight.length][maxWeight]);

    }
    }