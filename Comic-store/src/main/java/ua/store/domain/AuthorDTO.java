package ua.store.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO {
	
	private Long id;

	private String authorId;
	
	private String name;
	
	private String lastName;
	
}
