package com.mymemor.mymemor.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

 
@SuppressWarnings("serial")
@Entity
@Table(name="recieverequest")
public class RecieveRequest extends BondRequest{
	
	 @ManyToOne
    @Getter
    @Setter
    @NotNull
	private People from;
	 

}
