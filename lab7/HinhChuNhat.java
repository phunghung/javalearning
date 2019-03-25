package baitap.lab7;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double getChuVi() {
        return (this.chieuDai + this.chieuRong) / 2;
    }
    
    public double getDienTich() {
        return this.chieuDai * this.chieuRong;
    }
    
    public void Xuat() {
        System.out.println("Chieu dai: " + getChieuDai());
        System.out.println("Chieu rong: " + getChieuRong());
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: "+ getDienTich());
    }
}
