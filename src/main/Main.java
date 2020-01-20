package main;

import java.io.IOException;
import java.util.logging.Level;

import com.google.gson.Gson;

import models.UserModel;
import service.HttpUtilities;
import service.RandomString;

/**
 * @author Anthony Scheeres, Anthony Schuijlenburg
 */
public class Main {

	
	/***
	 * send http can be used for looping, spamming and stuff like that
	 * maven build eclipse:eclipse
	 * 
	 * ***/
    public static void main(String[] args) {
    	spam();
    }
    
    
    
    
    
    public static void spam() {
   	 String myUrl="https://iprwc.dragonium.nl/api/user/register";
   	 String jsonInputString = "";
   	 String requestType = "POST";
   	 Gson gson = new Gson();
   	 RandomString stringBuilder = new RandomString();
   	 String randomString = RandomString.getAlphaNumericString1(10);
   	 String emailAddress = randomString + "@" + randomString +".nl";
   	 String password=randomString; 
   	 String repeatedPassword="https://iprwc.dragonium.nl/register";
   	 
   	 UserModel u = new UserModel( emailAddress,  password, password);
   	 jsonInputString = gson.toJson(u);
   	 System.out.println( jsonInputString);
   	 HttpUtilities.sendHttpOnDifferentThread(  myUrl,
   		 jsonInputString,
   			 requestType);
   }
    
    
    
    
    

	 
    }
