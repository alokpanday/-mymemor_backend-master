package com.mymemor.mymemor.model;

import javax.persistence.Entity;
 
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name="sendrequest")
public class SendRequest extends BondRequest {
	@Getter
	@Setter
	@NotNull
	private People to_person;
	 

}
