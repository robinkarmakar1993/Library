/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-12 LearningPatterns Inc.
 */
 
package com.library.utils;

import java.util.Collection;


public class Search {
	private String username;
	private Collection<Members> results;
	private String password;
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public Collection<Members> getResults() {
		return results;
	}
	public void setResults(Collection<Members> results) {
		this.results = results;
	}
	
	

}
