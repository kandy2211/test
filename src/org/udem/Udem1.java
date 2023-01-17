package org.udem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Udem1 {
	public static void main(String[] args) {

		List<String> a = new ArrayList<>();

		a.add("kanda");
		a.add("samy");
		a.add("kan");
		a.add("k");
		a.add("sami");

		System.out.println(a);

//		for (int i = 0; i < a.size(); i++) {
//
//			String string = a.get(i);
//
//			System.out.println(string);
//
//		}

		long c = a.stream().filter(s -> s.startsWith("k")).count();

		System.out.println("names starts with:" + c);
		
		a.stream().filter(s->s.length()>=5).forEach(s->System.out.println("2nd:"+s));

		long d = Stream.of("kanda", "samy", "kan", "k", "sami").filter(s -> s.startsWith("k")).count();

		System.out.println("using streams:" + d);

	}

}
