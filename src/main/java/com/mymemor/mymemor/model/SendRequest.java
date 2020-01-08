package com.mymemor.mymemor.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sendrequest")
public class SendRequest extends BondRequest {
	 
	private People to_person;

}
