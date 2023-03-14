package application;

import model.entities.Department;

import model.entities.dao.DaoFactory;
import model.entities.dao.DepartmentDao;


import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println(" **** TESTE 1 DepartmentInsert **** ");
        Department newDepartment = new Department(null, "Food");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println(" **** TESTE 2 DepartmentDelete **** ");
        System.out.println("Enter id for delete test: ");
        int id = scan.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        System.out.println(" **** TESTE 3 findAll **** ");
        List<Department> list =departmentDao.findAll();
        for (Department d : list){
            System.out.println(d);
        }

        System.out.println(" **** TESTE 4 findById **** ");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println(" **** TESTE 5 Update **** ");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed!");


    }
}
