package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max = 100;
        int min = -100;

        for (int i = 0; i < 100; i++) {
            MyTreeMap<Integer, String> map = new MyTreeMap<>();
            Random r = new Random();
            while (map.heightOfBinaryTree() < 6) {
                int key = r.nextInt(max - min + 1) + min;
                String value = String.valueOf(key);
                map.put(key, value);
            }
            System.out.println(map.isHeightBalanced());
        }


//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(5, "five");
//        map.put(4, "four");
//        map.put(3, "three");

//        System.out.println(map.minKey());
//        System.out.println(map.maxKey());

//        System.out.println(map.get(3));
//        map.put(3, "tttrrreee");
//        System.out.println(map.get(3));
//
//        map.deleteMin();

//        map.delele(4);
//        System.out.println(map.get(4));

//        System.out.println(map);
    }
}
