package baitap.lab2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
