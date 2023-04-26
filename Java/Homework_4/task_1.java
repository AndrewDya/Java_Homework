package Homework_4;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        LinkedList<Integer> reversed = reverseLinkedList(list);
        System.out.println(reversed);
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
}

