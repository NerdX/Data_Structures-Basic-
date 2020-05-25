package Java_CollectionFrameWork.comparables_comparators_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		
		List<Student> Students = new ArrayList<Student>();
		
		Students.add(new Student(23, "Jay"));
		Students.add(new Student(21, "Anjaniy"));
		Students.add(new Student(25, "Zlk"));
		Students.add(new Student(15, "Vraj"));
		Students.add(new Student(21, "Jane"));
		
		/* Comparator.comparing() -> thenComparing() -> reversed() : - */
		Collections.sort(Students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		Students.forEach(System.out::println);

	}
	
}

/* COMPARATOR - INTERFACE(compare() - Method) : -  */

//class ByNameAndThenMarks implements Comparator<Student>{
//
//	@SuppressWarnings("unlikely-arg-type")
//	@Override
//	public int compare(Student arg0, Student arg1) {
//		
//		if(arg0.Name.equals(arg1)) {
//			return(arg0.Marks - arg1.Marks);
//		}
//		else {
//			return(arg0.Name.compareTo(arg1.Name));
//		}
//		
//		
//	}
//	
//}
