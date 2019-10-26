package com.epam;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
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
        newArray(array);
    }
    public static int[] createArray(int size){
        Random random = new Random();
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = random.nextInt(200) - 100;
        }
        return arr1;
    }
    public static void newArray(int[] array) {
        int[] pos = new int[0];
        int[] neg = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]> 0) {
                pos = Arrays.copyOf(pos, pos.length + 1);
                pos[pos.length - 1] = array[i];
            } else {
                neg = Arrays.copyOf(neg, neg.length + 1);
                neg[neg.length - 1] = array[i];
            }
        }
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
    }
}



