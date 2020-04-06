package com.aea.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.aea.model.CardModel;

@Component
public class CardDAO {
	
	HibernateTemplate hibernateTemplate;

	public CardModel getCardDetails(String panNo) {
		return (CardModel)this.hibernateTemplate.get(CardModel.class,panNo); 
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
