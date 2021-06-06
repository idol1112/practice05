package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
        //메소드 내용작성
    	String s="";
    	for(int i=0;i<strArray.length;i++) {
    		s = s+strArray[i];
    	}
    	return s;
        
    }

}
