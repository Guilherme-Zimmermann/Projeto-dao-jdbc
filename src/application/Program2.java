package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n=== TEST 5: seller update ===");
		Seller seller = sellerDao.findById(9);
		seller.setEmail("zimmermann@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
	}

}
