package baitap.lab2;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int select;
        while (true) {
            System.out.println("+----------------------------------+");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("+----------------------------------+");
            System.out.print("Chon chuc nang: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    ptb1();
                    break;
                case 2:
                    ptb2();
                    break;
                case 3:
                    tiendien();
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }

    public static void ptb1() {
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

    public static void ptb2() {
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
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("Phuong trinh vô số nghiệm");

                    } else {
                        System.out.println("Phuong trinh vô nghiệm");
                    }
                } else {
                    System.out.println("x = " + -c / b);
                }
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

    public static void tiendien() {
        Scanner sc = new Scanner(System.in);

        int sodien, sotien;
        try {
            System.out.println("Nhap vao so dien su dung: ");
            sodien = sc.nextInt();

            if (sodien <= 50) {
                sotien = sodien * 1000;
            } else {
                sotien = 50 * 1000 + (sodien - 50) * 1200;
            }
            System.out.println("So tien dien la: " + sotien);
        } catch (Exception ex) {
            System.out.println("Input error!");
        }
    }
}
