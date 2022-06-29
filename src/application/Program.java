package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dep1 = new Department(1, "Books");
		
		System.out.println(dep1);
		
		Seller seller = new Seller(1, "Caio", "caiol5@hotmail.com", new Date(), 3000.00, dep1);
		
		System.out.println(seller);

	}

}
