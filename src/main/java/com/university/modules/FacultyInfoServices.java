package com.university.modules;

import org.springframework.stereotype.Service;

import com.university.pojos.Faculty;

@Service
public class FacultyInfoServices {

	public void saveFaculty(Faculty faculty) {
		
		System.out.println(" Hi--FacultyInfoServices!!");
		System.out.println(faculty.getFacultyName()+" "+faculty.getFsubject()+" "+faculty.getFacultyGender());
		
		
	}
	
	

}
