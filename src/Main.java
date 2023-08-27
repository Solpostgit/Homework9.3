import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();/*
        task3();
        task4();
        task5();*/
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(sum);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i : arr) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
           // System.out.println(arr[i]);
        }
    }
}