package com.module6CTOption1.model;

import java.util.*;

/**
 * Class to compare the name of student objects
 */
public class NameComparator implements Comparator<Object> {

	/**
	 * takes two objects, cast them to student objects
	 * @return difference or sum of student 1 name and student 2 name
	 */
	@Override
	public int compare(Object o1, Object o2) {
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		return s1.name.compareTo(s2.name);	
	}	
}
