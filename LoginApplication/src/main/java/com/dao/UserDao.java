package com.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
		@Autowired
		JdbcTemplate jt;
		UserDao(){
			
		}
		UserDao(DataSource ds){
			jt=new JdbcTemplate(ds);
		}
		public void displayUser() {
			
		}
		public JdbcTemplate getJt() {
			return jt;
			
		}
		public void setJt(JdbcTemplate jt) {
			this.jt=jt;
		}
		public void updateUser() {
			try {
				jt.update("insert into user values(100,'raju','ojas','raju@gmail.com',966616044)");	
			}catch(DataAccessException dae) {
				
			}
		}
	

}
