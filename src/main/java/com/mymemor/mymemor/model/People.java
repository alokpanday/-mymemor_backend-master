package com.mymemor.mymemor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="people")
 public class People {
	
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
}
