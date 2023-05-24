package Homework_5;
import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> phoneBook = new HashMap<>();

        while (true) {
            System.out.println("Введите 1) Добавление номера\n2) Вывод всего");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Введите фамилию:");
                String lastName = scanner.next();
                System.out.println("Введите номер:");
                String phoneNumber = scanner.next();

                if (phoneBook.containsKey(lastName)) {
                    List<String> numbers = phoneBook.get(lastName);
                    numbers.add(phoneNumber);
                } else {
                    List<String> numbers = new ArrayList<>();
                    numbers.add(phoneNumber);
                    phoneBook.put(lastName, numbers);
                }
            } else if (choice == 2) {
                for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
                    String lastName = entry.getKey();
                    List<String> numbers = entry.getValue();

                    System.out.print(lastName + ": ");
                    for (String number : numbers) {
                        System.out.print(number + ", ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}

