package ua.store.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.store.entity.ProductEntity;

@Data
@NoArgsConstructor
public class OrderDTO {
	
	private Long id;
	
	private String orderId;
	
	private BigDecimal orderPrice;
	
	private LocalDate orderDate;
	
	private List<ProductEntity> products;
	
	private Integer orderItemsNumber;
}
