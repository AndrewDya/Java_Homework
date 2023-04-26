package Homework_2;
//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//результат после каждой итерации запишите в лог-файл.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class task_1 {
    public static void main(String[] args) throws IOException {
        int[] arr = {5, 3, 1, 9, 8, 2, 4, 7, 6};
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        boolean swapped = true;
        int j = 0;
        int temp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                    // записываем текущее состояние массива в файл
                    writer.write("Iteration " + j + ": ");
                    for (int k = 0; k < arr.length; k++) {
                        writer.write(arr[k] + " ");
                    }
                    writer.newLine();
                }
            }
        }
        writer.close();
    }
}