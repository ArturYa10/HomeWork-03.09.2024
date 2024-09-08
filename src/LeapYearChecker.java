import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

    public static boolean isLeapYear(int year) {
        // Год високосный, если он делится на 4, но не делится на 100, или делится на 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
