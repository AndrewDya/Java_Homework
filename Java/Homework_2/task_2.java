package Homework_2;
//Дана строка (получение через обычный текстовый файл!!!)
//
//"фамилия":"Иванов","оценка":"5","предмет":"Математика"
//"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//
//Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет].
//
//Пример вывода в консоль:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class task_2 {
    public static void main(String[] args) throws IOException {
        String filename = "string.txt";
        String content = Files.readString(Paths.get(filename));
        String[] lines = content.split("\\r?\\n");

        for (String line : lines) {
            String[] parts = line.split(",");
            String surname = parts[0].split(":")[1].replaceAll("\"", "");
            String mark = parts[1].split(":")[1].replaceAll("\"", "");
            String subject = parts[2].split(":")[1].replaceAll("\"", "");
            System.out.printf("Студент %s получил %s по предмету %s.\n", surname, mark, subject);
        }
    }
}