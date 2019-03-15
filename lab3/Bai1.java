package baitap.lab3;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int soNguyen;
        System.out.println("Nhap vao mot so nguyen: ");
        soNguyen = sc.nextInt();
        boolean check = NguyenTo(soNguyen);
        if (check == true) {
            System.out.printf("%d la so nguyen to", soNguyen);
        } else {
            System.out.printf("%d khong la so nguyen to", soNguyen);
        }
    }

    public static boolean NguyenTo(int soNguyen) {
        boolean check = true;
        try {
            if (soNguyen == 2) {
                return check = true;
            } else if (soNguyen % 2 != 0) {
                for (int i = 3; i <= Math.sqrt(soNguyen); i += 2) {
                    if (soNguyen % i == 0) {
                        return check = false;
                    }
                }
            } else if (soNguyen % 2 == 0) {
                return check = false;
            }
        } catch (Exception ex) {
            System.out.println("Input error!");
        }

        return check;
    }
}
