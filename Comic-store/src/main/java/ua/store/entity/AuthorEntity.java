package ua.store.entity;

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
@Table(name = "authors")
public class AuthorEntity extends BaseEntity{

	private String authorId;
	
	private String name;
	
	@Column(name = "last_name")
	private String lastName;
	
}
