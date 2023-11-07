package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.acts.core.Course;
import com.acts.core.Student;

import utils.Custom_comp;

import static utils.StudentUtils.*;

public class StudentManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty HashMap , to store student details
			HashMap<String, Student> students = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options 1. Student Admission \n" + "2.Get Student Details0.Exit");
					System.out.println("Choose");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter student PRN");
						String prn=sc.next();
						checkForDup(prn,students);
						//=> no dups!
						System.out.println("Enter details : firstName,  lastName,  marks,  enrolledCourse,  dob");
						Student s=new Student(prn, sc.next(), sc.next(),sc.nextInt(),
								parseAndValidateCourse(sc.next()), parseDob(sc.next()));
						students.put(prn, s);
						System.out.println("student admitted!");
						break;
					case 2:
						System.out.println("Enter student PRN");
						getByPRN(sc.next(), students);
						
						break;
					case 3:
						System.out.println("Enter student PRN");
						for(Student s1:students.values())
							System.out.println(s1);
						break;
					case 4:
						System.out.println("Enter student PRN");
						Student x=editCourseByPRN(sc.next(), students);
						x.setEnrolledCourse(parseAndValidateCourse(sc.next()));
						System.out.println("done");
						break;
					case 5:
						System.out.println("Enter student PRN");
						delCourseByPRN(sc.next(), students);
						System.out.println("done");
						break;
					case 6:
						System.out.println("Enter student PRN");
						Course n=parseAndValidateCourse(sc.next());
						for(Student s1:students.values()) 
							if(s1.getEnrolledCourse().equals(n))
								System.out.println(s1);
								
							
						System.out.println("done");
						break;
					case 7:
						System.out.println("All student are");
						students.values().forEach(System.out::println);
						
						break;
					case 8:
						System.out.println("All student are");
						students.values().stream().sorted(new Custom_comp()).forEach(System.out::println);
						
						break;
					case 9:
						System.out.println("All student are");
						int bb=students.values().stream().filter(x1->x1.getEnrolledCourse().toString().equals(sc.next()))
						.mapToInt(Student::getMarks).sum();
						System.out.println("total marks of all student"+bb);
						
						break;
					case 10:
						System.out.println("All student are");
					   String cc= students.values().stream()
						.sorted(new Custom_comp()).findFirst().map(Student::getFirstName).toString();
					   System.out.println(cc);
//						.filter(null)
						
						break;
					case 11:
						System.out.println("All student are");
					   int xx= students.values().stream()
					   .filter(x2->x2.getEnrolledCourse().toString().equals(sc.next()))
						.filter(x1-> x1.getMarks() < 50 ).mapToInt(x1 -> 1).sum();
					   System.out.println(xx);

						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					// to read off pending i/ps from the scanner
					sc.nextLine();
				}
			}
		}

	}

}
