/*
  * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-12 LearningPatterns Inc.
 */


package com.library.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.library.utils.MTItem;



/**
 * This class is a simple bean that emulates the search of MessageTrace Table.
 */

@Component
public class MessageTraceDAO  {
	
	   @Autowired
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplate;
	   
	   public List<MTItem> getmtbymapper(String id){
		   String sql = "SELECT * FROM MessageTrace where TraceId= ?";
		   List<MTItem> items = jdbcTemplate.query(sql,new Object[] {id}, new MessageTraceMapper());
		   return items;
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
		
		private static final class MessageTraceMapper implements RowMapper<MTItem>{
			
			@Override
			public MTItem mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				MTItem mt = new MTItem();
				mt.setMessageTraceGUID(resultSet.getString("MessageTraceGUID"));
				mt.setTraceId(resultSet.getLong("TraceId"));
				mt.setStateCode(resultSet.getLong("StateCode"));
				mt.setSequenceId(resultSet.getLong("SequenceId"));
				mt.setOutboundCRMGUID(resultSet.getString("OutboundCRMGUID"));
				mt.setParentMessageTraceGUID(resultSet.getString("ParentMessageTraceGUID"));
				mt.setOutboundTraceId(resultSet.getLong("OutboundTraceId"));
				mt.setProviderCRMGUID(resultSet.getString("ProviderCRMGUID"));
				mt.setMessage(resultSet.getString("Message"));
				mt.setQueueItemId(resultSet.getLong("QueueItemId"));
				mt.setRequestId(resultSet.getString("RequestId"));
				mt.setMessageStatusCode(resultSet.getLong("MessageStatusCode"));
				mt.setMessageStatusDescription(resultSet.getString("MessageStatusDescription"));
				mt.setCreateBy(resultSet.getString("CreateBy"));
				mt.setSysCreateDate(resultSet.getString("SysCreateDate"));
				mt.setNotificationID(resultSet.getString("NotificationID"));
				
			
				return mt;
				
			}
		}
}
