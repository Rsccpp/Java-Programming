package Chapters;
// Multithreading / Multiprocessing

// A multithread program

// Main thread
// / | \
// Thread1 <-> Thread2 <-> Thread3

// Java has built in support for multithreading
// 1. Synchronization | currentThread start setPriority |
// 2. Thread scheduling | yield run getPriority sleep |
// 3. Inter-thread communication | stop suspend resume |

// * Java Garbage collector is a low-priority thread

// Running a thread in Java

// Thread
// /\
// Extends Implements
// | |
// Thread (class) Runnable (interface)
// \ /
// Override
// |
// run() method

// 1. Example-- Thread class

// class ThreadA extends Thread {
// public void run(){
// for(int i=1; i<=5; i++){
// System.out.println("From Thread A with i = " + -1*i);
// }
// System.out.println("Exiting from Thread A ....");
// }
// }

// class ThreadB extends Thread {
// public void run(){
// for(int j=0; j<=5; j++){
// System.out.println("From Thread B with j = "+ 2*j);
// }
// System.out.println("Exiting from Thread B ...");
// }
// }

// class ThreadC extends Thread {
// public void run() {
// for(int k=0; k<=5; k++){
// System.out.println("From Thread C with k = " + (2*k-1));
// }
// System.out.println("Exiting from Thread C ...");
// }
// }

// public class chp8 {

// public static void main(String[] args){
// ThreadA a = new ThreadA();
// ThreadB b = new ThreadB();
// ThreadC c = new ThreadC();

// a.start();
// b.start();
// c.start();
// System.out.println("....Multithreading is over ");
// }
// }

// 2. Example -- Runnable interface

// class ThreadA implements Runnable {
// public void run(){
// for(int i=0; i<=5; i++){
// System.out.println("From ThreadA with i = " + i);
// }
// System.out.println("Exiting from Thread A ....");
// }
// }

// class ThreadB implements Runnable {
// public void run(){
// for(int j=0; j<=5; j++){
// System.out.println("From ThreadA with j = " + 2*j);
// }
// System.out.println("Exiting from Thread B ....");
// }
// }

// public class chp8 {

// public static void main(String[] args){
// ThreadA a = new ThreadA();
// ThreadB b = new ThreadB();

// Thread t1 = new Thread(a);
// Thread t2 = new Thread(b);

// t1.start();
// t2.start();
// }
// }

// Thread Scheduling

// Example
// public class chp8 extends Thread {
// public void run(){
// for(int i=0; i<3; i++){
// try {
// sleep((int)(Math.random()) * 5000); // 5 sec
// System.out.println("loop i = " + i);
// }
// catch (InterruptedException e ){
// System.out.println(i);
// }
// }
// }

// public static void main(String[] args){
// new chp8().start();
// new chp8().start();

// System.out.println("Done");
// }
// }

// Data Races

// public class chp8 extends Thread {

// static int x;
// public void run(){
// for (int i=0; i<=500; i++){
// x = x + 1;
// x = x - 1;
// }
// }

// public static void main(String[] args){
// x = 0;
// for(int i=0; i<=500; i++){
// new chp8().start();
// System.out.println(x); // x not always 0!
// }
// }

// }

// Thread Priority

// * default priority is also known as NORM_PRIORITY

// Java allows users to change priority

// -- ThreadName.setPriority(int Number)
// * MIN_PRIORITY = 1
// * NORM_PRIORITY = 5
// * MAX_PRIORITY = 10

// Example --

// class A extends Thread {
// public void run(){
// System.out.println("Thread A started");
// for(int i=0; i<=4; i++){
// System.out.println(" From ThreadA: i = " + i);
// }
// System.out.println("Exit from A");
// }
// }

// class B extends Thread {
// public void run(){
// System.out.println("Thread B started");
// for(int j=0; j<=4; j++){
// System.out.println(" From ThreadB: j = " + j);
// }
// System.out.println("Exit from B");
// }
// }

// class C extends Thread {
// public void run(){
// System.out.println("Thread C started");
// for(int k=0; k<=4; k++){
// System.out.println(" From ThreadC: k = " + k);
// }
// System.out.println("Exit from C");
// }
// }

// public class chp8 {

// public static void main(String[] args){
// A threadA = new A();
// B threadB = new B();
// C threadC = new C();

// threadC.setPriority(Thread.MAX_PRIORITY);
// threadB.setPriority(threadA.getPriority() + 1);
// threadA.setPriority(Thread.MIN_PRIORITY);

// System.out.println("Started Thread A");
// threadA.start();

// System.out.println("Started Thread B");
// threadB.start();

// System.out.println("Started Thread C");
// threadC.start();

// System.out.println("End of main thread");
// }
// }

// Thread class : Join

// public class chp8 {

// public static void main(String[] args) {
// Thread t1 = new Thread(new R(1));
// Thread t2 = new Thread(new R(2));

// t1.start();
// t2.start();
// try {
// t1.join(); // waits until t1 has terminated
// t2.join(); // waits until t2 has terminated
// } catch (InterruptedException e) {
// System.out.println("Done");
// }
// }
// }

// Thread synchronization

// -- When two or more processes attempts to access a shared resource , it
// should be synchronized to avoid conflicts.

// Syntax : synchronized(object) {block of statements}

// Example: Banking transaction

// class Account {
// protected int balance;
// public int accountNo;

// void displayBalance(){
// System.out.println("Account No: " + accountNo + " Balance : " + balance);
// }

// // Method to deposit an amount
// synchronized void deposite(int amount) {
// balance = balance + amount;
// System.out.println(amount + " is deposited ");
// displayBalance();
// }

// // Method to withdraw an amount
// synchronized void withdraw(int amount){
// balance = balance - amount;
// System.out.println(amount + " is withdrawn");
// displayBalance();
// }
// }

// // To implement a thread for deposit
// class TransactionDeposite implements Runnable {
// Account accountX;
// int amount;

// // Constructor to initiate this thread
// TransactionDeposite (Account x, int amount) {
// accountX = x;
// this.amount = amount;
// new Thread(this).start();
// }
// public void run(){
// accountX.deposite(amount);
// }
// }

// // To implement a thread for withdraw
// class TransactionWithdraw implements Runnable {
// Account accountY;
// int amount;

// // Constructor to initiate this thread
// TransactionWithdraw (Account y, int amount) {
// accountY = y;
// this.amount = amount;
// new Thread(this).start();
// }
// public void run(){
// accountY.withdraw(amount);
// }
// }

// // Main class
// public class chp8 {

// public static void main(String[] args){
// // Create an account
// Account ab = new Account();

// // initialize the account by Rs 1000
// ab.balance = 1000;

// // a thread for deposite
// TransactionDeposite t1;
// // another thread for withdraw
// TransactionWithdraw t2;

// // Two threads are started
// t1 = new TransactionDeposite(ab, 500);
// t2 = new TransactionWithdraw(ab, 900);
// }
// }

// Instance methods

// public void push(int x ) {synchronized(this) {...}}
// public synchronized void push(int x) {....}