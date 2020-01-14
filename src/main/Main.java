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
    	 String myUrl="";
    	 String jsonInputString = "";
    	 String requestType = "POST";
    	
    	 HttpUtilities.sendHttpOnDifferentThread(  myUrl,
    		 jsonInputString,
    			 requestType);
    }
    
    

	 
    }
