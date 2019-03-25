package baitap.lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        
        ArrayList<SanPham> listSanPham = new ArrayList<SanPham>();
        nhap(listSanPham);
        xuat(listSanPham);
        xuatFilter(listSanPham, "Nokia");
    }
    
    public static void nhap(ArrayList<SanPham> aList) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            SanPham objSanPham = new SanPham();
            System.out.print("Nhap ten san pham: ");
            String temp = sc.nextLine();
            objSanPham.setTenSanPham(temp);
            
            System.out.print("Nhap ten hang san pham: ");
            temp = sc.nextLine();
            objSanPham.setHang(temp);

            System.out.print("Nhap gia san pham: ");
            double temp2 = Double.parseDouble(sc.nextLine());
            objSanPham.setDonGia(temp2);
            
            aList.add(objSanPham);

            System.out.print("Exit - n / Continue - any key? ");
            String select;
            select = sc.nextLine();
            if (select.equals("n")) {
                break;
            }
        }
    }
    
    public static void xuat(ArrayList<SanPham> aList) {
        for (SanPham sp : aList) {
            System.out.println(sp.getTenSanPham() + " " + sp.getDonGia());
        }
    }
    
    public static void xuatFilter(ArrayList<SanPham> aList, String select) {
        for (SanPham sp : aList) {
            if(sp.getHang().equalsIgnoreCase(select)) {
                System.out.println(sp.getTenSanPham() + " " + sp.getDonGia() + " " + sp.getHang());
            }
        }
    }
}
