package application;


import model.entities.Department;
import model.entities.Seller;
import model.entities.dao.DaoFactory;
import model.entities.dao.SellerDao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(" **** TESTE findByID **** ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println(" **** TESTE 2 findByDepartment **** ");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println(" **** TESTE 3 findAll **** ");

        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println(" **** TESTE 4 SellerInsert **** ");
        Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println(" **** TESTE 5 SellerUpdate **** ");
        seller = sellerDao.findById(1);
        seller.setName("Anakin Skywalker");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println(" **** TESTE 6 SellerDelete **** ");
        System.out.println("Enter id for delete test: ");
        int id = scan.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed!");

    }

}
