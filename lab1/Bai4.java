package baitap.lab1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		try {
			System.out.println("Nhap cac he so cua phuong trinh bac 2: ");
			System.out.println("Nhap cac he a: ");
			a = sc.nextDouble();
			System.out.println("Nhap cac he b: ");
			b = sc.nextDouble();
			System.out.println("Nhap cac he c: ");
			c = sc.nextDouble();

			double delta = (b * b) - (4 * a * c);
			System.out.println("Can bac 2 cua delta: " + Math.sqrt(delta));

		} catch (Exception ex) {
			System.out.println("Input error!");
		}
	}
}
