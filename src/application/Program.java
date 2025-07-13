package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		Seller obj2 = new Seller(1, "Alex Green", "alex@gmail.com", sdf.parse("23/09/1995"), 3000.00, obj);
		System.out.println(obj2);

	}

}
