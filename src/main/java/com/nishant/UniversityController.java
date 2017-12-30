package com.nishant;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Universities")
public class UniversityController {

	private UniversityRepository universityRepo;

	public UniversityController(UniversityRepository universityRepo) {
		this.universityRepo = universityRepo;
	}
	
	@GetMapping("/all")
	public List<University> getallUniversity()
	{
 List<University> universities = this.universityRepo.findAll();
 
 return universities;
 
	}
	
}
