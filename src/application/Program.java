package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		Seller obj2 = new Seller(1, "Alex Green", "alex@gmail.com", sdf.parse("23/09/1995"), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj2);

	}

}
