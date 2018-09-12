package ua.store.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "product_catalog")
public class ProductCatalogEntity extends BaseEntity{

	@OneToMany(mappedBy = "catalog")
	private List<ProductEntity> products;
	
}
