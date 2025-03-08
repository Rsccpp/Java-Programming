package Demonstrations.Demonstration8;

// Creating threads using the Thread class.

class ThreadA extends Thread {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("From Thread A with i = " + -1*i);
        }
        System.out.println("Exiting from Thread A ....");
    }
}

class ThreadB extends Thread {
    public void run(){
        for(int j=0; j<=5; j++){
            System.out.println("From Thread B with j = "+ 2*j);
        }
        System.out.println("Exiting from Thread B ...");
    }
}

class ThreadC extends Thread {
    public void run() {
        for(int k=0; k<=5; k++){
            System.out.println("From Thread C with k = " + (2*k-1));
        }
        System.out.println("Exiting from Thread C ...");
    }
}

public class Program1 {

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
