package com.example.deneme.dto;

import lombok.Data;


@Data
public class UserCreateDTO {
	
	/*@NotNull(massage = "{backend.constraints.username.NotNull.message}")
	@Size(min = 2, max = 32, message = "{backend.constraints.username.Size.message}")*/
	private String userName;
	
	/*@NotNull(massage = "{backend.constraints.firstname.NotNull.message}")
	@Size(min = 2, max = 32, message = "{backend.constraints.firstname.Size.message}")*/
	private String firstName;
	
	/*@NotNull(massage = "{backend.constraints.lastname.NotNull.message}")
	@Size(min = 2, max = 32, message = "{backend.constraints.lastname.Size.message}")*/
	private String lastName;
}
