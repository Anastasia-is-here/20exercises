import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static  void main(String[] args){
        ex20();
    }

    // №1. Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.
    static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "Четное" : "Нечетное");
    }

    // №2. Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.
    static void ex2(){
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Введите 3 числа через пробел");
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.stream(nums).min().getAsInt());
    }

    // №3. Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).
    static void ex3(){
        for (int i = 1; i <= 10; i++){
            System.out.println("5 * " + i + " = " + 5 * i);
        }
    }

    // №4. Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.
    static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    // №5. Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.
    static void ex5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        nums[0] = 0;
        nums [1] = 1;
        for (int i = 2; i < n; i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        for (int i : nums){
            System.out.print(i + " ");
        }
    }

    // №6. Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на
    // 1 и само на себя).
    static void ex6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Число простое" : "Число не является простым");
    }

    // №7. Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.
    static void ex7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--){
            System.out.print(i + " ");
        }
    }

    // №8. Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до
    // B (включительно).
    static void ex8(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите число B: ");
        int b = scanner.nextInt();

        for (int i = a % 2 == 0 ? a : a + 1; i <= b; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }

    // №9. Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.
    static void ex9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        char[] str = scanner.nextLine().toCharArray();

        for (int i = str.length-1; i >= 0; i--){
            System.out.print(str[i]);
        }
    }

    // №10. Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.
    static void ex10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String n = scanner.nextLine();
        System.out.println(n.length());
    }

    // №11. Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).
    static void ex11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int res = 1;

        for (int i = 2; i <= n; i++){
            res *= i;
        }

        System.out.println(res);
    }

    // №12. Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.
    static void ex12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        char[] str = scanner.nextLine().toCharArray();
        int sum = 0;

        for (char c : str) {
            sum += c - '0';
        }

        System.out.println(sum);
    }

    // №13. Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом
    // (читается одинаково слева направо и справа
    static void ex13(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine().replace(" ", "").toLowerCase();

        String palindrome = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(palindrome) ? "Палиндром" : "Не палиндром");
    }

    // №14. Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в
    // массиве.
    static void ex14(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Введите " + n + " чисел через пробел");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(Arrays.stream(nums).max().getAsInt());
    }

    // №15. Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов
    // массива.
    static void ex15(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Введите " + n + " чисел через пробел");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(Arrays.stream(nums).sum());
    }

    // №16. Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество
    // положительных и отрицательных чисел в массиве.
    static void ex16(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int pos = 0;
        int neg = 0;
        System.out.println("Введите " + n + " чисел через пробел");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] >= 0){
                pos++;
            }
            else{
                neg++;
            }
        }

        System.out.println("Положительных: " + pos);
        System.out.println("Отрицательных: " + neg);
    }

    // №17. Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне
    // (включительно).
    static void ex17(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите число B: ");
        int b = scanner.nextInt();
        boolean flag = true;

        for (int i = a; i <= b; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(i + " ");
            }
            flag = true;
        }

    }

    // №18. Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой
    // строке.
    static void ex18(){
        Scanner scanner = new Scanner(System.in);
        String vowels = "euioaуеыаоэяию";
        int vows = 0;
        System.out.println("Введите строку");
        char[] str = scanner.nextLine().replace(" ", "").toCharArray();
        for (char i : str){
            if (vowels.indexOf(i) != -1){
                vows++;
            }
        }
        System.out.println("Гласных: " + vows);
        System.out.println("Согласных: " + (str.length - vows));
    }

    // №19. Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.
    static void ex19(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String[] str = scanner.nextLine().split(" ");

        for (int i = str.length-1; i>=0; i--){
            System.out.print(str[i] + " ");
        }

    }

    // №20. Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма
    // цифр в степени, равной количеству цифр, равна самому числу).
    static void ex20(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        String n = scanner.nextLine();
        double sum = 0;

        for (char i : n.toCharArray()){
            sum += Math.pow(i - '0', n.length());
        }

        System.out.println(sum == Double.parseDouble(n) ? "Это число Армстронга" : "Это не число " +
                "Армстронга");

    }
}