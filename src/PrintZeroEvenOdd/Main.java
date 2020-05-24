package PrintZeroEvenOdd;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class ZeroEvenOdd {
    private int n;
    private Semaphore zeroLock = new Semaphore(1);
    private Semaphore evenLock = new Semaphore(0);
    private Semaphore oddLock = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public void zero() throws InterruptedException {

        for(int i = 1; i <= n; i++){
            zeroLock.acquire();
            System.out.println(0);
            if(i % 2 == 0){
                evenLock.release();
            }else{
                oddLock.release();
            }
        }

    }

    public void even() throws InterruptedException {
        for(int i = 2; i <=n; i+=2){
            evenLock.acquire();
            System.out.println(i);
            zeroLock.release();
        }
    }

    public void odd() throws InterruptedException {
        for(int i = 1; i <=n; i+=2){
            oddLock.acquire();
            System.out.println(i);
            zeroLock.release();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(10);

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    zeroEvenOdd.zero();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    zeroEvenOdd.even();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    zeroEvenOdd.odd();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        executorService.shutdown();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd.zero();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd.odd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd.even();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }

}
