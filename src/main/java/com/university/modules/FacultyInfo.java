package com.university.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.university.pojos.Faculty;

@RestController
@RequestMapping("/fct")
public class FacultyInfo {
	
	@Autowired
	FacultyInfoServices fcty;
	
	@RequestMapping(value="/faculty")
	public String saveFaculty(@RequestBody Faculty fclg) {
		System.out.println("Haiiiiiiii");
		
		
	System.out.println(fclg.getFacultyName()+" "+fclg.getFsubject());
	fcty.saveFaculty(fclg);
		return "200";
		
		
	}
}
