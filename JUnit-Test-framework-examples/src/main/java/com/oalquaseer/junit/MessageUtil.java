package com.oalquaseer.junit;

public class MessageUtil {
	public String message ;
	
	//Constructor
	//@param message to be printed
	public MessageUtil(String message){
		this.message = message;
		
	}
	
	// prints the message
	public String printMessage(){
		System.out.println(this.message);
		return this.message;
		
	}
	
	public String salutationMessage (){
		return "Hi!" + this.message;
	}
	

}
