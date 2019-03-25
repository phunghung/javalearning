package baitap.lab7;

public class HinhVuong extends HinhChuNhat{
    private double canh;
    
    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    
    public double getChuVi() {
        return getCanh() * 4;
    }
    
    public double getDienTich() {
        return getCanh() * getCanh();
    }
    
    public void Xuat() {
        System.out.println("Chieu dai canh: " + getCanh());
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: "+ getDienTich());
    }
    
}
