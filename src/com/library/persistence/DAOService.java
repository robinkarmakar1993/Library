package com.library.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.utils.MQItem;
import com.library.utils.MTItem;
import com.library.utils.Members;
import com.library.utils.MessageItem;

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
