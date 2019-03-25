package baitap.lab7;

import static baitap.lab5.Bai3.xuat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {

        ArrayList<SinhVienBiz> dList = new ArrayList<SinhVienBiz>();
        Scanner sc = new Scanner(System.in);
        int select;
        while (true) {
            System.out.println("+----------------------------------+");
            System.out.println("1. Nhap danh sach ho va ten");
            System.out.println("2. Xuat danh sach ho va ten");
            System.out.println("3. Xuat danh sach sinh vien hoc luc gioi");
            System.out.println("4. Sap xep sinh vien theo diem giam dan");
            System.out.println("5. Ket thuc");
            System.out.println("+----------------------------------+");
            System.out.print("Chon chuc nang: ");
            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    nhap(dList);
                    break;
                case 2:
                    xuat(dList);
                    break;
                case 3: {
                    SVGioi(dList);
                }
                break;
                case 4: {
                    Collections.sort(dList, new Comparator<SinhVienBiz>() {
                        @Override
                        public int compare(SinhVienBiz sv1, SinhVienBiz sv2) {
                            if (sv1.getDiem() < sv2.getDiem()) {
                                return 1;
                            } else {
                                if (sv1.getDiem() == sv2.getDiem()) {
                                    return 0;
                                } else {
                                    return -1;
                                }
                            }
                        }
                    });
                    xuat(dList);
                }
                break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public static void nhap(ArrayList<SinhVienBiz> dList) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            SinhVienBiz objSV = new SinhVienBiz(0, 0, "", "");
            System.out.print("Nhap ten sinh vien: ");
            String temp = sc.nextLine();
            objSV.setHoTen(temp);

            System.out.print("Nhap nganh hoc: ");
            temp = sc.nextLine();
            objSV.setNganh(temp);

            System.out.print("Nhap diem marketing: ");
            double temp2 = Double.parseDouble(sc.nextLine());
            objSV.setDiemMarketing(temp2);
            System.out.print("Nhap diem sales: ");
            temp2 = Double.parseDouble(sc.nextLine());
            objSV.setDiemSales(temp2);

            dList.add(objSV);

            System.out.print("Exit - n / Continue - any key? ");
            String select;
            select = sc.nextLine();
            if (select.equals("n")) {
                break;
            }
        }
    }

    public static void xuat(ArrayList<SinhVienBiz> aList) {
        for (SinhVienBiz sv : aList) {
            sv.Xuat();
            System.out.println("--------------------");
        }
    }

    public static void SVGioi(ArrayList<SinhVienBiz> aList) {
        for (SinhVienBiz sv : aList) {
            if (sv.getHocLuc().equals("Gioi")) {
                sv.Xuat();
            }

        }
    }

}
