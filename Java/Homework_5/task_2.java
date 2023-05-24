package Homework_5;
import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        List<String> employeeList = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String employee : employeeList) {
            String firstName = employee.split(" ")[0];
            nameCountMap.put(firstName, nameCountMap.getOrDefault(firstName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCountMap.entrySet());
        sortedNames.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedNames) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(name + ": " + count + " повторений");
            }
        }
    }
}
