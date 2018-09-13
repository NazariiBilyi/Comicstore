package ua.store.domain;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.store.entity.ProductEntity;

@Data
@NoArgsConstructor
public class PublisherDTO {
	
	private Long id;

	private String publisherId;
	
	private String name;
	
	private List<ProductEntity> products;
}
