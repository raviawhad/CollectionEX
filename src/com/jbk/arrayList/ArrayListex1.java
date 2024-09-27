package com.jbk.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListex1 {

	private static List<Person> getage(List<Person> al) {
		List<Person> age = al.stream().
				filter(e -> e.getAge() > 30)
				.collect(Collectors.toUnmodifiableList());
		return age;

	}       
	
	private static List<String> getnameWithUppercate(List<Person>al) {
		  List<String> names = al.stream().map(e->e.getName().toUpperCase())
		   .collect(Collectors.toList());
		return  names;
		
	}
		
	
	         
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Person> al = new ArrayList<Person>();//  you can acess overriden 
          //method of chaild class,only method present in parent class , but onlymethod in
		//chaild class will not be access
		al.add(new Person("Raju", 30, 60000));
		al.add(new Person("Boby", 25, 50000));
		al.add(new Person("ramesh", 35, 30000));
		
//		
//		Set <Integer> set = new HashSet<>();
//		set.add(10);
//		set.add(40);
//		set.add(23);
//		set.add(80);
//		set.add(50);
//		set.add(50);
//		System.out.println(set);
//		//Collections.sort(set);
//		Set<Person> a = new HashSet<Person>();
//		a.add(new Person("Raju", 30, 60000));
//		a.add(new Person("Boby", 25, 50000));
//		a.add(new Person("ramesh", 35, 30000));
//		
		
	    Collections.sort( al,new SortBySalary());
	    System.out.println("sorted with salary "+ al);
	     
		
		//Collections.sort(al);
		
		Collections.sort(al, new Comparator<Person>() {

			public int compare(Person o1, Person o2) {
                  
				return o1.getName().compareTo(o2.getName());
			}
		} );
		
		
		

		List<Person> getage = getage(al);
		System.out.println(getage);
		
	     List<String> name = getnameWithUppercate(al);
	      for (String person : name) {
	    	
			System.out.println(person);
		}
	}





	

}
