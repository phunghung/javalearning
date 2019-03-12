package baitap.lab1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		try {
			System.out.println("Nhập cạnh cua lap phuong: ");
			a = sc.nextDouble();
			
			double thetich = Math.pow(a, 3);
			System.out.println("The tich lap phuong: " + thetich);
		}
		catch(Exception ex) {
			System.out.println("Input error!");
		}

	}
}
