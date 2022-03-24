package com.demo.samples.day6.strings;

import java.util.Scanner;

public class AbbreviateStrings {
	public static void main(String[] args) {
		String fullname;
		System.out.println(" Enter the full name : ");
		Scanner sc = new Scanner(System.in);
		fullname = sc.nextLine();
		
		String fr = "";
		
		
		fr = fr+fullname.charAt(0);
		fr = fr+". ";
		    for (int i = 0; i<fullname.length();i++){
		      if(fullname.charAt(i) == ' ' && fullname.charAt(i+1)!=' ' ){
		    	  fr = (fr+fullname.charAt(i+1)).toUpperCase();
		    	  fr = fr+". ";
		      }
		    }
		    String l_wrd = "";
		    //to get the last word
		    for(int i = fullname.length()-1;i>=0;i--){
		      if(fullname.charAt(i) == ' '){
		    	  l_wrd = fullname.substring(i+2);
		        break;
		      }
		    }
		    //to remove last ". "
		    fr = fr.substring(0,fr.length()-2);
		    fr = fr+l_wrd;
		    System.out.println(fr);
		
	}
}
