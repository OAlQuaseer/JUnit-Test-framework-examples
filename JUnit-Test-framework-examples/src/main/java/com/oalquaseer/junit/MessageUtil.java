package com.oalquaseer.junit;

public class MessageUtil {
	public String message ;
	
	public MessageUtil(String message){
		this.message = message;
		
	}
	
	public String printMessage(){
		
		return this.message;
		
	}
	
	public String salutationMessage (){
		return "Hi!" + this.message;
	}
	

}
