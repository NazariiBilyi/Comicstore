package ua.store.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.store.entity.enums.ProductAvailability;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity{
	
	private String productId;
	
	private String name;
	
	@Column(columnDefinition = "DECIMAL(3,2)")
	private BigDecimal price;
	
	private String discription;
	
	private String imageUrl;
	
	@ManyToOne
	@JoinColumn(name = "publisher_id", nullable = false)
	private PublisherEntity publisher;
	
	@ManyToOne
	@JoinColumn(name = "product_catalog_id", nullable = false)
	private ProductCatalogEntity catalog;
	
	@Enumerated(EnumType.ORDINAL)
	private ProductAvailability availability;
	
	private List<CategoriesEntity> categories;
	
	private AuthorEntity author;
	
	@Column(name = "publish_date")
	private LocalDate publishDate;
	


}
