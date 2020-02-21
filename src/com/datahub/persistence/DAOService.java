package com.datahub.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.datahub.utils.MQItem;
import com.datahub.utils.MTItem;
import com.datahub.utils.Members;
import com.datahub.utils.MessageItem;

@Component
public class DAOService {

	@Autowired
	MessagesDAO messages;
	@Autowired
	MessageTraceDAO mtrace;
	@Autowired
	MessageQueueDAO mq;
	@Autowired
	MembersDAO mem;
	
	/**Get Messages by querying for MessageId from vMessage Table
	 * 
	 * @param Messageid
	 * @return A list of Messages
	 */
	public List<MessageItem> getMessagebyid(long id){
		return messages.getMessagebyId(id);
	}

	
	/**Get Messages by querying vMessage for QueueId, that was collected from MessageQueue
	 * 
	 * @param Messageid
	 * @return A list of Messages
	 */
	public List<MessageItem> getMessageQueuebyname(String name){
		MQItem item = mq.getMQbynamemapper(name);
		return messages.getMessagebyName(item.getQueueId().longValue());
		
	}
	
	
	public List<MTItem> getMessageTracebyid(String id){
		return mtrace.getmtbymapper(id);
	}

	public Members getMembersidmapper(String un, String password){
		return mem.getMembersidmapper(un, password);
	}
	
	
	
	
}
