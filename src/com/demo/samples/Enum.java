package com.demo.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Enum {
 
	
	enum listE {
	    LE1,
	    LE4,
	    LE2,
	    LE3
	}

	public static void main(String[] args) {
	    List<String> originalList = Arrays.asList("LE1", "LE2", "LE4", "LE3");

	    System.out.println("Original List: " + originalList);

	    for(listE t: listE.values()){
	    	  System.out.println(t);
	    	}


	    System.out.println("Sorted List: " + originalList);
	}

}
