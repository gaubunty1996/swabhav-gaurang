package com.techlabs.basic;

import java.util.*;
import java.net.*;
import java.util.Arrays;


/*
  Expected input="https://www.google.com?developer=Kamala&client=Aurionpro"
  Expected output:	domain=google
					developer=kamala
					client=Aurionpro
  					
 
  */
public class Assignment {

public static void main(String[] args) throws Exception {
		
		String url = "http://www.swabhavtechlabs.com?developer=abc&client=xyz";
		//String url = "http://www.swabhavtechlabs.com?parameters=anasasd&roll.no=89&developer=abc&client=xyz";  Testcase=1
		//String url = "http://www.swabhavtechlabs.com?roll.no=89&developer=abc&client=xyz";  Testcase=2
		//String url = "http://www.swabhavtechlabs.com?";   Testcase=3
		//String url = "http://www.swabhavtechlabs.com?developer=abc";    Testcase=4
		
		String[] urlSplittedByQuestionMark = url.split("\\?");
		
		String domain="";
		String developer="Null";
		String client="Null";
		
		URL d=new URL(url);
		domain=d.getHost();
		
		String[] domainName = domain.split("\\.");
		
		
		System.out.println("Domain is: "+domainName[1]);
		
		
		if (urlSplittedByQuestionMark.length>1){
			
		String[] urlSplittedSecondTime = urlSplittedByQuestionMark[1].split("&");
		
		
		
		for (int i=0;i<urlSplittedSecondTime.length;i++){
		    if (urlSplittedSecondTime[i].startsWith("developer")){
		        developer = urlSplittedSecondTime[i].substring(10);
		        
		    }
		    else if (urlSplittedSecondTime[i].startsWith("client")){
		        client = urlSplittedSecondTime[i].substring(7);
		        
		    }
		    
		}
		}
		
		System.out.println("Developer name is: "+developer);
		System.out.println("Client name is: "+client);
	}

}
