package com.sippable.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
//@Autowired
@Entity
@Table(name="IMAGE")
public class Image implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3545758671948416093L;

	@Column(name = "IMAGE_URL" )
	private String url;
	
	@Column(name="IMAGE_SRC")
	private String source;
	
	@Id
	@Column(name = "IMAGE_ID")
	@SequenceGenerator(name="IMAGE_SEQ", sequenceName="IMAGE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMAGE_SEQ")
	private int imageId;

	
	public Image(){
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public Image(String url, String source, int imageId) {
		super();
		this.url = url;
		this.source = source;
		this.imageId = imageId;
	}

	@Override
	public String toString() {
		return "Image [url=" + url + ", source=" + source + ", imageId=" + imageId + "]";
	}

}
