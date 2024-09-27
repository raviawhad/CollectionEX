package com.jbk.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
	List<Integer> ll = new LinkedList<>();
	List<Integer> al = new ArrayList<>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(2, 40);
	al.add(90);
	al.add(1, 80);
	al.addAll(ll);
	System.out.println(ll);
	System.out.println(al);

	LinkedList l = new LinkedList<>();
//	l.add(10);
//	l.add(20);
//	l.add(30);
//	l.addFirst(50);
//	l.addLast(70);
//	System.out.println(l);
//	System.out.println(l.peekFirst());
//	System.out.println(l.peekLast());
//	System.out.println(l.peek());
//	System.out.println(l.pollFirst());
//	System.out.println(l.pollLast());
//	
	System.out.println(l);
	
	l.push(10);
	l.push(20);
	l.push(30);
	l.push(40);
	l.push(50);
	System.out.println(l);
System.out.println(  l.pop());
System.out.println(l.pop());
//    System.out.println(  l.getFirst());
//    System.out.println(l.peekFirst());
//	((LinkedList<Integer>) ll).peekFirst();
//   System.out.println(ll);
	}

}
