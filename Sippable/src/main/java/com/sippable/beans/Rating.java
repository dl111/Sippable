package com.sippable.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="RATING")
public class Rating implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3455042818367611940L;

	@Id
	@Column(name="RATE_ID")
	@SequenceGenerator(name="RATING_SEQ", sequenceName = "RATING_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RATING_SEQ")
	int rateid;
	
	@Column(name="USER_ID")
	int userid;
	
	@Column(name="DRINK_ID")
	int drinkid;
	
	@Column(name="RATE")
	int rate;
	
	public Rating(){};
	
	public Rating(int rateid, int userid, int drinkid, int rate){
		this.rateid = rateid;
		this.userid = userid;
		this.drinkid =drinkid;
		this.rate = rate;
	}
	
	public int getRateid() {
		return rateid;
	}

	public void setRateid(int rateid) {
		this.rateid = rateid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getDrinkid() {
		return drinkid;
	}

	public void setDrinkid(int drinkid) {
		this.drinkid = drinkid;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Rating [rateid=" + rateid + ", userid=" + userid + ", drinkid=" + drinkid + ", rate=" + rate + "]";
	}
	
	
}
