package baitap.lab6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho va ten: ");
        String fullName = sc.nextLine();
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        String midName = fullName.substring(fullName.indexOf(" ")+1, fullName.lastIndexOf(" "));
        System.out.println(firstName.toUpperCase() + " " + midName + " " + lastName.toUpperCase());
    }
}
