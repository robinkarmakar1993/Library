package com.library.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.library.persistence.DAOService;
import com.library.utils.MTItem;

@Controller
@RequestMapping("/MessageTrace")
public class MTController {

	@Autowired
	DAOService service;
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/MTitem/{MTid}")
    @ResponseBody
	public List<MTItem> getMTbyId(@PathVariable("MTid") String id){
		
		return service.getMessageTracebyid(id);

	}
	
	
	
}
