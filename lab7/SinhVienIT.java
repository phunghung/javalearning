package baitap.lab7;

public class SinhVienIT extends SinhVien{
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT(double diemJava, double diemHTML, double diemCSS, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }
    
    @Override
    public double getDiem() {
        return (getDiemJava()*2 + getDiemHTML() + getDiemCSS()) / 4;
    }
}
