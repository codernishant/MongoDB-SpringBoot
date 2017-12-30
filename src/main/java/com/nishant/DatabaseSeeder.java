package com.nishant;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

	private UniversityRepository  universityRepos;
	
	
	public DatabaseSeeder(UniversityRepository universityRepos) {
		this.universityRepos = universityRepos;
	}


	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
	
		University Jadavpur = new University(
				"Jadavpur University",
				new Address ("Kolkata","India"),
				Arrays.asList(
						new Review("Archismaan"," Best University in West Bengal",
								7),
						
						new Review("Shreya","good and positive enviroment",
								8)
						)	
				);
		
		University iisc = new University(
				"Indian Intitute of Science",
				new Address ("Banglore","India"),
				Arrays.asList(
						new Review("Nishant"," Best University in Indian for research",
								10)	
						)
				);	
		University mit = new University(
				"MIT",
				new Address ("Boston","USA"),
				Arrays.asList(
						new Review("Nishant"," Best University for research",
								10)	
						)
				);
		
		this.universityRepos.deleteAll();
		
		List<University> university = Arrays.asList(Jadavpur,iisc,mit);
		this.universityRepos.save(university);
		
		
	}

	
}
