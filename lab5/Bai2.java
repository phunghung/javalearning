package baitap.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {

    //private static Iterable<String> dlist;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList<String> dList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int select;
        while (true) {
            System.out.println("+----------------------------------+");
            System.out.println("1. Nhap danh sach ho va ten");
            System.out.println("2. Xuat danh sach ho va ten");
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat danh sach");
            System.out.println("5. Tim va xoa ho va ten nhap tu ban phim");
            System.out.println("6. Ket thuc");
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
                    Collections.shuffle(dList);
                    xuat(dList);
                }
                break;
                case 4: {
                    Collections.sort(dList);
                    Collections.reverse(dList);
                    xuat(dList);
                }
                break;
                case 5: {
                    String sTemp = "";
                    System.out.print("Nhap ten can tim & xoa: ");
                    sTemp = sc.nextLine();
                    xoa(dList, sTemp);
                }
                break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void xoa(ArrayList<String> dlist, String name) {
        for (Object outData : dlist) {
            if (name.equals(outData)) {
                dlist.remove(outData);
                break;
            }
        }
    }

    public static void nhap(ArrayList<String> dList) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap ho ten: ");
            String temp = sc.nextLine();
            dList.add(temp);

            System.out.print("Exit - n / Continue - any key? ");
            String select;
            select = sc.nextLine();
            if (select.equals("n")) {
                break;
            }
        }
    }

    public static void xuat(ArrayList<String> dlist) {
        for (Object outData : dlist) {
            System.out.println(outData + " ");
        }
    }
}
