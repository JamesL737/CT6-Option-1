package com.module6CTOption1.model;

import java.util.ArrayList;

/**
 * Selection Sort example program
 * @author ljame
 * Class and driver method to sort two array lists of student objects by name and roll number
 * using a selection sort algorithm
 */
public class SelectionSort {
	/**
	 * selection sort method
	 * @param studList array list of student objects
	 * @param sortMethod string dictates by what parameter the array should be sorted by
	 */
	public static void selectionSort(ArrayList<Student> studList, String sortMethod) {
		int i;
		int j;
		int smallest;
		Student temp;
		
		//sort by name
		if(sortMethod.equalsIgnoreCase("name")) {
			
			//create name comparator object for name comparisons
			NameComparator nameComp = new NameComparator();
			
			for(i = 0; i < studList.size() - 1; i++) {
				for(i = 0; i < studList.size() - 1; i++) {
					//set current smallest to index at i
					smallest = i;
					
					for(j = i + 1; j < studList.size() - 1; j++) {		
						//if comparison results in a negative integer, set smallest name to name at index j
						if(nameComp.compare(studList.get(j), studList.get(smallest)) < 0) {
							smallest = j;
						}
					}

					//swap "smallest" name into sorted part of list
					temp = studList.get(i);
					studList.set(i, studList.get(smallest));
					studList.set(smallest, temp);
				}
			}
		}
		//sort by roll number
		else if(sortMethod.equalsIgnoreCase("rollNum")) {
			
			//create roll number comparator object for roll number comparisons
			RollComparator rollComp = new RollComparator();
			
			for(i = 0; i < studList.size() - 1; i++) {
				for(i = 0; i < studList.size() - 1; i++) {
					//set current smallest to index at i
					smallest = i;
					
					for(j = i + 1; j < studList.size() - 1; j++) {
						//if comparison results in a negative integer, set smallest roll number to roll number at index j
						if(rollComp.compare(studList.get(j), studList.get(smallest)) < 0) {
							smallest = j;
						}
					}
					
					//swap smallest roll number into sorted part of list
					temp = studList.get(i);
					studList.set(i, studList.get(smallest));
					studList.set(smallest, temp);
				}
			}
		}
		//sorting type passed is unsupported otherwise
		else {
			System.out.println("Sorting type is not supported!");
		}
	}

	/**
	 * Driver method
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		//populate array with student objects
		studentList.add(new Student(10, "Arthur Claudeland", "1889 Bakers St."));
		studentList.add(new Student(5, "Walter Gils", "8401 Spice Blvd."));
		studentList.add(new Student(1, "Harvey Holt", "8880 Spice Blvd."));
		studentList.add(new Student(16, "Susanne Ghile", "1058 Mercury Ct."));
		studentList.add(new Student(18, "Takumi Tsujita", "2021 Dusk Dr."));
		studentList.add(new Student(7, "Ashley Moorne", "107 Throne Rd."));
		studentList.add(new Student(25, "Cosmo DeVille", "9974 Brine St."));
		studentList.add(new Student(11, "Lucien Gaiasonnaire", "2666 Septim Ct."));
		studentList.add(new Student(2, "Brooke Vallis", "1111 Meadow Park Dr."));
		studentList.add(new Student(29, "Abigail Norell", "5054 Golf St."));
		
		//display unsorted list of students
		System.out.println("Unsorted List of Students: ");
		for(int i = 0; i < studentList.size() - 1; i++) {
			System.out.println(studentList.get(i));
		}
		
		//sort list by name
		System.out.println("Sorted by Name: ");
		selectionSort(studentList, "name");
		//display sorted list
		for(int i = 0; i < studentList.size() - 1; i++) {
			System.out.println(studentList.get(i));
		}
		
		//sort list by roll number
		System.out.println("Sorted by Roll Number: ");
		selectionSort(studentList, "rollNum");
		//display sorted list
		for(int i = 0; i < studentList.size() - 1; i++) {
			System.out.println(studentList.get(i));
		}
	}
}
