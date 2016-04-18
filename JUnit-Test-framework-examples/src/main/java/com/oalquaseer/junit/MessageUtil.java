package com.oalquaseer.junit;

public class MessageUtil {
	public String message ;
	MessageUtil(String message){
		this.message = message;
		
	}
	
	public String printMessage(){
		
		return this.message;
		
	}
	
	public String salutationMessage (){
		return "Hi!" + this.message;
	}
	

}
