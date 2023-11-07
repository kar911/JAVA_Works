package test_inheritance;
import exceptions.*;
import inhertance2.Faculty;
import inhertance2.Person;
import inhertance2.Student;

import java.util.Scanner;

public class TestEquals {
public static void main(String[] args) {
	
	try (Scanner s=new Scanner(System.in)){
		Person[] p1= {new Student(s.next(),s.next(), s.nextInt(),s.next(), s.nextInt(), s.nextInt()),		new Student(s.next(), s.next(), s.nextInt(), s.next(), s.nextInt(), s.nextInt()),	new Faculty(s.next(), s.next(), s.nextInt(), s.next())};
		name(p1[0],p1[1],p1[2]);
	}
	catch(InvalidInputException e) {
		System.out.println(e.getMessage());
	}
}
static void name(Person s1,Person s2,Person f1) throws InvalidInputException {

	if (s1.equals(f1)) {
		System.out.println(s1+"\n"+f1);
	}else {
		throw new InvalidInputException();
	}
	
	if (s2.equals(f1)) {
		System.out.println(s2+"\n"+f1);
	}else {
		System.out.println("klop");
		throw new InvalidInputException();
	}
}
}
