package com.mymemor.mymemor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

  
@SuppressWarnings("serial")
@Entity
@Table(name="people")
 public class People extends Auditable {
	
	@Getter
	@Setter
	@NotBlank
	private String name;
	
	@Getter
	@Setter
	@URL
	private String profilepic_url;
	
	@Getter
	@Setter
	private  String schoolname;
	
	@Getter
	@Setter
	private String current_city;
	
	@Getter
	@Setter
	private String hometown;
	
	@Getter
	@Setter
	@OneToMany 
	private List<SendRequest> sendrequest;
	
	@Getter
	@Setter
	@OneToMany 
	private List<RecieveRequest> recieverequest;
	
	@Getter
	@Setter
	@OneToOne
	private Account account;
	
	@Getter
	@Setter
	@ManyToMany(mappedBy="people")
	 private List<Memory>memory;
	
	@Getter
	@Setter
	@ManyToMany 
	private List<People>Mypeople;
	 
}
