package method_overloading;

import java.util.Scanner;

import inhertance2.*;

public class Application {
	private static int seats;
	private static boolean exit;
	private static int count;

  public static void main(String[] a) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number of Seats :");
	  Application.seats =sc.nextInt();
	  Person[] mem =new Person[ Application.seats ];
	  
	  while( ! Application.exit) {
		  System.out.println("press: \n 1 > student register \n 2 > faculty register\n 3 > show All members \n 4 > show Specific menber \n 0 > exit application");
		  switch (sc.nextInt()) {
		case 1:
			if (Application.count < Application.seats) {
				String[] a1=new String[3];
				int j = 0,l = 0;
				String[] x={"String First Name","String Last Name","int year","String course","int fees","int marks"};
				int[] a2= new int[3];
				for (int i = 0; i < 6; i++) {
				    if(i == 0 || i == 1||i == 3) {
				    	 System.out.println(x[i]);
				    	a1[j++]=sc.next();
				    }
				    else {
				    	System.out.println(x[i]);
				    	a2[l++]=sc.nextInt();
				    }
				}
//				String First Name,String Last Name,int year,String course,int fees,int marks
				mem[Application.count++]=new Student(a1[0],a1[1],a2[0],a1[2],a2[1],a2[2]);
				
			}
			else 
				System.out.println("house full!!");

			break;
		case 2:
			if (Application.count < Application.seats) {
				String[] a1=new String[3];
				int j = 0,l = 0;
				String[] x={"String First Name","String Last Name" ,"int yrsOfExperience", "String sme"};
				int[] a2= new int[1];
				for (int i = 0; i < 4; i++) {
				    if(i == 0 || i == 1||i == 3) {
				    	 System.out.println(x[i]);
				    	a1[j++]=sc.next();
				    }
				    else {
				    	System.out.println(x[i]);
				    	a2[l++]=sc.nextInt();
				    }					
				}
//				String First Name,String Last Name,int year,String course,int fees,int marks
				mem[Application.count++]=new Faculty(a1[0],a1[1],a2[0],a1[2]);
				
			}
			else 
				System.out.println("house full!!");
			break;

		case 3:
				
				for(Person p : mem) {
				if(p !=null) {
					System.out.println("---------------------------------");
					System.out.println();
				System.out.println(p);
				System.out.println();
				}
			}
			break;
		case 4:
			System.out.println("Provide a seat Number : ");
			int qw =sc.nextInt() - 1;
			if(qw <= Application.count  && qw > 0) {
				System.out.println(mem[qw]);
			}
			else {
				System.out.println("max filled seats are "+(Application.count));
			}
			break;
		case 0:
			System.exit(0);
			break;
		case 5:
			System.out.println("Provide a seat Number : ");
			int qw1 =sc.nextInt() - 1;
			if(qw1 <= Application.count -1 && qw1 > -1) {
				System.out.println(mem[qw1]);
//				mem[qw1].teach();
//				if(mem[qw1].getClass().getName() == "Student") {
//				((Student)mem[qw1]).study();
//				}
//				else {
//					((Faculty)mem[qw1]).teach();
//				}
//				System.out.println(mem[qw1].getClass());
//				((mem[qw1].getClass())mem[qw1]).study();
	
				if(mem[qw1] instanceof Student) {
				((Student)mem[qw1]).study();
				}
				else {
					((Faculty)mem[qw1]).teach();
				}
			}
			else {
				System.out.println("max filled seats are "+(Application.count));
			}
			break;

		default:
			System.out.println("select any 5 options 1,2,3,4 or 0 to exit");
			break;
		}
	  }
	  
	sc.close();
	
}
}
