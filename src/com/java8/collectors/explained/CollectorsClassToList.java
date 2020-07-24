package com.java8.collectors.explained;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsClassToList {

	public static void main(String[] args) {
		List<Students> studentList = new ArrayList<Students>();
		studentList.add(new Students(1,"vamshi",23));
		studentList.add(new Students(2,"krishna",24));
		studentList.add(new Students(2,"neela",25));
		List<String> studentNames = studentList.parallelStream().map(Students::getSname).collect(Collectors.toList());
	    System.out.println("Get Student Names From List "+studentNames);
	    List<Integer> studentIds = studentList.parallelStream().map(Students::getId).collect(Collectors.toList());
	    System.out.println("Get Student Id's From List "+studentIds);
	}
}
