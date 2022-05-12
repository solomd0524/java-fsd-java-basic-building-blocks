package com.dell.simplilearn.threads;

public class ThreadDemo {
    public static class Counter extends Thread {
        private int SIZE;
        private int thread = 0;
        private String name;

        public Counter(int size, String name) {
            this.SIZE = size;
            this.name = name;
        }

        @Override
        public void run() {
            while (this.thread < SIZE) {
                this.thread++;
                System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
            }
            System.out.println("done counting," + this.name + "=" + this.thread);
        }
    }

    public static void main(String args[]) {
        int size = 1000;
        Counter counterA = new Counter(size, "CounterA");
        Counter counterB = new Counter(size, "CounterB");
        try {
            new Thread(counterA).start();
            Thread.sleep(1000);
            new Thread(counterB).start();
        } catch (Exception e) {
            // catching the exception
            System.out.println(e);
        }
    }
}
