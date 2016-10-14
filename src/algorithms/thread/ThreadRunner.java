package algorithms.thread;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ThreadRunner {

	public static int total(List <Integer> numbers, Predicate <Integer> selector) {
		return numbers.stream()
				.filter(selector)
				.map(e -> e*2)
				.reduce(0, (c, e) -> c + e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		List <Integer> values = Arrays.asList(1, 2, 3, 4);
		System.out.println(total(values, e -> true));
		System.out.println(total(values, e -> e%2 == 0));
		System.out.println(total(values, e -> e%2 != 0));
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}

}
