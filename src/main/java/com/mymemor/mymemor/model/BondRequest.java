package com.mymemor.mymemor.model;
 
 
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
@MappedSuperclass 
@SuppressWarnings("serial")
public abstract class BondRequest extends Auditable {
	
	@Getter
	@Setter
 private Bondrequest_status bondrequest_status ;
	
	

}
