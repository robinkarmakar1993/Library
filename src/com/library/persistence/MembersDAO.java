/*
  * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-12 LearningPatterns Inc.
 */


package com.library.persistence;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.library.utils.Members;
import com.library.utils.Test;



/**
 * This class is a simple bean that emulates the search of MessageQueue Table. 
 */

@Component
public class MembersDAO  {
	
	   @Autowired
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplate;
	   
	   public Test getMembersidmapper(String uname, String password){
		   String sql = "SELECT * FROM sys.Test";
		   return jdbcTemplate.queryForObject(sql, new MemberMapper());
		   
	   }

	   
	/*
	   
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
	   */
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
		
		private static final class MemberMapper implements RowMapper<Test>{
			
			@Override
			public Test mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				Test m = new Test();
				m.setId(resultSet.getInt("Test"));
				
		
				return m;

				
			}
		}
}
