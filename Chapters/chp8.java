// Multithreading / multiprocessing

// A multithread program 
    //                 Main thread
    //       /               |                \
    // Thread1  <->       Thread2   <->      Thread3


// Java has built in support for multithreading
// 1. Synchronization                              |  currentThread  start  setPriority   | 
// 2. Thread scheduling                            |  yield    run   getPriority  sleep   |
// 3. Inter-thread communication                   |  stop   suspend  resume              |

// * Java Garbage collector is a low-priority thread 


// Running a thread in Java

//                      Thread
//                         /\
//     Extends                          Implements
//        |                                 |
//   Thread (class)                    Runnable (interface)
//         \                                   /
//                      Override
//                         |
//                    run() method



// 1. Example-- Thread class

// class ThreadA extends Thread {
//     public void run(){
//         for(int i=1; i<=5; i++){
//             System.out.println("From Thread A with i = " + -1*i);
//         }
//         System.out.println("Exiting from Thread A ....");
//     }
// }

// class ThreadB extends Thread {
//     public void run(){
//         for(int j=0; j<=5; j++){
//             System.out.println("From Thread B with j = "+ 2*j);
//         }
//         System.out.println("Exiting from Thread B ...");
//     }
// }

// class ThreadC extends Thread {
//     public void run() {
//         for(int k=0; k<=5; k++){
//             System.out.println("From Thread C with k = " + (2*k-1));
//         }
//         System.out.println("Exiting from Thread C ...");
//     }
// }

// public class chp8 {

//     public static void main(String[] args){
//         ThreadA a = new ThreadA();
//         ThreadB b = new ThreadB();
//         ThreadC c = new ThreadC();

//         a.start();
//         b.start();
//         c.start();
//         System.out.println("....Multithreading is over ");
//     }
// }


// 2. Example -- Runnable interface

class ThreadA implements Runnable {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("From ThreadA with i = " + i);
        }
        System.out.println("Exiting from Thread A ....");
    }
}

class ThreadB implements Runnable {
    public void run(){
        for(int j=0; j<=5; j++){
            System.out.println("From ThreadA with j = " + 2*j);
        }
        System.out.println("Exiting from Thread B ....");
    }
}

public class chp8 {

    public static void main(String[] args){
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}