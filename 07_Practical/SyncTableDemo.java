/**
 * 7.3 Write a Java program where two threads print multiplication tables (e.g.,
 * Table of 5 and Table of 7). Use a synchronized method so that table outputs
 * do not mix and remain consistent.
 */

class TablePrinter {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadA extends Thread {
    TablePrinter t;
    ThreadA(TablePrinter t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class ThreadB extends Thread {
    TablePrinter t;
    ThreadB(TablePrinter t) {
        this.t = t;
    }
    public void run() {
        t.printTable(7);
    }
}

public class SyncTableDemo {
    public static void main(String[] args) {
        TablePrinter obj = new TablePrinter();

        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);

        t1.start();
        t2.start();
    }
}