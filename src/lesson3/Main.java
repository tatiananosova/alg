package lesson3;


public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        System.out.println(reverse("1234"));

//        myStack.push("asd");
//        myStack.push("bnm");
//        myStack.push("cdfg");
//        myStack.push("dffghfghfg");
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(myStack.pop());
//        }


        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);

        System.out.println(myQueue.toString());

        myQueue.remove();

        System.out.println(myQueue.toString());

        Deque<Integer> deque = new Deque<>();
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(10);
        deque.insertRight(20);
        deque.insertRight(30);

        System.out.println(deque.toString());

        deque.removeLeft();
        deque.removeRight();

        System.out.println(deque.toString());

//        for (int i = 0; i < 4; i++) {
//            System.out.println(myStack.pop());
//        }

//        Expression expression = new Expression("(( [7] + {-8*a} + t ])");
//        System.out.println(expression.checkBracket());

//        MyQueue<Integer> myQueue = new MyQueue<>();
//        for (int i = 0; i < 5; i++) {
//            myQueue.insert(i*10);
//        }
//        System.out.println(myQueue);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(myQueue.remove());
//        }
//        System.out.println(myQueue);

//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//        mpq.insert(5);
//        mpq.insert(1);
//        mpq.insert(3);
//        mpq.insert(4);
//        mpq.insert(7);
//        mpq.insert(2);
//
//        System.out.println(mpq);
//        System.out.println(mpq.remove());
//        System.out.println(mpq);
//        mpq.insert(6);
//        System.out.println(mpq);

//        Deque<Integer> deque = new Deque<>();
//        for (int i = 0; i < 5; i++) {
//            deque.insertLeft(i * 10);
//        }
//        System.out.println(deque);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(deque.removeLeft());
//        }
//        System.out.println(deque);
    }

    public static String reverse(String str) {
        MyStack<Character> myStack = new MyStack<>();
        StringBuilder result = new StringBuilder();
        for (Character character : str.toCharArray()) {
            myStack.push(character);
        }
        while (!myStack.isEmpty()) {
            result.append(myStack.pop());
        }
        return result.toString();
    }

}
