package com.demo.samples.day10.designpatterns.presentation.interceptingfilter;

public class Client {
	   FilterManager filterManager;

	   public void setFilterManager(FilterManager filterManager){
	      this.filterManager = filterManager;
	   }

	   public void sendRequest(String request){
	      filterManager.filterRequest(request);
	   }
	}
