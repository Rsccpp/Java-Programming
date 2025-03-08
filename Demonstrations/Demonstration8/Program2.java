package Demonstrations.Demonstration8;

// 2. Creating threads implementing the Runnable interface.

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

public class Program2 {

    public static void main(String[] args){
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
