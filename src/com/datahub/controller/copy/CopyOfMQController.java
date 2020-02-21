package com.datahub.controller.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datahub.persistence.DAOService;
import com.datahub.utils.MQItem;
import com.datahub.utils.MessageItem;
import com.datahub.utils.Search;

@Controller
@RequestMapping("/search")
public class CopyOfMQController {

	@Autowired
	DAOService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String get(@ModelAttribute("search") Search search) {
	
	    // TODO: Initialize keyword to "Diva"
		search.setusername("Diva");
		return "searchForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String ProcessLogin(@ModelAttribute("search") Search search){
		System.out.println("SearchController.processSearch()");
		
		String username = search.getusername();
		String password = search.getpassword();

		if (service.getMembersidmapper(username, password) != null){
			return "searchResults";
		}
		else
			return "RegisterPage";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/Message_name/{name}")
    @ResponseBody
	public List<MessageItem> getMQbyName(@PathVariable("name") String name){
	
		return service.getMessageQueuebyname(name);
	
	}
	

}
