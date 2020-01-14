package main;

import java.io.IOException;
import java.util.logging.Level;

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
    	sendHttpOnDifferentThread();
    }
    
    
    private static void sendHttp() throws IOException {
        	 String myUrl = ""; 
        	 String jsonInputString ="heck";
        	 String requestType ="POST";
            HttpUtilities http = new  HttpUtilities();
  		http.createPostWithBody(myUrl, jsonInputString, requestType);
  	
    }
    private static void sendHttpOnDifferentThread()  {
	 new Thread(() -> {
		 try {
			sendHttp();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
  	}).start();
    }
	 
    }
