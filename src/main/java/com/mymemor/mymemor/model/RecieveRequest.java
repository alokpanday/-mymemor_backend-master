package com.mymemor.mymemor.model;

import javax.persistence.Entity;
 
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
 

import lombok.Getter;
import lombok.Setter;

 
@SuppressWarnings("serial")
@Entity
@Table(name="recieverequest")
public class RecieveRequest extends BondRequest{
	
	@Getter
	@Setter
	@NotBlank
	private People from;
	 

}
