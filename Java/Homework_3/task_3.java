package Homework_3;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(21) + 5;
            numbers.add(num);
            sum += num;
        }

        int min = numbers.get(0);
        int max = numbers.get(0);
        double avg = (double) sum / numbers.size();

        for (int i = 1; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Список: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }
}
