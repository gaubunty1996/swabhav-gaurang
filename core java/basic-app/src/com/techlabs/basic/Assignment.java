package com.techlabs.basic;

import java.util.*;
import java.net.*;
import java.util.Arrays;
import java.net.*;
import java.util.*;

/*
  Expected input="https://www.google.com ? developer=Kamala & client=Aurionpro"
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
		
		String[] urlsplittedbyquestionmark = url.split("\\?");
		
		String Domain="";
		String Developer="Null";
		String Client="Null";
		
		URL d=new URL(url);
		Domain=d.getHost();
		
		String[] DomainName = Domain.split("\\.");
		
		
		System.out.println("Domain is: "+DomainName[1]);
		
		//System.out.print("url spliited by ? mark is:  ");
		//System.out.println(Arrays.toString(urlsplittedbyquestionmark));
		
		if (urlsplittedbyquestionmark.length>1){
		String[] urlspliitedsecondtime = urlsplittedbyquestionmark[1].split("&");
		
		//System.out.print("url spliited by & is:  ");
		//System.out.println(Arrays.toString(urlspliitedsecondtime));
		
		for (int i=0;i<urlspliitedsecondtime.length;i++){
		    if (urlspliitedsecondtime[i].startsWith("developer")){
		        Developer = urlspliitedsecondtime[i].substring(10);
		        
		    }
		    else if (urlspliitedsecondtime[i].startsWith("client")){
		        Client = urlspliitedsecondtime[i].substring(7);
		        
		    }
		    
		}
		}
		
		System.out.println("Developer name is: "+Developer);
		System.out.println("Client name is: "+Client);
	}

}
