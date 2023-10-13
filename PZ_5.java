 import java.util.Scanner;
 public class PZ_5
 {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 int[] a = new int[n];
 int b = 0;
 for (int i = 0; i < n; i++){
 a[i] = s.nextInt();
 b += a[i];
 }
 System.out.println("Сумма элементов: " + b);
 for (int j = n-1; j >= 0; j--){
 System.out.print(a[j] + " ");
 }
 }
 }

// public class Main
// {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int[] a = new int[n];
// int b = 0;
// for (int i = 0; i < n; i++){
// a[i] = s.nextInt();
// if (a[i]%2 == 0) b += a[i];
// }
// System.out.println("Сумма элементов: " + b);
// for (int i = 0; i < n; i++){
// if (a[i]%2 == 0) System.out.print(a[i] + " ");
// }
// }
// }

// public class Main
// {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int[] x = new int[n];
// int a = s.nextInt();
// int b = s.nextInt();
// int c = 0;
// for (int i = 0; i < n; i++){
// x[i] = s.nextInt();
// }
// c = x[a];
// x[a] = x[b];
// x[b] = c;
// for (int i = 0; i < n; i++){
// System.out.println(x[i]);
// }
// }
// }

// public class Main
// {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int[] a = new int[n];
// int b = 0;
// for (int i = 0; i < n; i++){
// a[i] = s.nextInt();
// }
// int x = s.nextInt();
// for (int i = 0; i < n; i++){
// if (a[i] <= x) b = i + 2;
// }
// System.out.print(b);
// }
// }

// public class Main
// {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int[] a = new int[n];
// for (int i = 0; i < n; i++){
// a[i] = s.nextInt();
// }
// for (int i = 0; i < n; i++){
// int flag = 0;
// for (int j = 0; j < n; j++){
// if (i == j){
// continue;
// }
// else{
// if (a[i] == a[j]){
// flag = 1;
// break;
// }
// }
// }
// if (flag == 0) System.out.print(a[i] + " ");
// }
// }
// }

// public class Main
// {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int[] x = new int[n];
// int c = 0;
// for (int i = 0; i < n; i++){
// x[i] = s.nextInt();
// }
// for (int i = 0; i < n; i++){
// if (n%2 != 0 && i == (n-1)){
// System.out.print(x[i]);
// continue;
// }else if (i%2==0){
// c = x[i];
// x[i] = x[i+1];
// x[i+1] = c;
// System.out.println(x[i]);
// System.out.println(x[i+1]);
// }
// }
// }
// }

// public class Main
// {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int a = s.nextInt();
// int b = s.nextInt();
// int[] x = new int[b-a];
// for (int j = a; j < b; j++){
// x[j-a] = j*j;
// }
// int n = s.nextInt();
// int z;
// for (int i = 0; i < n; i++){
// z = s.nextInt();
// if (z >= a && z < b){
// // System.out.println(z*z);
// /* Намного легче было бы так (как сверху)*/
// for (int j = 0; j < x.length; j++){
// if (z*z == x[j]) System.out.println(x[j]);
// }
// }else{
// System.out.println("Error");
// }
// }
// }
// }