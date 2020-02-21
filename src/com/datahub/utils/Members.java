/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.datahub.utils;

public class Members
{
  
   
   // properties
   private long id;
   private String first_name;
   private String last_name;
   private String email;
   private String uname;
   private String pass;
   private String regdate;
 
   
   

   public Members() { }

   public Members(long id, String first_name, String last_name, String email, String uname, String pass, String regdate)
   {
      this.setId(id);
      this.setFirstName(first_name);
      this.setLastName(last_name);
      this.setEmail(email);
      this.setUname(uname);
      this.setPassword(pass);
      this.setRegdate(regdate);

	
   }

public void setRegdate(String regdate2) {
	regdate = regdate2;
	
}

public void setPassword(String pass2) {
	pass = pass2;
	
}

public void setUname(String uname2) {
	uname = uname2;
	
}

public void setEmail(String email2) {
	email = email2;
	
}

public void setLastName(String last_name2) {
	last_name = last_name2;
	
}

public long getId(){
	return id;
}

public void setId(long i){
	id = i;
}


public String getFirstName() {
	return first_name;
}

public void setFirstName(String fName) {
	first_name = fName;
}



}
