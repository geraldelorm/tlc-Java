package com.functional;

public class Main {

    public static void main(String[] args) {
        System.out.println(c.call());
        System.out.println(s.call());
//        System.out.println(r.run());


        System.out.println(new DobleIt().apply(20));
        SquareOf5 squareOf5 = new SquareOf5();

        System.out.println(squareOf5.test(25));

        DobleIt dobleIt = new DobleIt();

    }

    public interface Callable<T, R> {
        public T call();
    }

    static Callable<Integer, Integer> c = new Callable<>() {
        @Override
        public Integer call() {
            return 10;
        }
    };

    static Callable<String, String> s = new Callable<>() {

        @Override
        public String call(){
            return "String";
        }
    };

    public interface Runnable {
        public void run();
    }

    static Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("I'm Runnable");
        }
    };
}
