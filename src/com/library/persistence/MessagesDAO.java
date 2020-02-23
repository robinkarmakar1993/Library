package com.library.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import org.springframework.stereotype.Component;

import com.library.utils.MQItem;
import com.library.utils.MessageItem;

@Component
public class MessagesDAO {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public List<MessageItem> getMessagebyId(long id) {
		   String sql = "SELECT MessageContent FROM vMessage where MessageId = ?";
		   List<MessageItem> items = jdbcTemplate.query(sql,new Object[] {id}, new MessageQueueMapper());
		   return items;
	}
	

	
	public List<MessageItem> getMessagebyName(long id) {
		String sql = "SELECT * FROM vMessage where QueueId = ?";
		List<MessageItem> items = jdbcTemplate.query(sql,new Object[] {id}, new MessageQueueMapper());
		return items;
	}
	
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	private static final class MessageQueueMapper implements RowMapper<MessageItem>{
		
		@Override
		public MessageItem mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			MessageItem mitem = new MessageItem();
			/*
			mitem.setQueueId(resultSet.getLong("QueueId"));
			mitem.setQueueName(resultSet.getString("QueueName"));
			mitem.setItemId(resultSet.getLong("ItemId"));
			mitem.setStatusCode(resultSet.getString("StatusCode"));
			mitem.setNextDeliveryAttemptNo(resultSet.getLong("NextDeliveryAttemptNo"));
			mitem.setNextDeliveryAttemptUTC(resultSet.getString("NextDeliveryAttemptUTC"));
			mitem.setMessageId(resultSet.getLong("MessageId"));
			*/
			
			mitem.setMessageContent(resultSet.getString("MessageContent"));
			/*
			mitem.setCreateBy(resultSet.getString("CreateBy"));
			mitem.setCreateDateUTC(resultSet.getString("CreateDateUTC"));
			mitem.setLogId(resultSet.getLong("LogId"));
			mitem.setStartDateUTC(resultSet.getString("StartDateUTC"));
			mitem.setStartStatusCode(resultSet.getString("StartStatusCode"));
			mitem.setEndDateUTC(resultSet.getString("EndDateUTC"));
			mitem.setEndStatusCode(resultSet.getString("EndStatusCode"));
			mitem.setLogShortDesc(resultSet.getString("LogShortDesc"));
			mitem.setLogDetailedDesc(resultSet.getString("LogDetailedDesc"));
			*/
			return mitem;

			
		}
	}

	
}
