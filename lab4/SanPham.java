package baitap.lab4;

import java.util.Scanner;

public class SanPham {
    private String tenSanPham;
    private double donGia, giamGia;
    
    public SanPham() {
        
    }
    
    public SanPham(String tensanpham, double gia, double giamgia) {
        this.tenSanPham = tensanpham;
        this.donGia = gia;
        this.giamGia = giamgia;
    }
    public SanPham(String tensanpham, double gia) {
        this.tenSanPham = tensanpham;
        this.donGia = gia;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }
    private double getThueNhapKhau() {
        return (getDonGia() * 0.1);
    }
    public void nhap(){
        String temp;
        double temp2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        temp = sc.nextLine();
        setTenSanPham(temp);
        System.out.print("Nhap gia san pham: ");
        temp2 = sc.nextDouble();
        setDonGia(temp2);
        System.out.print("Nhap giam gia: ");
        temp2 = sc.nextDouble();
        setGiamGia(temp2);
    } 
    
    public void xuat() {
        System.out.println("---------------------------------");
        System.out.println("Ten san pham: " + getTenSanPham());
        System.out.println("Don gia san pham: " + getDonGia());
        System.out.println("Giam gia: " + getGiamGia());
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
        System.out.println("==================================");
    }
}
