package application;


import model.entities.Department;
import model.entities.Seller;
import model.entities.dao.DaoFactory;
import model.entities.dao.SellerDao;

import java.util.List;

public class Program {

    public static void main(String[] args) {

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
    }

}
