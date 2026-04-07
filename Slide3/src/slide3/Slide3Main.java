package slide3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Slide3Main {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<Student>(
			Arrays.asList(new Student("An", 8.0)
					,new Student("Sương", 4.0)
					,new Student("Dũng", 9.0)
					,new Student("Lan", 3.0)
					)
		);
		
		System.out.println("DS sinh viên:");
		for(Student s : ls) {
			if(s.marks >= 5)
				System.out.println(s.toString() + " Đậu");
			else
				System.out.println(s.toString() + " Rớt");
		}
		
		Predicate<Student> isPass = sv -> sv.marks >= 5;
		
		System.out.println("\nDS sinh viên:");
		for(Student s : ls) {
			if(isPass.test(s))
				System.out.println(s.toString() + " Đậu");
			else
				System.out.println(s.toString() + " Rớt");
		}
		
		Consumer<Student> checkandprint = sv -> {
			if(isPass.test(sv)) {
				System.out.println(sv.toString());
			}
		};
		System.out.println("Check and Print");
		ls.forEach(checkandprint);
		
		Function<Student,String> getInfo = sv -> sv.marks>=5?sv.toString() + " Đậu": sv.toString() + " Rớt";
		
		System.out.println("\nGet info");
		for(Student s:ls) {
			System.out.println(getInfo.apply(s));
		}
		
		System.out.println("Method Reference");
		ls.forEach(System.out::println);
	}
}
