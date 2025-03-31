package com.test.jan;

//insertion order preserse and dublicated not allowed
import java.util.LinkedHashSet;
import java.util.Set;


public class ArrayListDemo3 {

	public static void main(String[]args) {
	Set<Integer>set= new LinkedHashSet<Integer>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(20);
	set.add(10);
	set.add(40);
	
	System.out.println(set);
	}
}
