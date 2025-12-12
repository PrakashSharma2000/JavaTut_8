package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadList {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		// Print each value from a list using string
		fruits.stream().forEach(a -> System.out.println(a));
		
		// Using map
		
		List <Students> students = new ArrayList<>();
		
		students.add(new Students("Nikhil","12th",18,100));
		students.add(new Students("Amar","12th",12,200));
		students.add(new Students("Jay","12th",16,500));
		
		
		List newStudent=students.stream()
		.map(a -> new Students(
				a.getsName(),
				a.getsClass(),
				a.getsAge()+4,
				a.getRollNumber()-10
				))
		.collect(Collectors.toList());
			
		newStudent.stream().forEach(a-> System.out.println(a.toString()));	
		
		//filter
		List testStudent = students.stream()
				.filter(element -> element.getsAge()>100)
				.map(a -> new Students(
						a.getsName(),
						a.getsClass(),
						a.getsAge(),
						a.getRollNumber()))
				.collect(Collectors.toList());
		
		testStudent.stream().forEach(a-> System.out.println(a.toString())) ;
		
		// Builder
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		
		streamBuilder.forEach(a->System.out.println(a));
		
		// Builder
		Stream<Students> streamStudents =
			Stream.<Students>builder()
			.add(new Students("Gaurav","12th",18,300))
			.add(new Students("Akhilesh","12th",20,600))
			.build();
				
		streamStudents.forEach(a->System.out.println(a));
		
		// Generate
		System.out.println("Generating new values with same data");
		int a=10;
		Stream<Integer> streamGenerate= Stream.generate(() -> a).limit(10);
		streamGenerate.forEach(a1-> System.out.println(a1));
		
		//iterate
		System.out.println("Generating new int values with diffrence of 2  ");
		Stream<Integer> streamIterated = 
				Stream
				.iterate(a, n -> n + 2)
				.limit(20);
		streamIterated.forEach(t->System.out.println(t));

		
	}
	
	
}


