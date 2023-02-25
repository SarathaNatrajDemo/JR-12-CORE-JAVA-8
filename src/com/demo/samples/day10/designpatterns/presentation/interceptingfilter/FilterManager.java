package com.demo.samples.day10.designpatterns.presentation.interceptingfilter;

public class FilterManager {
	   FilterChain filterChain;

	   public FilterManager(Target target){
	      filterChain = new FilterChain();
	      filterChain.setTarget(target);
	   }
	   public void setFilter(Filter filter){
	      filterChain.addFilter(filter);
	   }

	   public void filterRequest(String request){
	      filterChain.execute(request);
	   }
	}

