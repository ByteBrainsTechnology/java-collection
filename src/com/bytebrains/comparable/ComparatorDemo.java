package com.bytebrains.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is used to sort Student list according to supplied
 * comparator interface
 */
public class ComparatorDemo {
	public static void main(String[] args) {

		Student emp1 = new Student("Ganesh", "101");
		Student emp2 = new Student("Ram", "104");
		Student emp3 = new Student("Shyam", "105");
		Student emp4 = new Student("Harshal", "102");

		List<Student> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		System.out.println("Before Sorting : " + list);
		Collections.sort(list, new SortById());
		System.out.println("After Sorting : " + list);
	}
}
