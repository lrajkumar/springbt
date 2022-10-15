package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@PostMapping(value="/adds")
	
	public String setData(@RequestBody Employer emp) {
	
		return empService.add(emp);
		
	}
	@PutMapping(value="/update")
	public String updateinfo(@RequestBody Employer emp) {
		return empService.add(emp);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteinfo(@PathVariable int id) {
		return empService.deleteinfo(id);
	}
	@GetMapping(value="/getAll")
	public List <Employer> getAllinfo() {
		return empService.getAllinfo();
	} 
	@GetMapping(value="/findId/{id}")
	public Employer getFindid(@PathVariable int id) {
		return empService.getFindid(id);
	}
	@PostMapping(value="/saveAll")
	public String bulkData(@RequestBody List<Employer> emp) {
		return empService.bulkData(emp);
	}
	@DeleteMapping(value="/deleteAlls")
	public String deleteAll() {
		return empService.deleteAll();
	}
	@GetMapping(value="getBySalary/{from}/{to}")
	public List<Employer> getBySalaryRange(@PathVariable("from")int salary1, @PathVariable("to")int salary2 ){
		return empService.getBySalaryRange(salary1,salary2);
	}
	@GetMapping(value="/salary")
	public List <Integer> getSalary() {
		return empService.getSalary();
	}
	@GetMapping(value="/idbysal/{id}")
	public int getBySal(@PathVariable int id) {
		return empService.getBySal(id);
	}
		
	}


