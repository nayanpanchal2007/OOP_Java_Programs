/**
 * 7.4 Write a Java program where:
 * ● Thread 1 computes the sum of numbers from 1 to 1000.
 * ● Thread 2 computes the sum of numbers from 1001 to 2000.
 * ● Both threads should run in parallel.
 * ● Each thread should return its computed sum to the main method (e.g., using
 * a getter method or storing result in a shared variable).
 * ● The main method should wait for both threads to finish using join(), then
 * combine the two partial sums and print the final result.
 */

class SumThread extends Thread {
    int start, end;
    long sum = 0;

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    long getSum() {
        return sum;
    }
}

public class ParallelSum {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long total = t1.getSum() + t2.getSum();
        System.out.println("Final Sum: " + total);
    }
}