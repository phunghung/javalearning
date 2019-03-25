package baitap.lab6;

import java.util.Scanner;

public class SanPham {
    private String tenSanPham;
    private double donGia;
    private String hang;
    
    public SanPham() {
        
    }
    
    public SanPham(String tensanpham, double gia, String hang) {
        this.tenSanPham = tensanpham;
        this.donGia = gia;
        this.hang = hang;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getHang() {
        return hang;
    }
}