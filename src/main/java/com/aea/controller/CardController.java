package com.aea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aea.service.CardService;

@Controller
public class CardController { 
	@Autowired
	private CardService cardService;
	
	@RequestMapping("/checkEligibility")
	public ModelAndView checkEligibility(@RequestParam("panNo") String panNo) {
		String page = cardService.checkEligibility(panNo);
		ModelAndView mv = new ModelAndView(page);
		return mv;
	}

}
