//1
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         scanner.nextLine();  // Считываем символ новой строки после n

//         Map<String, Integer> wordCount = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             String word = scanner.nextLine().toLowerCase();  // Считываем слово и приводим его к нижнему регистру
//             wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);  // Увеличиваем счетчик встречаемости слова
//         }

//         String mostFrequentWord = null;
//         int maxCount = 0;

//         for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//             if (entry.getValue() > maxCount) {
//                 mostFrequentWord = entry.getKey();
//                 maxCount = entry.getValue();
//             }
//         }

//         System.out.println(mostFrequentWord);
//     }
// }

//2

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = Integer.parseInt(scanner.nextLine());

//         Map<String, Integer> professionCounts = new HashMap<>();
//         Map<String, StringBuilder> professionEmployees = new HashMap<>();

//         for (int i = 0; i < 2 * n; i++) {
//             String input = scanner.nextLine();
//             if (i % 2 == 0) {
//                 // Это строка с именем человека
//                 String name = input;
//                 String profession = scanner.nextLine();

//                 // Обновляем счетчик для данной профессии
//                 professionCounts.put(profession, professionCounts.getOrDefault(profession, 0) + 1);

//                 // Добавляем имя в список сотрудников данной профессии
//                 if (!professionEmployees.containsKey(profession)) {
//                     professionEmployees.put(profession, new StringBuilder());
//                 }
//                 professionEmployees.get(profession).append(name).append("\n");
//             }
//         }

//         // Находим профессию с наибольшим количеством сотрудников
//         String mostPopularProfession = "";
//         int maxCount = 0;
//         for (Map.Entry<String, Integer> entry : professionCounts.entrySet()) {
//             if (entry.getValue() > maxCount) {
//                 mostPopularProfession = entry.getKey();
//                 maxCount = entry.getValue();
//             }
//         }

//         System.out.println(maxCount);
//         System.out.println(mostPopularProfession);
//         System.out.println(professionEmployees.get(mostPopularProfession));
//     }
// }

//3
// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.Set;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         Set<Integer> uniqueNumbers = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             int number = scanner.nextInt();
//             if (uniqueNumbers.contains(number)) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//                 uniqueNumbers.add(number);
//             }
//         }
//     }
// }

//4

// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.Set;

// public class CountDistinctWords {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int numLines = Integer.parseInt(scanner.nextLine());
//         Set<String> wordsSet = new HashSet<>();

//         for (int i = 0; i < numLines; i++) {
//             String line = scanner.nextLine();
//             String[] words = line.split("\\s+"); // Разбиваем строку на слова, используя пробел как разделитель
//             for (String word : words) {
//                 wordsSet.add(word); // Добавляем слово в множество
//             }
//         }

//         int distinctWordsCount = wordsSet.size();
//         System.out.println("Количество различных слов в тексте: " + distinctWordsCount);
//     }
// }

//5


// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Ввод количества ребят
//         int n = scanner.nextInt();
//         scanner.nextLine();  // Считываем остаток строки
        
//         // Создаем карту для хранения количества слов каждого ребенка
//         Map<String, Integer> wordCount = new HashMap<>();
        
//         // Ввод и обработка данных для каждого ребенка
//         for (int i = 0; i < n; i++) {
//             String line = scanner.nextLine().toLowerCase();  // Преобразуем к нижнему регистру
//             String[] parts = line.split(": ");
            
//             if (parts.length == 2) {
//                 String name = parts[0];
//                 String[] words = parts[1].split(" ");
                
//                 for (String word : words) {
//                     if (word.length() >= K) {
//                         wordCount.put(name, wordCount.getOrDefault(name, 0) + 1);
//                     }
//                 }
//             }
//         }
        
//         // Ввод значения K
//         int K = scanner.nextInt();
        
//         // Находим ребенка с наибольшим количеством слов
//         String winner = null;
//         int maxWords = -1;
        
//         for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//             if (entry.getValue() > maxWords) {
//                 winner = entry.getKey();
//                 maxWords = entry.getValue();
//             }
//         }
        
//         if (winner != null) {
//             System.out.println(winner + ": " + maxWords);
//         } else {
//             System.out.println("Нет детей, удовлетворяющих условиям.");
//         }
//     }
// }
