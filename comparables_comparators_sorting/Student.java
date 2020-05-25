package Java_CollectionFrameWork.comparables_comparators_sorting;

public class Student {
	
	int Marks;
	String Name;
	
	
	public Student(int marks, String name) {
		super();
		Marks = marks;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [Marks=" + Marks + ", Name=" + Name + "]";
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


/* COMPARABLE - INTERFACE (compareTo() - Method) : -  */
	
	//@Override
//	public int compareTo(Student arg0) {
//		
//		if(this.Marks > arg0.Marks) {
//			return(-1);
//		}
//		
//		else if(this.Marks < arg0.Marks) {
//			return(1);
//		}
//		
//		return(0);
//		
//	}

}
