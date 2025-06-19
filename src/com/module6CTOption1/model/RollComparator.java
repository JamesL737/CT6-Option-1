package com.module6CTOption1.model;

import java.util.*;

/**
 * Class to compare the roll number of student objects
 */
public class RollComparator implements Comparator<Object>{

	/**
	 * takes two objects, casts them to student objects
	 * @return difference or sum of student 1 roll number and student 2 roll number
	 */
	@Override
	public int compare(Object o1, Object o2) {
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		return s1.rollNum - s2.rollNum;
	}
}
