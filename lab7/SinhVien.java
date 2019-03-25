package baitap.lab7;

public abstract class SinhVien {
    private String hoTen;
    private String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    abstract public double getDiem();
    
    public String getHocLuc() {
        if (getDiem() < 5) {
            return "Yeu";
        } else if (getDiem() >= 5 && getDiem() < 6.5) {
            return "Trung Binh";
        } else if (getDiem() >= 6.5 && getDiem() < 7.5) {
           return "Kha";
        } else if (getDiem() >= 7.5 && getDiem() < 9) {
            return "Gioi";
        } else if (getDiem() >= 9) {
            return "Xuat Sac";
        }
        return "";
    }
    public void Xuat() {
        System.out.println(getHoTen());
        System.out.println(getNganh());
        System.out.println(getDiem());
        System.out.println(getHocLuc());
    }
}
