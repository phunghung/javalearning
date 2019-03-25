package baitap.lab5;

import java.util.*;

import java.util.Scanner;

public class SanPham implements Comparator<SanPham> {

    private String tenSanPham;
    private double donGia;

    public SanPham() {

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

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public int compare(SanPham sp1, SanPham sp2) {
        if (sp1.getDonGia() < sp2.getDonGia()) {
            return 1;
        } else {
            if (sp1.getDonGia() == sp2.getDonGia()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
