package com.mymemor.mymemor.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="recieverequest")
public class RecieveRequest extends BondRequest{
	
	private People from;

}
