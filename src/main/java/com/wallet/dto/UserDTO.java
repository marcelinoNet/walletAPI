package com.wallet.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class UserDTO {
	
	private Long Id;
	
	@Email(message="Email inválido")
	private String email;
	
	@Length(min = 3, max = 50, message= "O nome deve ser entre 3 e 50 caracteres")
	private String name;
	
	@Length(min = 6, message="A senha deve conter no mínimo 6 caracteres")
	private String password;
	
	

}
