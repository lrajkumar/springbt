package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDeo empDeo;
	public String add(Employer emp) {
		return empDeo.add(emp);
	}
	public String updateAdd(Employer emp) {
		return empDeo.add(emp);
	}
	public String deleteinfo(int id) {
		return empDeo.deleteinfo(id);
	}
	public List <Employer> getAllinfo(){
		return empDeo.getAllinfo();
	}
	public Employer getFindid(int id) {
		return empDeo.getFindid(id);
	}
	public String bulkData(List <Employer> emp) {
		return empDeo.bulkData(emp);
	}
	public String deleteAll() {
		return empDeo.deleteAll();
	}
	public List <Employer> getBySalaryRange(int salary1,int salary2){
		return empDeo.getBySalaryRange(salary1,salary2);
	}
	public List<Integer> getSalary(){
		return empDeo.getSalary();
	}
	public int getBySal(int id) {
		return empDeo.getBySal(id).getSalary();
	}
}
