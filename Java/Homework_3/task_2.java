package Homework_3;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.List;

public class task_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 5; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println("Исходный список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Список после удаления четных чисел: " + numbers);
    }
}
