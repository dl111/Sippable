package com.sippable.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	Users user;
	

	//
	
	@Column(name="RATE")
	int rate;
	//////////////////////////////////
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "DRINK_ID")
	private Drink drink;
	
	
	
	
	
	public Rating(int rateid, Users user, int drinkid, int rate) {
		super();
		this.rateid = rateid;
		this.user = user;

		this.rate = rate;
		this.drink = drink;
	}

	//////////////////////////////////////////
	public Rating(){};
	

	
	public int getRateid() {
		return rateid;
	}

	public void setRateid(int rateid) {
		this.rateid = rateid;
	}

	public Users getUser() {
		return user;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public void setUser(Users user) {
		this.user = user;
	}

/*	public int getDrinkid() {
		return drinkid;
	}

	public void setDrinkid(int drinkid) {
		this.drinkid = drinkid;
	}*/

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "";//"Rating [rateid=" + rateid + ", userid=" + user + ", drinkid=" + drinkid + ", rate=" + rate + "]";
	}
	
	
}
