package ua.store.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "order")
public class OrderEntity extends BaseEntity{

	private String orderId;
	
	@Column(columnDefinition = "DECIMAL(4,2)")
	private BigDecimal orderPrice;
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	private List<ProductEntity> products;
	
	@Column(name = "order_items_number")
	private Integer orderItemsNumber;
	
	
}
