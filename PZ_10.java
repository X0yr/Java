//1
//import java.util.Scanner;
//
//public class PZ_10 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите длины сторон треугольника:");
//
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//
//        double area = geron(a, b, c);
//
//        if (area > 0) {
//            System.out.println("Площадь треугольника: " + area);
//        } else {
//            System.out.println("Такого треугольника не существует");
//        }
//    }
//
//    public static double geron(double a, double b, double c) {
//        // Проверяем, существует ли треугольник
//        if (a + b > c && a + c > b && b + c > a) {
//            // Вычисляем полупериметр
//            double s = (a + b + c) / 2;
//
//            // Вычисляем площадь по формуле Герона
//            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
//            return area;
//        } else {
//            return -1; // Треугольник не существует
//        }
//    }
//}


//2
//import java.util.Scanner;
//
//public class PZ_10 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите название фигуры (квадрат или круг):");
//        String shape = scanner.nextLine().toLowerCase();
//
//        if (shape.equals("квадрат")) {
//            System.out.println("Введите длину стороны квадрата:");
//            int side = scanner.nextInt();
//            int perimeterResult = perimeter(shape, side);
//            int areaResult = area(shape, side);
//            System.out.println("Периметр квадрата: " + perimeterResult);
//            System.out.println("Площадь квадрата: " + areaResult);
//        } else if (shape.equals("круг")) {
//            System.out.println("Введите радиус круга:");
//            int radius = scanner.nextInt();
//            int perimeterResult = perimeter(shape, radius);
//            int areaResult = area(shape, radius);
//            System.out.println("Длина окружности круга: " + perimeterResult);
//            System.out.println("Площадь круга: " + areaResult);
//        } else {
//            System.out.println("Некорректное название фигуры. Введите 'квадрат' или 'круг'.");
//        }
//    }
//
//    public static int perimeter(String shape, int value) {
//        if (shape.equals("квадрат")) {
//            return 4 * value;
//        } else if (shape.equals("круг")) {
//            return (int) Math.ceil(2 * Math.PI * value);
//        } else {
//            return -1; // Ошибка
//        }
//    }
//
//    public static int area(String shape, int value) {
//        if (shape.equals("квадрат")) {
//            return value * value;
//        } else if (shape.equals("круг")) {
//            return (int) Math.ceil(Math.PI * value * value);
//        } else {
//            return -1; // Ошибка
//        }
//    }
//}
//3
//import java.util.Scanner;
//
//public class PZ_10 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите целое число для проверки:");
//        int number = scanner.nextInt();
//        if (isPrime(number)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//4
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class PZ_10 {
//    public static String sortByLength(String input) {
//        // Разбиваем строку на слова
//        String[] words = input.split(" ");
//
//        // Создаем компаратор для сравнения слов по длине и, в случае равной длины, по алфавиту
//        Arrays.sort(words, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
//
//        // Объединяем слова обратно в строку
//        return String.join(" ", words);
//    }
//
//    public static void main(String[] args) {
//        String input = "apple banana cherry date eggplant";
//        String result = sortByLength(input);
//        System.out.println(result); // Выводим отсортированную строку
//    }
//}
//5
//public class PZ_10 {
//    public static int maximin(int[][] array) {
//        int maxMin = Integer.MIN_VALUE; // Начальное значение максимума
//
//        // Перебираем каждую строку массива
//        for (int[] row : array) {
//            int minInRow = Integer.MAX_VALUE; // Начальное значение минимума в текущей строке
//
//            // Находим минимум в текущей строке
//            for (int num : row) {
//                if (num < minInRow) {
//                    minInRow = num;
//                }
//            }
//
//            // Обновляем максимум, если минимум текущей строки больше текущего максимума
//            if (minInRow > maxMin) {
//                maxMin = minInRow;
//            }
//        }
//
//        return maxMin;
//    }
//
//    public static void main(String[] args) {
//        // Пример входного массива
//        int[][] array = {
//                {3, 5, 2},
//                {8, 1, 4},
//                {7, 6, 9}
//        };
//
//        int result = maximin(array);
//        System.out.println("Максимальное значение среди минимальных элементов каждой строки: " + result);
//    }
//}