package com.jbk.arrayList;

import java.util.Comparator;

public class SortByAge implements Comparator {

	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}

	public int compare1(Person o1, 	Person o2) {
		return o1.getAge()-o2.getAge();
	}

}
