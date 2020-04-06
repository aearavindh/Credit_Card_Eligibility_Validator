package com.aea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name = "CARD_DETAILS" )
@Entity
public class CardModel {
	@Id
	@Column( name = "PAN_CARD_NO" )
	private String panNo;
	@Column( name = "CREDIT_SCORE" ) 
	private float creditScore;
	
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public float getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(float creditScore) {
		this.creditScore = creditScore;
	}
	
	
}
