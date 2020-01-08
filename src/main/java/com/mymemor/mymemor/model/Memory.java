package com.mymemor.mymemor.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name="memory")
public class Memory extends Auditable{
	
	@Getter
	@Setter
	private String topic;
	
	@Getter
	@Setter
	private String content;
	
	@Getter
	@Setter
	private People creator;
	
	@Getter
	@Setter
	private String picture;
	
	 @Getter
	 @Setter
	private Date startdate;
	
	@Getter
	@Setter
	private Date enddate;
	
	@Getter
	@Setter
	@ManyToMany  
	 private List<People>people;
	
	

}
