package Homework_1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n для вычисления треугольного числа: ");
        int n = scanner.nextInt();
        int triangularNumber = n * (n + 1) / 2;
        System.out.println("Треугольное число для " + n + " = " + triangularNumber);
        long factorial = factorial(n);
        System.out.println(n + "! = " + factorial);
    }
    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}