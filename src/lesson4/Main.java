package lesson4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("one");
        mll.insertFirst("two");
        mll.insertFirst("three");
        mll.insertFirst("four");

////        System.out.println(mll.removeFirst());
////
////        System.out.println(mll.removeLast());
////        System.out.println(mll.removeLast());
//        System.out.println(mll);
////        mll.insertLast("four");
////        System.out.println(mll);
//
//        mll.insert(1, "four");
//        System.out.println(mll);
//
//        mll.remove("one");
//        System.out.println(mll);
//
////        for (String s : mll) {
////            System.out.println(s);
////        }

        ListIterator<String> li = mll.listiterator();
        while(li.hasNext()){
            System.out.println(li.next() + ". next index " + li.nextIndex() + ", prev index " + li.previousIndex());
        }
        System.out.println();
        while(li.hasPrevious()){
            System.out.println(li.previous() +  ". next index " + li.nextIndex() + ", prev index " + li.previousIndex());
        }
//        System.out.println();
//        while(li.hasNext()){
//            System.out.print(li.next()+" ");
//        }
//        System.out.println();
//        while(li.hasPrevious()){
//            System.out.print(li.previous()+" ");
//        }
//
//

//        System.out.println("size = "+mll.size());
//
//        System.out.println(li.next());
//        System.out.println("nextIndex "+li.nextIndex());
//        System.out.println("previousIndex "+ li.previousIndex());
//
//        li.remove();
//        System.out.println(mll);
//
//        System.out.println("nextIndex "+li.nextIndex());
//        System.out.println("previousIndex "+ li.previousIndex());
//        System.out.println("size = "+mll.size());
//
//        System.out.println(li.next());
//        li.remove();
//        System.out.println(mll);
//        System.out.println("nextIndex "+li.nextIndex());
//        System.out.println("previousIndex "+ li.previousIndex());
//        System.out.println("size = "+mll.size());
//
//        System.out.println(li.next());
////        li.remove();
//        System.out.println(mll);

        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<>();
        myLinkedStack.push("z");
        myLinkedStack.push("k");
        myLinkedStack.push("v");
        System.out.println(myLinkedStack.toString());

        myLinkedStack.pop();
        System.out.println(myLinkedStack.toString());

        MyLinkedQueue<Integer> myLinkedQueue = new MyLinkedQueue<>();
        myLinkedQueue.insert(1);
        myLinkedQueue.insert(2);
        myLinkedQueue.insert(3);
        System.out.println(myLinkedQueue.toString());

        myLinkedQueue.remove();
        System.out.println(myLinkedQueue.toString());
    }
}
