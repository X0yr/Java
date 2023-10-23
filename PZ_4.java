import java.util.Scanner;

//public class Main{
//while циклы
// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = 1;
// while(y < x){
// System.out.println(y*y);
// y++;
// }
// }
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = sc.nextInt();
// int z;
// while (x <= y) {
// z = x;
// x++;
// System.out.println(z);
// }
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = sc.nextInt();
// System.out.println("");
// while (x <= y){
// if (x % 3 == 0 && 5 != 0) System.out.println(x);
// x++;
// }
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// boolean flag = true;
// int y = 0;
// int z = 0;
// while(flag){
// int x = sc.nextInt();
// if(x==0){
// break;
// }
// else{
// z += x;
// y++;
// }
// }
// System.out.println("Ср. Ариф. чисел равен: " + (z / y));
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// boolean flag = true;
// int y = 0;
// while (flag){
// int x = sc.nextInt();
// if (x >= y){
// y = x;
// }
// else if (x == 0){
// flag = false;
// }
// }
// System.out.println(y);
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = sc.nextInt();
// while (x <= y){
// if(x % 2 == 0)
// System.out.println(x);
// x++;
// }
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = 2;
// int z = 1000;
// while(y < x){
// if (x % y == 0){
// if (z >= y){
// z = y;
// }
// }
// y++;
// }
// System.out.println(z);
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = 1;
// int z = 0;
// while (y <= x){
// if (y == 1){
// z += y;
// }
// z += (y*y);
// y++;
// }
// System.out.println(z-1);
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = 1;
// int z = 0;
// while (x > 0){
// y = x % 10;
// z += y;
// x /= 10;
// }
// System.out.println(z);
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// int x = 0;
// int m = 0;

// while(true){
// int n = sc.nextInt();

// if (n == 0){
// break;
// }
// if (n > x){
// m = x;
// x = n;
// }
// else if(n > m){
// m = n;
// }
// }
// System.out.println("Значение второго по величине элемента " + m);
// }

//for циклы
// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// System.out.println("Введите число а: ");
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = 0;
// if(a<=b){
// for (int i = a; i <= b; i++){
// sum += i;
// System.out.println(sum);
// }
// }
// else{
// System.out.println("Введено неверное значение b");
// }
// }
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// boolean cube = false;
// for(;;){
// String word = sc.nextLine();
// if(word.equals("стоп")){
// break;
// }
// if(word.equals("куб")){
// cube = true;
// }
// }
// if(cube){
// System.out.println("YES");
// }
// else{
// System.out.println("NO");
// }
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// System.out.print("введите n кол-во чисел: ");
// int n = sc.nextInt();
// int min = 1000000;
// int max = 0;

// for(int i = 0; i < n; i++){
// System.out.println("введите число: ");
// int num = sc.nextInt();

// if(num < min){
// min = num;
// }
// if(num > max){
// max = num;
// }

// }
// System.out.println("Минимальное число: " + min);
// System.out.println("Максимальное число: " + max);
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// System.out.println("Введите число n: ");
// int n = sc.nextInt();
// if (n < 0){
// System.out.println("Ошибка");
// return;
// }
// int fact = 1;

// for(int i = 1; i <= n; i++){
// fact *= i;
//
//}
// System.out.println("n! = " + fact);
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// System.out.print("введите n кол-во натуральных чисел: ");
// int n = sc.nextInt();
// int x = 1;
// for(int i = 0; i < n; i++){
// System.out.print("продолжить ввод чисел, Стоп - КОНЕЦ");
// String word = sc.nextLine();
// if(word.equals("Стоп")){
// break;
// }
// else{
// System.out.println("\nвведите число");
// int num = sc.nextInt();
// if(num != 0){
// x *= num;
// }
// }
// }
// System.out.println("произведение ненулевых чисел: " + x);
// }

// public static void main(String[] agrs){
// Scanner sc = new Scanner(System.in);
// System.out.print("введите число N: ");
// int n = sc.nextInt();
// boolean flag = true;
// for(;n > 0; n /= 2){
// System.out.println("Число N: "+ (n % 2));
// }
// }

