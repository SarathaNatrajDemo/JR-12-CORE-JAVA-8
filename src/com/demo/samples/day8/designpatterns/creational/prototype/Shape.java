package com.demo.samples.day8.designpatterns.creational.prototype;

public abstract class Shape implements Cloneable {
	   
	   private String id;
	   protected String type;
	   
	   abstract void draw();
	   
	   public String getType(){
	      return type;
	   }
	   
	   public String getId() {
	      return id;
	   }
	   
	   public void setId(String id) {
	      this.id = id;
	   }
	   
	   public Object clone() {
	      Object cloneObj = null;
	      
	      try {
	    	  cloneObj = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return cloneObj;
	   }
	}