package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findbyId =====");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: findAll ======");
		List<Department> list = departmentDao.findAll();
		
		for(Department department : list) {
			System.out.println(department);
		}
		
//		System.out.println("=== TEST 3: insert ====== ");
//		Department newDep = new Department(null, "D3");
//		departmentDao.insert(newDep);
//		System.out.println("Inserted! New id: " +newDep.getId());
//		
//		System.out.println("=== TEST 4: update =====");
//		dep.setName("New Department");
//		departmentDao.update(dep);
//		System.out.println("Update completed");
		
		System.out.println("Enter id for delete test: ");
		departmentDao.deleteById(sc.nextInt());
		
		sc.close();

	}

}
