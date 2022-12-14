package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste1: seller findById ===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);

		System.out.println("\n=== Teste2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste3: seller findByAll ===");
		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n===* Teste4: seller insert *===");
		Seller newSeller = new Seller(null, "Rita De Cassia", "rdc@gmail.com", new Date(), 3500.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());*/
		
		
		/*System.out.println("\n===* Teste5: seller update *===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");*/
		
		System.out.println("\n===* Teste6: seller delete *===");
		System.out.println("Enter id for delete teste: ");
		int id = tec.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed!");
		
		tec.close();
		
	}

}
