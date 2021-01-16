package Lesson_5;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {
        arrayFill(SIZE);
        arraySliceAndDice(SIZE,H);
    }

    private static void arrayFill (int size) {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        calculate(arr,size,0);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void arraySliceAndDice(int size, int h) throws InterruptedException {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long a = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            calculate(a1, h,0);
        });

        Thread t2 = new Thread(() -> {
            calculate(a2, h,h);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);

    }

    private static float[] calculate (float[] arr, int size,int move) {
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i + move) / 5) * Math.cos(0.2f + (i + move) / 5) * Math.cos(0.4f + (i + move) / 2));
        }
        return arr;
    }
}
