package com.jbk.arrayList;


	public class Person  implements Comparable<Person>
	 {
	    private String name;
	    private int age;
	    private double salary;

	    public Person(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    // Getters and toString method for displaying information
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
	    }

		@Override
		public int compareTo(Person o) {
		
			return this.getAge()-o.getAge();
		}
	}


