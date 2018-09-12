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
@Table(name = "publisher")
public class PublisherEntity extends BaseEntity {

	private String publisherId;
	
	private String name;
	
	@OneToMany(mappedBy = "publisher")
	private List<ProductEntity> products;
	
}
