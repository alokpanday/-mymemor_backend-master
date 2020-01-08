package com.mymemor.mymemor.model;

import javax.persistence.Entity;
 
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name="account")
public class Account extends Auditable  {
	
	@Getter
	@Setter
	@NotBlank
	private String username;
	
	@Getter
	@Setter
	@NotBlank
	private String password;
	 

}