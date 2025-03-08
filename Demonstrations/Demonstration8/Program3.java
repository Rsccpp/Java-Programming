package Demonstrations.Demonstration8;
import java.lang.Thread.*;

// 3. Using the thread methods : getID()

// class ThreadID extends Thread{
//     public void run(){
//         try{
//             // Displaying the thread that is running
//             System.out.println("Thread " + Thread.currentThread().threadId() + " is running");
//         }
//         catch (Exception e){
//             // Throwing exception
//             System.out.println("Exception is caught");
//         }
//     }
// }

// public class Program3 {

//     public static void main(String[] args){
//         int n = 8; // Number of threads
//         for(int i=0; i<n; i++){
//            ThreadID obj = new ThreadID();
//            obj.start();
//         }
//     }
// }


// Use of yield(), stop() and sleep() methods

class ThreadA extends Thread {
   
    public void run(){
        for(int i=1; i<=5; i++){

            if(i==1) Thread.yield();
            System.out.println("From Thread A with i = " + i);
        }
        System.out.println("Exiting from Thread A ....");
    }
}

class ThreadB extends Thread {
    private volatile boolean running = true;

    public void run(){
        
        for(int j=0; j<=5; j++){
            System.out.println("From Thread B with j = "+ j);
            // if(j==2) stop();         // not applicable in new Java version
            if(j==2) {
                running = false;
                break;
            }
        }
        System.out.println("Exiting from Thread B ...");
    }
}

class ThreadC extends Thread {
    public void run() {
        for(int k=0; k<=5; k++){
            System.out.println("From Thread C with k = " + k);
            if(k==1){
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e) {}
            }
        }
        System.out.println("Exiting from Thread C ...");
    }
}

public class Program3 {

    public static void main(String[] args){
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();

        a.start();
        b.start();
        c.start();
        System.out.println("....Multithreading is over ");
    }
}
