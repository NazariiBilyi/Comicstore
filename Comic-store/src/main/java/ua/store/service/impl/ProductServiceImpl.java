package ua.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.store.domain.ProductDTO;
import ua.store.entity.ProductEntity;
import ua.store.repository.ProductRepository;
import ua.store.service.ProductService;
import ua.store.service.utils.ObjectMapperUtils;
import ua.store.service.utils.StringUtils;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;
	
	@Autowired
	private StringUtils stringUtils;

	@Override
	public void create(ProductDTO dto) {
		dto.setProductId(stringUtils.generate());
		productRepository.save(modelMapper.map(dto, ProductEntity.class));
	}

	@Override
	public void update(ProductDTO dto) {
		productRepository.save(modelMapper.map(dto, ProductEntity.class));
	}

	@Override
	public void delete(String productId) {
		
	}

	@Override
	public List<ProductDTO> findAll() {
		
		return null;
	}

	@Override
	public ProductDTO findByProductId(String productId) {
	
		return null;
	}
	
	
	
}
