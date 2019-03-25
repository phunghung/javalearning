package baitap.lab7;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double chieuDai, chieuRong, canh;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chieu dai HCN: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong HCN: ");
        chieuRong = sc.nextDouble();
        System.out.print("Nhap do dai canh HV: ");
        canh = sc.nextDouble();
        
        HinhChuNhat hcn = new HinhChuNhat();
        HinhVuong hv = new HinhVuong();
        
        hcn.setChieuDai(chieuDai);
        hcn.setChieuRong(chieuRong);
        hv.setCanh(canh);
        
        hcn.Xuat();
        hv.Xuat();
        
    }
}
