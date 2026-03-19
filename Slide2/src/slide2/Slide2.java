package slide2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Slide2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(8);
		
		System.out.println(list.toString());
		list.sort(null);
		System.out.println(list.toString());
		System.out.println("");
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student("An", 7.6));
		listStudent.add(new Student("Nam", 4.6));
		listStudent.add(new Student("Lan", 8.0));
		listStudent.add(new Student("Binh", 6.0));
		
		for(Student s : listStudent) {
			System.out.println(s.toString());
		}
		
		Comparator<Student> comMark = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.marks.compareTo(o2.marks);
			}
		};
		
		Comparator<Student> comFullName = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.fullName.compareTo(o2.fullName);
			}
		};
		
		listStudent.sort(comMark);
		System.out.println("ds moi");
		for(Student s : listStudent) {
			System.out.println(s.toString());
		}
		
//		listStudent.sort(comFullName);
//		System.out.println("ds moi");
//		for(Student s : listStudent) {
//			System.out.println(s.toString());
//		}
		
//		listStudent.sort(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.marks.compareTo(o2.marks);
//			}
//
//			
//			
//		});
		
		listStudent.sort((s1,s2) -> s1.marks.compareTo(s2.marks));
		System.out.println("ds moi");
		for(Student s : listStudent) {
			System.out.println(s.toString());
		}
		
		List<String> lS = Arrays.asList("An","Sang","Dung","Binh");
		lS.forEach(a -> {
			System.out.println(a);
		});
		
		listStudent.forEach(st->{
			System.out.println(st.toString());
		});
		// Gọi hàm với các Lambda khác nhau
		checkAndPrint("Java", n -> n.startsWith("J"));
		checkAndPrint("Python", n -> n.contains("l"));
	
	}
	public static void checkAndPrint(String s, Predicate<String> condition) {
	    if (condition.test(s)) {
	        System.out.println(s);
	    }
	}
}
