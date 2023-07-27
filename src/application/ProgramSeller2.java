package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class ProgramSeller2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 5: seller update ===");
		Seller seller = sellerDao.findById(9);
		seller.setEmail("zimmermann@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
