
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
//import java.util.Scanner;
//
//public class PZ_11 {
//    public static String king_step(int kingRow, int kingCol, int figureRow, int figureCol) {
//        if (kingRow < 1 || kingRow > 8 || kingCol < 1 || kingCol > 8) {
//            return "1";
//        }
//        if (figureRow < 1 || figureRow > 8 || figureCol < 1 || figureCol > 8) {
//            return "2";
//        }
//        if (kingRow == figureRow && kingCol == figureCol) {
//            return "3";
//        }
//
//        if (Math.abs(kingRow - figureRow) <= 1 && Math.abs(kingCol - figureCol) <= 1) {
//            return "YES";
//        } else {
//            return "NO";
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int kingRow = scanner.nextInt();
//        int kingCol = scanner.nextInt();
//        int figureRow = scanner.nextInt();
//        int figureCol = scanner.nextInt();
//        System.out.println(king_step(kingRow, kingCol, figureRow, figureCol));
//    }
//}

//5
//import java.util.Scanner;
//public class PZ_11 {
//
//    public static int countRoutes(int N) {
//        if (N <= 1) {
//            return 1;
//        }
//
//        int[] dp = new int[N + 1];
//
//        dp[0] = 1; // Маршрут с 0 ступеньками (начальное положение мячика)
//        dp[1] = 1; // Маршрут с 1 ступенькой
//
//        for (int i = 2; i <= N; i++) {
//            int lastindex = dp.length - 1;
//            dp[i] = dp[i - 1] + dp[i - 2] + dp[lastindex];
//        }
//
//        return dp[N];
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int routes = countRoutes(N);
//        System.out.println("Число всевозможных маршрутов мячика: " + routes);
//    }
//}