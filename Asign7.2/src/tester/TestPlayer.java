package tester;

import java.util.Scanner;

import inhertance2.*;

public class TestPlayer {
	private static int seats;
	private static boolean exit;
	private static int count;

  public static void main(String[] a) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number of Seats :");
	  TestPlayer.seats =sc.nextInt();
	  Player[] mem =new Player[ TestPlayer.seats ];
	  
	  while( ! TestPlayer.exit) {
		  System.out.println("press: \n  1 > Cricketer register \n  2 > Footballer register \n  3 > Tennis player register \n  4 > show All members \n  0 > exit application");
		  switch (sc.nextInt()) {
		case 1:
			if (TestPlayer.count < TestPlayer.seats) {
				String[] a1=new String[2];
				int j = 0,l = 0;
				String[] x={"String Name","String Country","int age","int runs"};
				int[] a2= new int[2];
				for (int i = 0; i < 4; i++) {
				    if(i == 0 || i == 1) {
				    	 System.out.println(x[i]);
				    	a1[j++]=sc.next();
				    }
				    else {
				    	System.out.println(x[i]);
				    	a2[l++]=sc.nextInt();
				    }
				}
//				String First Name,String Last Name,int year,String course,int fees,int marks
				mem[TestPlayer.count++]=new CricketPlayer(a1[0],a1[1],a2[0],a2[1]);
				
			}
			else 
				System.out.println("array full!!");

			break;
		case 2:
			if (TestPlayer.count < TestPlayer.seats) {
				String[] a1=new String[2];
				int j = 0,l = 0;
				String[] x={"String Name","String Country","int age","int goals"};
				int[] a2= new int[2];
				for (int i = 0; i < 4; i++) {
				    if(i == 0 || i == 1) {
				    	 System.out.println(x[i]);
				    	a1[j++]=sc.next();
				    }
				    else {
				    	System.out.println(x[i]);
				    	a2[l++]=sc.nextInt();
				    }
				}
//				String First Name,String Last Name,int year,String course,int fees,int marks
				mem[TestPlayer.count++]=new FootballPlayer(a1[0],a1[1],a2[0],a2[1]);
				
			}
			else 
				System.out.println("array full!!");

			break;

		case 4:
				
				for(Player p : mem) {
				if(p ==null) {
					System.out.println("only "+TestPlayer.count+" players.");
					break;
				}
				else {
					System.out.println("---------------------------------");
					System.out.println();
				p.play();
				System.out.println();
				}
			}
			break;
		case 3:
			if (TestPlayer.count < TestPlayer.seats) {
				String[] a1=new String[2];
				int j = 0,l = 0;
				String[] x={"String Name","String Country","int age","int matches won"};
				int[] a2= new int[2];
				for (int i = 0; i < 4; i++) {
				    if(i == 0 || i == 1) {
				    	 System.out.println(x[i]);
				    	a1[j++]=sc.next();
				    }
				    else {
				    	System.out.println(x[i]);
				    	a2[l++]=sc.nextInt();
				    }
				}
//				String First Name,String Last Name,int year,String course,int fees,int marks
				mem[TestPlayer.count++]=new TennisPlayer(a1[0],a1[1],a2[0],a2[1]);
				
			}
			else 
				System.out.println("array full!!");

			break;
		case 0:
			System.exit(0);
			break;

		default:
			System.out.println("select any 5 options 1,2,3,4 or 0 to exit");
			break;
		}
	  }
	  
	sc.close();
	
}
}
