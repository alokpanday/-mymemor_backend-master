package com.mymemor.mymemor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="memory")
public class Memory {
	
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
	
	
	
	
	@Column(nullable = false, updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
	private Date created_at=new Date();
	
	@Getter
	@Setter
	private Date startdate;
	
	@Getter
	@Setter
	private Date enddate;
	
	

}
