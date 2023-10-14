
//1
//import java.util.Scanner;
//
//public class PZ_11 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println(factorial(n));
//
//    }
//
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        } else if (n < 0) {
//            return 0;
//        } else {
//            int j = 1;
//            for (int i = 1; i <= n; i++) {
//                j*=i;
//            }
//            return j;
//        }
//    }
//}

//2
//import java.util.Scanner;
//public class PZ_11{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int d = scanner.nextInt();
//        int h = scanner.nextInt();
//        int m = scanner.nextInt();
//        int s = scanner.nextInt();
//        System.out.println("Секунд прошло: "+second_count(d, h, m, s));
//    }
//    static int second_count(int d, int h, int m, int s){
//        return d*86400+h*3600+m*60+s;
//    }
//}

//3
//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int[][] mas = new int[n][];
//        for(int i = 0; i<n; i++){
//            String line = scanner.nextLine();
//            String[] numbers = line.split(" ");
//            int[] a = new int[numbers.length];
//            for(int j = 0; j<numbers.length; j++){
//                a[j] = Integer.parseInt(numbers[j]);
//            }
//            mas[i] = a;
//        }
//        int ans = find_line7(mas);
//        if(ans != -1){
//            System.out.println("Сумма строки под номером "+(ans + 1)+" кратна 7");
//        }
//        else{
//            System.out.println("Таких строк нет");
//        }
//    }
//    public static int find_line7(int[][] mas){
//        int p = 0;
//        int[] mas1 = new int[mas.length];
//        for(int i = 0; i< mas.length; i++){
//            for(int j = 0; j<mas[i].length; j++){
//                mas1[i] += mas[i][j];
//            }
//        }
//        for(int i = 0; i<mas1.length; i++){
//            if(mas1[i]%7 == 0){
//                p = i;
//                break;
//            }
//        }
//        return p;
//    }
//}

//4
import java.util.Scanner;
class PZ_11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int bukvi1 = scanner.nextInt();
        int chifri1 = scanner.nextInt();
        int bukvi2 = scanner.nextInt();
        int chifri2 = scanner.nextInt();
        king_step(bukvi1, chifri1, bukvi2, chifri2);
    }
    static int king_step(int x, int y, int x1, int y1){
        if(x*y > 64 || x*y <= 0 || x>=9 || y>=9){
            return 1;
        }
        else if(x1*y1 > 64 || x1*y1 <= 0 || x1>=9 || y1>=9 || x*y == x1*y1){
            return 2;
        }
        else if(x*y > 64 || x*y <= 0){
            System.out.println(1);
        }
    }
}
