package baitap.lab1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input full name: ");
		String name = sc.nextLine();
		System.out.println("Input score: ");
		double score = Double.parseDouble(sc.nextLine());
		System.out.printf("%s %.1f điểm", name, score);	
	}
}
