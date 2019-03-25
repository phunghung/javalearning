package baitap.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> dList = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("add element: ");
            double temp = Double.parseDouble(sc.nextLine());
            dList.add(temp);
            
            System.out.print("Exit - n / Continue - any key? ");
            String select;
            select = sc.nextLine();
            if(select.equals("n")){
                break;
            }
        }
        double tong = 0;
        for(double outData : dList) {
            System.out.println(outData + " ");
            tong += outData;
        }
        System.out.println("Tong = " + tong);
    }
}
