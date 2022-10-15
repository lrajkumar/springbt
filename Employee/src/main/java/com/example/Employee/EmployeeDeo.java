package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDeo {
	@Autowired
	EmployeeRepository empRep;
	public String add(Employer emp) {
		empRep.save(emp);
		
		return "Successfully saved";
	}
	public String updateAdd(Employer emp) {
		empRep.save(emp).getId();
		return "Data has been updated";
	}
	public String deleteinfo(int id) {
		empRep.deleteById(id);
		return "Data has been deleted";
	}
	public List <Employer> getAllinfo(){
		return empRep.findAll();
	}
	public Employer getFindid(int id) {
		return empRep.findById(id).get();
		
	}
	public String bulkData(List<Employer> emp) {
		 empRep.saveAll(emp);
		 return "Data has been updated";
	}
	public String deleteAll() {
		empRep.deleteAll();
		return "Data has been deleted";
	}
	public List<Employer> getBySalaryRange(int salary1,int salary2){
		return empRep.getBySalaryRange(salary1,salary2);
	}
	public List<Integer> getSalary() {
		return empRep.getSalary();
	}
	public Employer getBySal(int id) {
		return empRep.findById(id).get();
		 
	}
	

}
