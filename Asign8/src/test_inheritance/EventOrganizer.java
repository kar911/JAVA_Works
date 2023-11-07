package test_inheritance;

import java.util.Scanner;

import inhertance2.*;

public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many max event members ?");
		// create Person[] --> array of Person type of refs , that can refer
		// to a Student or a Faculty
		Person[] members = new Person[sc.nextInt()];
		// add counter
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println(
					"Options : 1. Student Registration " + "2. Faculty Registration 3. Display All member details"
							+ "4. Display Specific Member details" + " 5. Execute specific functionailty 0. Exit ");
			System.out.println("Choose an Option");
			switch (sc.nextInt()) {
			case 1:
				// check if event has enough space
				if (counter < members.length) {
					System.out.println("Enter student details : frst name,last name,year, course, fees, marks");
					members[counter] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
							sc.nextInt()); // up casting : Person ref ---> Student class instance
					System.out.println("Student registered....");
					counter++;
				} else
					System.out.println("Event Full !!!!");
				break;
			case 2:
				// check if event has enough space
				if (counter < members.length) {
					System.out.println("Enter faculty details : frst name,last name,years of exp, sme");
					members[counter] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());// up casting
					System.out.println("Faculty registered....");
					counter++;
				} else
					System.out.println("Event Full !!!!");
				break;
			case 3:
				System.out.println("All members details");
				for (Person p : members) // p=members[0],p=members[1] ....
					if (p != null)
						System.out.println(p);
				break;
			case 4:
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				// validation
				if (index >= 0 && index < counter)
					System.out.println(members[index]);
				else
					System.out.println("Invalid seat no !!!!!!!!!!!!!");
				break;

			case 5:
				System.out.println("Enter seat no");
				index = sc.nextInt() - 1;
				// validation
				if (index >= 0 && index < counter) {
					Person p=members[index];
					if(p instanceof Student)
					((Student)p).study();
					else
						((Faculty)p).teach();
				} else
					System.out.println("Invalid seat no !!!!!!!!!!!!!");
				break;

			case 0:
				exit = true;
				break;
			}
		}
		sc.close();

	}

}
