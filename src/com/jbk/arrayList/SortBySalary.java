package com.jbk.arrayList;

import java.util.Comparator;

public class SortBySalary implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		 
		return (int) (o1.getSalary()>o2.getSalary()?1:o1.getSalary()==o2.getSalary()?0:-1);
	}

}
