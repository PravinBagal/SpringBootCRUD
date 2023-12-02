package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	HomeRepository hr;

	@PostMapping("/SaveStudent")
	public Student addData(@RequestBody Student s) {
		return hr.save(s);
	}

	@GetMapping("/findAllData")
	public List<Student> getalldata() {
		return hr.findAll();
	}
	
	@GetMapping("/rollno/{rollno}")
	public Optional<Student> getsingledata(@PathVariable ("rollno")int rollno)
	{
		return hr.findById(rollno);			
	}
	
	@PutMapping("/updateData")
	public Student updatedata(@RequestBody Student s)
	{
		return hr.save(s);
	}
	
	@DeleteMapping("/deletedata/{rollno}")
	public String daletedata(@PathVariable ("rollno")int rollno)
	{
		hr.deleteById(rollno);
		return "Data Delete Successfully";
	}
}
