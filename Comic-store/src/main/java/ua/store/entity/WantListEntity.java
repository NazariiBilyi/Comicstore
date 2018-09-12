package ua.store.entity;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "want_list")

public class WantListEntity {

	private List<ProductEntity> products;
	
}
