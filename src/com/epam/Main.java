package com.epam;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        while (true){
            System.out.println("Enter size array -> ");
            size = sc.nextInt();
            if (size > 0){
                break;
            }
            System.out.println("Invalid size. Repeat!");
        }
        int[] array = createArray(size);
        System.out.println(Arrays.toString(array));
        int[] reverse = reverseArray(array);
        System.out.println(Arrays.toString(reverse));
    }
    public static int[] createArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static int[] reverseArray(int[] array){
        int[] reverse = new int[array.length];
        int x = 0;
        for (int i = array.length - 1; i >= 0; i--){
            reverse[x] = array[i];
            x++;
        }
        return reverse;
    }
}