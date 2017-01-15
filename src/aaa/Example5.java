package aaa;

import java.util.Arrays;
import java.util.List;

public class Example5 {
	public static void main(String args[]) {

		List<Person> persons = Arrays.asList(
				new Person("mkyong", 20), 
				new Person("michael", 21),
				new Person("lawrence", 23),
				new Person("michael", 23));

		int age = persons.stream().filter(x -> "michael".equals(x.getName())).map(Person::getAge).findAny().orElse(0);

		System.out.println(age);
	}
}