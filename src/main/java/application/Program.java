package application;

import model.entities.Department;
import model.entities.Seller;
import model.entities.dao.DaoFactory;
import model.entities.dao.SellerDao;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(1, "Joao", "joao@gmail.com", new Date(), 3000.00, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }

}
