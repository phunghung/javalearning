package baitap.lab6;

public class SinhVien {
    private String hoTen;
    private String email;
    private String phoneNumber;
    private String soCMND;
    
    public SinhVien() {
        
    }
    
    public SinhVien(String hoten, String email, String phone, String cmnd) {
        this.hoTen = hoten;
        this.email = email;
        this.phoneNumber = phone;
        this.soCMND = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
}
