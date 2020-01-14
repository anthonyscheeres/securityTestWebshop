package main;

import java.io.IOException;

import service.HttpUtilities;

/**
 * @author Anthony Scheeres, Anthony Schuijlenburg
 */
public class Main {

	
	/***
	 * send http can be used for looping, spamming and stuff like that
	 * 
	 * ***/
    public static void main(String[] args) {
      try {
		sendHttp();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    
    
    private static void sendHttp() throws IOException {
        	 String myUrl = ""; 
        	 String jsonInputString ="heck";
        	 String requestType ="POST";
            HttpUtilities http = new  HttpUtilities();
  		http.createPostWithBody(myUrl, jsonInputString, requestType);
  	
    }
    

}