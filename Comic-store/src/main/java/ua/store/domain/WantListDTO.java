package ua.store.domain;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.store.entity.ProductEntity;

@Data
@NoArgsConstructor
public class WantListDTO {
	
	private Long id;
	
	private List<ProductEntity> products;
	
}
