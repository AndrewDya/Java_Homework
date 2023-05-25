package Homework_6;
import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Set<Notebook> notebooks = createNotebooks();

        System.out.println("Добро пожаловать в магазин ноутбуков!");
        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int filterCriteria = scanner.nextInt();

        switch (filterCriteria) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ: ");
                int minRAM = scanner.nextInt();
                filterNotebooksByRAM(notebooks, minRAM);
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД: ");
                int minStorage = scanner.nextInt();
                filterNotebooksByStorage(notebooks, minStorage);
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                String operatingSystem = scanner.next();
                filterNotebooksByOperatingSystem(notebooks, operatingSystem);
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = scanner.next();
                filterNotebooksByColor(notebooks, color);
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }

    public static Set<Notebook> createNotebooks() {
        Set<Notebook> notebooks = new HashSet<>();

        Notebook notebook1 = new Notebook("Brand 1", 8, 500, "Windows", "Silver");
        Notebook notebook2 = new Notebook("Brand 2", 16, 1000, "MacOS", "Space_Gray");
        Notebook notebook3 = new Notebook("Brand 3", 8, 500, "Windows", "Black");
        Notebook notebook4 = new Notebook("Brand 4", 16, 1000, "Windows", "Silver");
        Notebook notebook5 = new Notebook("Brand 5", 8, 1000, "MacOS", "Silver");
        Notebook notebook6 = new Notebook("Brand 6", 16, 500, "Linux", "Red");
        Notebook notebook7 = new Notebook("Brand 7", 32, 1000, "Windows", "Blue");
        Notebook notebook8 = new Notebook("Brand 8", 8, 500, "MacOS", "Space_Gray");
        Notebook notebook9 = new Notebook("Brand 9", 8, 500, "Windows", "White");
        Notebook notebook10 = new Notebook("Brand 10", 16, 1000, "Linux", "Black");

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);

        return notebooks;
    }


    public static void filterNotebooksByRAM(Set<Notebook> notebooks, int minRAM) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            if (notebook.getRAM() >= minRAM) {
                filteredNotebooks.add(notebook);
            }
        }

        displayFilteredNotebooks(filteredNotebooks);
    }

    public static void filterNotebooksByStorage(Set<Notebook> notebooks, int minStorage) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            if (notebook.getStorage() >= minStorage) {
                filteredNotebooks.add(notebook);
            }
        }

        displayFilteredNotebooks(filteredNotebooks);
    }

    public static void filterNotebooksByOperatingSystem(Set<Notebook> notebooks, String operatingSystem) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            if (notebook.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                filteredNotebooks.add(notebook);
            }
        }

        displayFilteredNotebooks(filteredNotebooks);
    }

    public static void filterNotebooksByColor(Set<Notebook> notebooks, String color) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            if (notebook.getColor().equalsIgnoreCase(color)) {
                filteredNotebooks.add(notebook);
            }
        }

        displayFilteredNotebooks(filteredNotebooks);
    }

    public static void displayFilteredNotebooks(Set<Notebook> notebooks) {
        if (notebooks.isEmpty()) {
            System.out.println("Ноутбуки, отвечающие условиям фильтрации, не найдены.");
        } else {
            System.out.println("Результаты фильтрации:");
            for (Notebook notebook : notebooks) {
                System.out.println(notebook);
            }
        }
    }
}
