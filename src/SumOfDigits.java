import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();

        int sum = sumOfDigits(number);
        System.out.println("Сумма цифр числа: " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Добавляем последнюю цифру к сумме
            number /= 10; // Удаляем последнюю цифру из числа
        }
        return sum;
    }
}
