package com.acts.tester;

import java.util.Scanner;
import com.acts.geometry.Point2D;


class Tester{
	public static void main(String[]  a) {
		System.out.println("Enter a Point A with X then Y");
		Scanner sc=new Scanner(System.in);
		Point2D p1= new Point2D(sc.nextDouble(),sc.nextDouble());
		Point2D p2= new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p1.show());
		System.out.println(p2.show());
		if (p1.equals(p2)) {
			System.out.println("SAME");
		}else {
			System.out.println("Different");
		}
	}
}
