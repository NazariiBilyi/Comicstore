package ua.store.service;

import java.util.List;

import ua.store.domain.ProductDTO;

public interface ProductService {

	void create(ProductDTO dto);
	
	void update (ProductDTO dto);
	
	void delete (String productId);
	
	List<ProductDTO> findAll();
	
	ProductDTO findByProductId(String productId);
	
}
