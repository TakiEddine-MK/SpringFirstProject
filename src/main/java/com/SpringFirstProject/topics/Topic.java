package com.SpringFirstProject.topics;



public class Topic {
	 private String id ;
	 private String  name;
	 private String decs ;
	 
	 public Topic() {
			
		}
	 
	 
	 public Topic(String id, String name, String decs) {
		super();
		this.id = id;
		this.name = name;
		this.decs = decs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecs() {
		return decs;
	}
	public void setDecs(String decs) {
		this.decs = decs;
	}
	
	 
}
