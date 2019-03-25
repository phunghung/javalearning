package baitap.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        //ArrayList<String> dList = new ArrayList<String>();
        ArrayList<SanPham> listSanPham = new ArrayList<SanPham>();
        Scanner sc = new Scanner(System.in);
        int select;
        while (true) {
            System.out.println("+----------------------------------+");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Xuat danh sach san pham");
            System.out.println("3. Sap xep giam dan theo gia & xuat ra man hinh");
            System.out.println("4. Tim & xoa san pham theo ten nhap tu ban phim");
            System.out.println("5. Xuat gia trung binh cua cac san pham");
            System.out.println("6. Ket thuc");
            System.out.println("+----------------------------------+");
            System.out.print("Chon chuc nang: ");
            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    nhap(listSanPham);
                    break;
                case 2:
                    xuat(listSanPham);
                    break;
                case 3: {
                    Collections.sort(listSanPham, new Comparator<SanPham>() {
                        @Override
                        public int compare(SanPham sp1, SanPham sp2) {
                            if(sp1.getDonGia() < sp2.getDonGia()) {
                                return 1;
                            }
                            else {
                                if(sp1.getDonGia() == sp2.getDonGia()) {
                                    return 0;
                                }
                                else {
                                    return -1;
                                }
                            }
                        }
//                        tăng dần thì đổi chỗ 1 và -1
                    });
                    xuat(listSanPham);
                    
//                    //Sắp xếp danh sách theo theo thứ tự a b c!
//                    Collections.sort(listSanPham, new Comparator<SanPham>() {
//                        @Override
//                        public int compare(SanPham sp1, SanPham sp2) {
//                            return (sp1.getTenSanPham().compareTo(sp2.getTenSanPham()));
//                    // Muốn đảo danh sách đối thành
//                            //return (sp2.getTenSanPham().compareTo(sp1.getTenSanPham()));
//                        }
//                    });
                }
                break;
                case 4: {
                    String sTemp = "";
                    System.out.print("Nhap ten can tim & xoa: ");
                    sTemp = sc.nextLine();
                    xoa(listSanPham, sTemp);
                }
                break;
                case 5: {
                    System.out.println("Gia trung binh cua cac san pham la: " + GiaTB(listSanPham));
                }
                break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void nhap(ArrayList<SanPham> aList) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            SanPham objSanPham = new SanPham();
            System.out.print("Nhap ten san pham: ");
            String temp = sc.nextLine();
            objSanPham.setTenSanPham(temp);

            System.out.print("Nhap gia san pham: ");
            double temp2 = Double.parseDouble(sc.nextLine());
            objSanPham.setDonGia(temp2);
            aList.add(objSanPham);

            System.out.print("Exit - n / Continue - any key? ");
            String select;
            select = sc.nextLine();
            if (select.equals("n")) {
                break;
            }
        }
    }

    public static void xuat(ArrayList<SanPham> aList) {
        for (SanPham sp : aList) {
            System.out.println(sp.getTenSanPham() + " " + sp.getDonGia());
        }
    }
    
    public static void xoa(ArrayList<SanPham> dlist, String name) {
        for (SanPham outData : dlist) {
            if (name.equals(outData.getTenSanPham())) {
                dlist.remove(outData);
                break;
            }
        }
    }
    
    public static double GiaTB(ArrayList<SanPham> dlist) {
        double giaTB = 0;
        int dem = 0;
        for (SanPham outData : dlist) {
            giaTB += outData.getDonGia();
            ++dem;
        }
        return giaTB / (double)dem;
    }
}
