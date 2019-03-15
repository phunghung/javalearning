package baitap.lab2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double a, b;
        try {
            System.out.println("Nhap cac he so cua phuong trinh bac nhat ax + b = 0: ");
            System.out.println("Nhap cac he a: ");
            a = sc.nextDouble();
            System.out.println("Nhap cac he b: ");
            b = sc.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh vô số nghiệm");

                } else {
                    System.out.println("Phuong trinh vô nghiệm");
                }
            } else {
                System.out.println("x = " + -b / a);
            }
        } catch (Exception ex) {
            System.out.println("Input error!");
        }
    }
}
