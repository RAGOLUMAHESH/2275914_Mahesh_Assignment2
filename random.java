package com.assignment2.mahesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class random {

	public static void main(String[] args) {
		
		String [] array = {"Bhargavi","Divya","Mahesh","Ravi","Raja"};
		List <String> arrayList = new ArrayList <>(Arrays.asList(array));
		
		Collections.shuffle(arrayList);
		
		System.out.println(arrayList);
		
        System.out.println("Using streams:");
        arrayList.stream().forEach(System.out::println);
        
        System.out.println("\nUsing enhanced for loop:");
        for (String arg : arrayList) {
            System.out.println(arg);
        }

	}

}
