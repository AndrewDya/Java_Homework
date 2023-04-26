package Homework_4;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;


public class task_2 {

    public static class Queue<T> {
        private LinkedList<T> queue = new LinkedList<>();

        public void enqueue(T element) {
            queue.add(element);
        }

        public T dequeue() {
            return queue.remove();
        }

        public T first() {
            return queue.peek();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        queue.queue.addAll(list);

        System.out.println(queue.queue);
        queue.enqueue(8);
        System.out.println(queue.queue);
    }

}
