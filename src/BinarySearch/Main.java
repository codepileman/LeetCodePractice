package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 35, 55};
//        int capacity = 100000000;
//        int[] intArray = new int[capacity];
//        Random r = new Random();
//        for (int i = 0; i < capacity; i++) {
//            if(i == 2){
//                intArray[i] = 55;
//            }else{
//                intArray[i] = r.nextInt(capacity);
//            }

//        }

        Arrays.sort(intArray);
//
//        for (int i = 0; i < capacity; i++) {
//            System.out.println(i + " i is " + intArray[i]);
//        }
        System.out.println(recursiveBinarySearch(intArray, 0, intArray.length, 7));
        System.out.println(recursiveSearch(intArray, 0, intArray.length, 55));


    }

    public static int recursiveSearch(int[] input, int start, int end, int value){
        if(start == end){
            return -1;
        }

        int mid = (start + end) / 2;

        if(input[mid] == value){
            return mid;
        }

        if(input[mid] < value){
            return recursiveSearch(input, start, mid, value);
        }else{
            return recursiveSearch(input, mid + 1, end, value);
        }

    }







    public static int recursiveBinarySearch(int[] input, int start, int end, int value){

        if(start >= end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(input[mid] == value){
            return mid;
        }
        else if(input[mid] > value){
            return recursiveBinarySearch(input, start, mid, value);
        } else{
            return recursiveBinarySearch(input, mid + 1, end, value);
        }


    }

}
