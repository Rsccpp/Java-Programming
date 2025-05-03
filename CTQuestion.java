// Qno.1
// public class CTQuestion {
// public static void main(String[] args) {
// int f = 0;
// int g = 1;
// for (int i = 0; i <= 5; i++) {
// System.out.println(f);
// f = f + g;
// g = f - g;
// }
// }
// }
// output :
// 0
// 1
// 1
// 2
// 3
// 5

// Qno.2

// class Parents {
// int a = 40;
// int b = 20;
// }

// public class CTQuestion extends Parents {

// int a = 100;
// int b = 200;

// void add(int a, int b) {
// System.out.println(a + this.b + -super.a); // 10 + 200 - 40 = 170
// }

// public static void main(String[] args) {
// CTQuestion child = new CTQuestion();
// child.add(10, 30);
// }
// }
// o/p: 170

// Qno.3

// public class CTQuestion {

// public static void main(String[] args) {
// int N = Integer.parseInt(args[0]);
// int v = 1;
// while (v <= N / 2) {
// v = 2 * v;
// }
// System.out.println(v);
// }
// }
// o/p: 8

//
