package baitap.lab7;

public class Bai3 {
    public static void main(String[] args) {
        
        SinhVienIT objIT = new SinhVienIT(9, 10, 9.5, "David", "Dev");
        SinhVienBiz objBiz = new SinhVienBiz(9, 8, "Da Cap", "Marketing");
        
        objIT.Xuat();
        objBiz.Xuat();
    }
}
