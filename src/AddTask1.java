package com.epam;

import java.util.Arrays;
import java.util.Random;

public class AddTask1 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        int arr = sumElem(array);
        System.out.println(arr);
        int sum = sumElem(array);
        int[] arr1 = getNewArray(array, sum);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] createArray(){
        Random random = new Random();
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = random.nextInt(100);
        }
        return arr1;
    }

    public static int sumElem(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
    return sum / array.length;
    }
    public static int[] getNewArray(int[] array, int sum){
        int[] newArray = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= sum) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = array[i];
            }
        }
        return newArray;
    }
}