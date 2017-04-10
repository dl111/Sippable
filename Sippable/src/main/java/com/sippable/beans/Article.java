package com.sippable.beans;

import java.io.Serializable;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name="ARTICLES")
public class Article implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6004047194834516542L;
	@Id
	@Column(name="A_ID")
	@SequenceGenerator(name="ARTICLE_SEQ", sequenceName="ARTICLE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ARTICLE_SEQ")
	private int aID;
	@Column(name="S3_LOCATION")
	private String s3Location;
	@Column(name="VIEWCOUNT")
	private int viewCount;
	@Column(name="DATE_PUB")
	private String datePub;
	@Column(name="A_STATUS")
	private int aStatus;
	
	@Override
	public String toString() {
		return "Article [aID=" + aID + ", s3Location=" + s3Location + ", viewCount=" + viewCount + ", datePub="
				+ datePub + ", aStatus=" + aStatus + "]";
	}
	public Article(int aID, String s3Location, int viewCount, String datePub, int aStatus) {
		super();
		this.aID = aID;
		this.s3Location = s3Location;
		this.viewCount = viewCount;
		this.datePub = datePub;
		this.aStatus = aStatus;
	}
	
	public Article() {
	
	}
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getS3Location() {
		return s3Location;
	}
	public void setS3Location(String s3Location) {
		this.s3Location = s3Location;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public String getDatePub() {
		return datePub;
	}
	public void setDatePub(String datePub) {
		this.datePub = datePub;
	}
	public int getaStatus() {
		return aStatus;
	}
	public void setaStatus(int aStatus) {
		this.aStatus = aStatus;
	}
	
	
	
}
