package service;

import java.sql.SQLException;
import java.util.List;

import dao.ProductDao;
import domain.Product;

public class ProductService {

	public List<Product> findTop() {
		ProductDao productDao=new ProductDao();
		List<Product> list=null;
		try {
			list=productDao.getTopProduct();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
}
