package com.module6CTOption1.model;

import java.util.InputMismatchException;

/**
 * Student class
 */
public class Student {

	/**
	 * roll number, name and address variables
	 */
	protected int rollNum;
	protected String name;
	protected String address;
	
	/**
	 * default constructor
	 */
	public Student(){
		rollNum = 0;
		name = "No Name";
		address = "No Address";
	}
	
	/**
	 * parameterized constructor
	 * @param num student's roll number
	 * @param name student's name
	 * @param address student's address
	 */
	public Student(int num, String name, String address) {
		try {
			this.rollNum = num;
			this.name = name;
			this.address = address;
		}
		catch(InputMismatchException excpt){
			System.out.println("Student info input is not valid!");
		}
	}
	
	/**
	 * method to print student data
	 */
	public String toString() {
		return "Roll Number: " + this.rollNum + "\t\t| Name: " + this.name + "\t\t| Address: " + this.address;
	}
}
