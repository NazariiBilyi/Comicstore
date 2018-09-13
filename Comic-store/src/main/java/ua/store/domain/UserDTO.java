package ua.store.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.store.entity.enums.UserRole;

@Data
@NoArgsConstructor
public class UserDTO {
	
	private Long id;
	
	private String userId;

	private String username;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private UserRole role;
	
}
