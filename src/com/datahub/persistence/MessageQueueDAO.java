/*
  * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-12 LearningPatterns Inc.
 */


package com.datahub.persistence;

import com.datahub.utils.MQItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;



/**
 * This class is a simple bean that emulates the search of MessageQueue Table. 
 */

@Component
public class MessageQueueDAO  {
	
	   @Autowired
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplate;
	   
	   public MQItem getMQbyidmapper(long id){
		   String sql = "SELECT * FROM MessageQueue where QueueId = ?";
		   return jdbcTemplate.queryForObject(sql,new Object[] {id}, new MessageQueueMapper());
		   
	   }
	   
	   public MQItem getMQbynamemapper(String name){
		   
		   String sql = "SELECT * FROM MessageQueue where QueueName = ?";
		   return jdbcTemplate.queryForObject(sql,new Object[] {name}, new MessageQueueMapper());
		   
	   }
	   
	
	   
	   public MQItem getMQItem(long id){
		   Connection conn = null;
		   
		   try {
		   conn = dataSource.getConnection();
		   PreparedStatement ps = conn.prepareStatement("SELECT * FROM MessageQueue where QueueId = ?");
		   ps.setLong(1, id);
		   
		   MQItem item = null;
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
			   item = new MQItem(id,rs.getString("QueueName"),rs.getLong("MinBatchSize"),rs.getLong("MaxBatchSize"));
		   }
		   rs.close();
		   ps.close();
		   return item;
	   }
	   catch (Exception e){
		   throw new RuntimeException(e);
	   }
	   finally {
		   try {
			   conn.close();
		   } catch (SQLException e){}
		   }
		   
	   }
	   public DataSource getDataSource(){
			return dataSource;
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
		
		private static final class MessageQueueMapper implements RowMapper<MQItem>{
			
			@Override
			public MQItem mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				MQItem mq = new MQItem();
				mq.setQueueId(resultSet.getLong("QueueId"));
				mq.setQueueName(resultSet.getString("QueueName"));
				mq.setMinBatchSize(resultSet.getLong("MinBatchSize"));
				mq.setMaxBatchSize(resultSet.getLong("MaxBatchSize"));
				return mq;

				
			}
		}
}
