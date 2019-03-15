package baitap.lab3;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] hoten = new String[n];
        double[] diem = new double[n];

        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap ho ten: ");
                hoten[i] = sc.nextLine();
                System.out.print("Nhap diem: ");
                diem[i] = Double.parseDouble(sc.nextLine());
            }
            System.out.println("=========================================");
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (diem[i] > diem[j]) {
                        double temp = diem[i];
                        diem[i] = diem[j];
                        diem[j] = temp;
                        String tempName = hoten[i];
                        hoten[i] = hoten[j];
                        hoten[j] = tempName;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.printf("Ho ten: %s. \nDiem: %.1f\n", hoten[i], diem[i]);
                if (diem[i] < 5) {
                    System.out.println("Hoc luc: Yeu");
                } else if (diem[i] >= 5 && diem[i] < 6.5) {
                    System.out.println("Hoc luc: Trung Binh");
                } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                    System.out.println("Hoc luc: Kha");
                } else if (diem[i] >= 7.5 && diem[i] < 9) {
                    System.out.println("Hoc luc: Gioi");
                } else if (diem[i] >= 9) {
                    System.out.println("Hoc luc: Xuat Sac");
                }
                System.out.println("-------------------------");
            }
        } catch (Exception ex) {
            System.out.println("Input error!");
        }
    }
}
