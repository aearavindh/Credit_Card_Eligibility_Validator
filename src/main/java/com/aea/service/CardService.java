package com.aea.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.aea.config.AppConfig;
import com.aea.config.HibernateConfig;
import com.aea.dao.CardDAO;
import com.aea.model.CardModel;

@Service
public class CardService {
	public String checkEligibility(String panNo) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, HibernateConfig.class);
		
		CardDAO cardDAO = context.getBean(CardDAO.class);
		cardDAO.setHibernateTemplate(context.getBean(HibernateTemplate.class));
		
		CardModel card = cardDAO.getCardDetails(panNo.toUpperCase());
		
		if(card != null)
			return (card.getCreditScore() >= 5 )?"eligible":"noteligible";
		else 
			return "invalid";
	}

}
