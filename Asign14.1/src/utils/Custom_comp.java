package utils;

import java.util.Comparator;

import com.acts.core.Student;

public class Custom_comp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return ((Integer)o1.getMarks()).compareTo(o2.getMarks());
	}

}
