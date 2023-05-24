package Homework_5;
import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();

        // Подсчет повторений имен
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Сортировка по убыванию популярности
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCountMap.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
