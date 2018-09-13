package ua.store.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.store.entity.AuthorEntity;
import ua.store.entity.CategoriesEntity;
import ua.store.entity.ProductCatalogEntity;
import ua.store.entity.PublisherEntity;
import ua.store.entity.enums.ProductAvailability;

@Data
@NoArgsConstructor
public class ProductDTO {
	
	private Long id;
	
	private String productId;
	
	private String name;
	
	private BigDecimal price;
	
	private String discription;
	
	private String imageUrl;
	
	private PublisherEntity publisher;
	
	private ProductCatalogEntity catalog;
	
	private ProductAvailability availability;
	
	private List<CategoriesEntity> categories;
	
	private AuthorEntity author;
	
	private LocalDate publishDate;
	

}
