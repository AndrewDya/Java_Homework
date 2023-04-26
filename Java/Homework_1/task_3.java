package Homework_1;
//Реализовать простой калькулятор
//Введите первое число: 12
//Введите операцию: +
//Введите второе число: 1
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        String operator = scanner.next();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана");
                return;
        }

        System.out.println("Результат: " + result);
    }
}