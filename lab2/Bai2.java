package baitap.lab2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        try {
            System.out.println("Nhap cac he so cua phuong trinh bac 2: ");
            System.out.println("Nhap cac he a: ");
            a = sc.nextDouble();
            System.out.println("Nhap cac he b: ");
            b = sc.nextDouble();
            System.out.println("Nhap cac he c: ");
            c = sc.nextDouble();
            if (a == 0) {
                ptb1(a, b);
            } else {
                double delta = (b * b) - (4 * a * c);
                double sqrtDelta = Math.sqrt(delta);
                if (delta < 0) {
                    System.out.println("Phuong trinh vô nghiệm");
                } else if (delta == 0) {
                    System.out.println("Phuong trinh co nghiem kep: x = " + -b / (2 * a));
                } else {
                    System.out.println("Phuong trinh co 2 nghiem: ");
                    System.out.println("x1 = " + (-b + sqrtDelta) / (2 * a));
                    System.out.println("x2 = " + (-b - sqrtDelta) / (2 * a));
                }
            }

        } catch (Exception ex) {
            System.out.println("Input error!");
        }
    }

    public static void ptb1(double a, double b) {

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vô số nghiệm");

            } else {
                System.out.println("Phuong trinh vô nghiệm");
            }
        } else {
            System.out.println("x = " + -b / a);
        }
    }
}
