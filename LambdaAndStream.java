import java.util.*;
import java.util.stream.*;

public class LambdaAndStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "Cooper"));
        people.add(new Person("Bob", 25, "Marley"));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Diana", 28));
        people.add(new Person("Dida", 55, "Pasta"));
        people.add(new Person("Eunmelinchen", 10098, "Superalt"));

        // Stream API to filter and sort
        List<Person> filteredAndSorted = people.stream()
                .filter(p -> p.getAge() > 28) // Filter people older than 28
                .filter( p ->  p.getName().contains("a") || p.getLastName().contains("oo") )
                .sorted(Comparator.comparingInt(Person::getAge)) // Sort by age
                .collect(Collectors.toList());

        filteredAndSorted.forEach(System.out::println);
	}

}
