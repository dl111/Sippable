package com.sippable.beans;

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

@Entity
@Table(name="DRINK")
public class Drink {
	
	@Id
	@Column(name="DRINK_ID")
	@SequenceGenerator(name="DRINKID_SEQ", sequenceName="DRINKID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DRINKID_SEQ")
	private int drinkId;
	
	@Column(name="DRINK_NAME")
	private String drinkName;
	
	@Column(name="AROMA")
	private String aroma;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="BREWER")
	private String brewer;
	
	@Column(name="RATING_AVG")
	private double ratingAvg;
	
	@Column(name="ALCHOL_CONTENT")
	private double alcholContent;
	
	@Column(name="IBU")
	private double ibu;
	
//	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name="DRINKTYPE")
//	private String drinkType;
//	
//	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name="BEVTYPE")
//	private String bevType;
	@Column(name="BEVTYPE")
	private int bevType;
	
	@Column(name="DRINKTYPE")
	private int drinkType;
	
	
	
	public Drink(){}
	
	public Drink(int drinkId, String drinkName, String aroma, String color, String brewer, double ratingAvg,
			double alcholContent, double ibu, int drinkType, int bevType) {
		super();
		this.drinkId = drinkId;
		this.drinkName = drinkName;
		this.aroma = aroma;
		this.color = color;
		this.brewer = brewer;
		this.ratingAvg = ratingAvg;
		this.alcholContent = alcholContent;
		this.ibu = ibu;
		this.drinkType = drinkType;
		this.bevType = bevType;
	}



	public int getDrinkId() {
		return drinkId;
	}



	public void setDrinkId(int drinkId) {
		///System.out.println("setting drink ID");
		this.drinkId = drinkId;
	}



	public String getDrinkName() {
		return drinkName;
	}



	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}



	public String getAroma() {
		return aroma;
	}



	public void setAroma(String aroma) {
		this.aroma = aroma;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getBrewer() {
		return brewer;
	}



	public void setBrewer(String brewer) {
		this.brewer = brewer;
	}



	public double getRatingAvg() {
		return ratingAvg;
	}



	public void setRatingAvg(double ratingAvg) {
		this.ratingAvg = ratingAvg;
	}



	public double getAlcholContent() {
		return alcholContent;
	}



	public void setAlcholContent(double alcholContent) {
		this.alcholContent = alcholContent;
	}



	public double getIbu() {
		return ibu;
	}



	public void setIbu(double ibu) {
		this.ibu = ibu;
	}



	public int getDrinkType() {
		return drinkType;
	}



	public void setDrinkType(int drinkType) {
		this.drinkType = drinkType;
	}



	public int getBevType() {
		return bevType;
	}



	public void setBevType(int bevType) {
		this.bevType = bevType;
	}

	@Override
	public String toString() {
		return "Drink [drinkId=" + drinkId + ", drinkName=" + drinkName + ", aroma=" + aroma + ", color=" + color
				+ ", brewer=" + brewer + ", ratingAvg=" + ratingAvg + ", alcholContent=" + alcholContent + ", ibu="
				+ ibu + ", bevType=" + bevType + ", drinkType=" + drinkType + "]";
	}



	
	
	
	
	
}
