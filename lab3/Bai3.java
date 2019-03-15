package baitap.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a[], n;
        System.out.println("So phan tu cua mang la: ");
        n = sc.nextInt();
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("GTNN: " + min);
        System.out.println("Trung binh cong cac phan tu chia het cho 3: " + tbc(a));

    }

    public static double tbc(int a[]) {
        int count = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                sum += a[i];
                count += 1;
            }
        }
        return sum / (double) count;
    }

}
