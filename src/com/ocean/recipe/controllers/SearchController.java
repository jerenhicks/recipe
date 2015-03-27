package com.ocean.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {
	
	@RequestMapping(method=RequestMethod.GET, value ="/search")  
	public @ResponseBody String getTest(){
	    return "hi";
	}
	
}
