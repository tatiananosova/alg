package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) {
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arr[i] *=3;
//            }
//        }

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//        for (String s : strarr) {
//            System.out.print(s);
//        }


//        String[] strarr = {"asd", "zxc", "qwe"};
//
//        System.out.println(Arrays.toString(strarr));
//
////        for (int i = 0; i < strarr.length; i++) {
////            strarr[i] += "0";
////        }
//
//        for (String s : strarr) {
//            s += "0";
//        }
//
//        System.out.println(Arrays.toString(strarr));


//        List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 2, 3, 56, 2, 4, 3, 2));

//        System.out.println(list);
////        list.removeIf(i -> i == 2);
////        list.removeAll(Arrays.asList(2));
////        list.replaceAll(i -> i*i);
////        list.remove((Integer) 2);
//
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(8);
//        mal.add(2);
//        System.out.println(mal);
//
//        mal.add(1, 99);
//        System.out.println(mal);
//
////        System.out.println(mal.remove(2));
//        System.out.println(mal.remove((Integer) 99));
//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(1);
//        msal.add(8);
//        msal.add(2);
//        msal.add(3);
//        System.out.println(msal);
//        msal.add(4);
//        System.out.println(msal);
//        System.out.println(msal.binaryIndexOf(1));


        Random r = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            mal.add(r.nextInt(100));
        }
        System.out.println("size " + mal.size());

        runWithTimeCount(MyArrayList::shuffle, mal, "Shuffle");
        runWithTimeCount(MyArrayList::insertionSort, mal, "Insertion sort");
        runWithTimeCount(MyArrayList::shuffle, mal, "Shuffle");
        runWithTimeCount(MyArrayList::selectionSort, mal, "Selection sort");
        runWithTimeCount(MyArrayList::shuffle, mal, "Shuffle");
        runWithTimeCount(MyArrayList::bubbleSort, mal, "Bubble sort");

        long time = System.currentTimeMillis();
//        mal.selectionSort();
// Sort time 10536 mls
//        mal.insertionSort();
// Sort time 9426 mls
//        mal.bubbleSort();
// Sort time 37507 mls
        System.out.println(System.currentTimeMillis() - time);

//        System.out.println(mal);

    }

    public static void runWithTimeCount(Consumer<MyArrayList<Integer>> consumer, MyArrayList<Integer> mal, String msg) {
        long time = System.currentTimeMillis();
        consumer.accept(mal);
        System.out.println(msg + " run time is: " + (System.currentTimeMillis() - time) + " ms");
    }
}
