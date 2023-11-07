package com.acts.geometry;

import java.util.Scanner;

public class Point2D {
	private double x,y;
 public Point2D(double x,double y){
	 this.x=x;
	 this.y=y;
 }
 
 public String show() {
	 return "X is "+x+"\nand\nY is "+y;
 }
 
 public boolean equals(Point2D h) {
	 if (this.x == h.x && this.y == h.y) {
		 return true;
	 }
	 return false;
 }

}

