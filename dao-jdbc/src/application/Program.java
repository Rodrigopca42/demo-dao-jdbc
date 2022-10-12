package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1,
				"Rodrigo",
				"rodrigo@gmail.com",
				new Date(),
				3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sellerDao);

	}

}
