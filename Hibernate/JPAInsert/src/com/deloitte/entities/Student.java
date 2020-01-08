package com.deloitte.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
	
@Entity
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int sid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	

}
