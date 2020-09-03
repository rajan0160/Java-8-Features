package StreamsWithCollections;

import java.util.stream.Stream;

public class StreamObjectwithOfMethod {

	public static void main(String[] args) {
		Stream i=Stream.of(9,88,777,6666,55555,444444,3333333);
		i.forEach(System.out::println);
	}

}
