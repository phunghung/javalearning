package baitap.lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    
    public static void main(String[] args) {
        ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        nhap(listSinhVien);
        xuat(listSinhVien);
    }
    
    public static void nhap(ArrayList<SinhVien> aList) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            SinhVien objSinhVien = new SinhVien();
            
            System.out.print("Nhap ho va ten sinh vien: ");
            String temp = sc.nextLine();
            objSinhVien.setHoTen(temp);
            
            System.out.print("Nhap dia chi email: ");
            temp = sc.nextLine();
            objSinhVien.setEmail(checkPatternEmail(temp));

            System.out.print("Nhap so dien thoai: ");
            temp = sc.nextLine();
            objSinhVien.setPhoneNumber(checkPatternSDT(temp));
            
            System.out.print("Nhap so CMND: ");
            temp = sc.nextLine();
            objSinhVien.setSoCMND(checkPatternCMND(temp));
            
            aList.add(objSinhVien);

            System.out.print("Exit - n / Continue - any key? ");
            String select;
            select = sc.nextLine();
            if (select.equals("n")) {
                break;
            }
        }
    }
    
    public static void xuat(ArrayList<SinhVien> aList) {
        for (SinhVien sv : aList) {
            System.out.println("Ho va ten: " + sv.getHoTen());
            System.out.println("Email: " + sv.getEmail());
            System.out.println("Phone: " + sv.getPhoneNumber());
            System.out.println("CMND: " + sv.getSoCMND());
        }
    }
    
        public static String checkPatternEmail(String email) {
        String patternMail = "\\w+@\\w+(\\.\\w+){1,2}";
        
        if(email.matches(patternMail)) {
            return email;
        }
        return "Email Format Error";
    }
    
    public static String checkPatternSDT(String sdt) {
        String patternSDT = "0(\\d){9}";
        
        if(sdt.matches(patternSDT)) {
            return sdt;
        }
        return "Phone number Format Error";
    }
    
    public static String checkPatternCMND(String cmnd) {
        String patternCMND = "\\d{9,12}";
        
        if(cmnd.matches(patternCMND)) {
            return cmnd;
        }
        return "CMND Format Error";
    }
}
