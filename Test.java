package com.assign;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Student> l =
				Arrays.asList(
							  new Student(101,"Amol","Aghav","Beed",60,"Science","Male",30)
							 ,new Student(102,"Sachin","Aghav","Beed",30,"Arts","Male",25)
							 ,new Student(103,"Swara","Aghav","Shirur",50,"Science","female",15)
							 ,new Student(104,"Jay","Khedkar","Beed",40,"Arts","Male",30)
							 ,new Student(105,"Balu","Khedkar","Pathardi",70,"Science","Male",35)
							 ,new Student(106,"Ram","Suryavanshi","Heaven",100,"All","Male",100)
							 );
		
		//Rank between 20 to 50
//		l.stream()
//			.filter(f->(f.getRank()>20) && (f.getRank()<50))
//				.forEach(f->System.out.println(f));
//----------------------------------------------------------------------------------------------		
		//Count STudent in each dept
//		Map<String, Long> collect = l.stream()
//										.collect(Collectors.groupingBy(Student::getDept
//											,Collectors.counting()));
//		System.out.println(collect);
//----------------------------------------------------------------------------------------------		
		//Count total student
//		long count = l.stream()
//						.count();
//		System.out.println(count);
//----------------------------------------------------------------------------------------------		
		//Max age of student
//		Student student = l.stream()
//						     	.collect(Collectors.maxBy(Comparator.comparing(Student::getAge)))
//									.get();
//		System.out.println(student.getAge());
		
		//OR
		
//		Student student2 = l.stream()
//							    .max(Comparator.comparing(Student::getAge))
//									.get();
//		System.out.println(student2.getAge());
//----------------------------------------------------------------------------------------------		
		//Students whose age less than 30
//		l.stream()
//			.filter(f->f.getAge()<30)
//				.forEach(f->System.out.println(f));
//----------------------------------------------------------------------------------------------		
		//All dept names
//		l.stream()
//			.map(f->f.getDept())
//				.distinct()
//					.forEach(f->System.out.println(f));
		
		//OR
		
//		Set<String> collect = l.stream()
//								.map(f->f.getDept())
//									.collect(Collectors.toSet());
//		System.out.println(collect);
//----------------------------------------------------------------------------------------------		
		//avg of male age
//		double d = l.stream()
//			.filter(f->f.getGender().equals("Male"))
//				.map(f->f.getAge())
//					.mapToInt(f->f)
//						.average()
//							.getAsDouble();
//		System.out.println(d);
		
		//OR
		
//		Double d1 = l.stream()
//					.filter(f->f.getGender().equals("Male"))
//						.collect(Collectors.averagingInt(Student::getAge));
//		System.out.println(d1);	
//----------------------------------------------------------------------------------------------		
		//Find student whose address is Beed and sort them
//		l.stream()
//			.filter(f->f.getAddrs().equals("Beed"))
//				.sorted(Comparator.comparing(Student::getF_Name))
//					.forEach(f->System.out.println(f));
//----------------------------------------------------------------------------------------------		
		//Students whose f_Name starts with "S"
//		l.stream()
//			.filter(f->f.getF_Name().startsWith("S"))
//				.forEach(f->System.out.println(f));
//----------------------------------------------------------------------------------------------		
		//student who has second rank
//		Student student = l.stream()
//							.sorted(Comparator.comparing(Student::getRank)
//									.reversed())
//										.skip(1)
//											.findFirst()
//												.get();
//		System.out.println(student);			
//----------------------------------------------------------------------------------------------		
		//Sort student by their rank
//		l.stream()
//			.sorted(Comparator.comparing(Student::getRank))
//				.forEach(f->System.out.println(f));
//----------------------------------------------------------------------------------------------		
		//Highest rank in each dept
//		Map<String, Optional<Student>> collect = l.stream()
//													.collect(Collectors.groupingBy(Student::getDept
//															,Collectors.maxBy(Comparator.comparing(Student::getRank))));
//		System.out.println(collect);
//----------------------------------------------------------------------------------------------		
		//avg rank in each dept
		Map<String, Double> collect = l.stream()
										.collect(Collectors.groupingBy(f->f.getDept()
												,Collectors.averagingInt(Student::getRank)));
		System.out.println(collect);
		
		
	}
}
