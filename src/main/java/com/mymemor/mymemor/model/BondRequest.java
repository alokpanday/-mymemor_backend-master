package com.mymemor.mymemor.model;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BondRequest {
	
 private Bondrequest_status bondrequest_status ;
	
	

}
