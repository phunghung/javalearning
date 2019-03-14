package baitap.lab1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double a, b;
        try {
            System.out.println("Nhập cạnh thứ 1 HCN: ");
            a = sc.nextDouble();
            System.out.println("Nhập cạnh thứ 2 HCN: ");
            b = sc.nextDouble();
            double chuvi = (a + b) * 2;
            double dientich = a * b;
            double gtnn = Math.min(a, b);
            System.out.println("Chu vi HCN: " + chuvi);
            System.out.println("Diện tích HCN: " + dientich);
            System.out.println("Cạnh nhỏ nhất HCN: " + gtnn);
        } catch (Exception ex) {
            System.out.println("Input error!");
        }
    }
}
