package org.udem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class udem2 {
	public static void main(String[] args) {

		List<String> a = new ArrayList<>();

		a.add("kanda");
		a.add("samy");
		a.add("kan");
		a.add("k");
		a.add("sami");

		Stream.of("kanda", "samy", "kan", "k", "sami").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.print(s));

	}

}
