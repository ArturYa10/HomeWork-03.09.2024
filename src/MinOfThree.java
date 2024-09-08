import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = findMin(a, b, c);
        System.out.println("Минимальное число: " + min);
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c)); // Используем Math.min для нахождения минимального значения
    }
}
