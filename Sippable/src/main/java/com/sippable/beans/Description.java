package com.sippable.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "DESCRIPTION")

public class Description {

	
	@Column(name="DESCRIPTION")
	private String description;
 	
	@Column(name="DESCRIPTION_SRC")
	private String source;
	
	@Column(name="DESCRIPTION_ID")
	@Id
	@SequenceGenerator(name="DESC_SEQ", sequenceName="DESC_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESC_SEQ")
	private int did;
	
	
	public Description(){
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public Description(String description, String source, int did) {
		super();
		this.description = description;
		this.source = source;
		this.did = did;
	}

	@Override
	public String toString() {
		return "Description [description=" + description + ", source=" + source + ", did=" + did + "]";
	}
	
	
	
}
