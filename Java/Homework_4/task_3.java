package Homework_4;
import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lastNumber = 0;

        while (true) {
            System.out.print("Введите первое число (или) 'cancel': ");
            String input = scanner.next();

            double firstNumber;
            if (input.equals("cancel")) {
                firstNumber = lastNumber;
                System.out.println("Возвращено предыдущее число: " + firstNumber);
                continue;
            }

            try {
                firstNumber = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода числа. Попробуйте еще раз или введите 'cancel' для отмены ввода.");
                continue;
            }

            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = scanner.next();

            if (operation.equals("exit")) {
                break;
            }

            double secondNumber;

            while (true) {
                System.out.print("Введите второе число (или) 'cancel': ");
                input = scanner.next();

                if (input.equals("cancel")) {
                    secondNumber = lastNumber;
                    System.out.println("Возвращено предыдущее число: " + secondNumber);
                    continue;
                }

                try {
                    secondNumber = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода числа. Попробуйте еще раз или введите 'cancel' для отмены ввода.");
                }
            }

            double result;
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Ошибка: деление на ноль.");
                        continue;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Ошибка: недопустимая операция.");
                    continue;
            }

            System.out.println("Ответ: " + result);
            lastNumber = result;
        }
    }
}
