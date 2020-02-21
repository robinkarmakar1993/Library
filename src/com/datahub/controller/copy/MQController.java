package com.datahub.controller.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datahub.persistence.DAOService;
import com.datahub.utils.MQItem;
import com.datahub.utils.MessageItem;

@Controller
@RequestMapping("/MessageQueue")
public class MQController {

	@Autowired
	DAOService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/Message_item/{id}")
    @ResponseBody
	public List<MessageItem> getMQbyId(@PathVariable("id") long id){

		return service.getMessagebyid(id);
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/Message_name/{name}")
    @ResponseBody
	public List<MessageItem> getMQbyName(@PathVariable("name") String name){
	
		return service.getMessageQueuebyname(name);
	
	}
	

}
