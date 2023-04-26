package Homework_1;
//Вывести все простые числа от 1 до 1000
public class task_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean simple = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.print(i + " ");
            }
        }
    }
}