package com.patient.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.thymeleaf.util.StringUtils;


public class Main 
{		
	//static String source = "D:\\sample1.txt";
//
//	public static void main(String a[]) throws Exception{
//		String values[]= {"Name","Street Name","City","Postal Code","Phone"};
//		Main.Patientfile();
//	}	
	public String[]  Patientfile(String path) throws Exception
	{
		Map<String,String> names = new HashMap<>();
		names.put("Name", "Name");
		names.put("Street Name", "Street Name");
		names.put("City", "City");
		names.put("Postal Code", "Postal Code");
		names.put("Phone", "Phone");
		names.put("Email Address", "Email Address");
		
		//Patient text = new Patient();
		File file = new File(path);
		Scanner sc1 = new Scanner(file);
		StringBuilder address = new StringBuilder();
		String res[]=new String[6];
		while(sc1.hasNext())
		{
			String str = sc1.nextLine();
			
			String s[] = StringUtils.split(str, ":");
			
	for(int i=0;i<s.length;i++)		
			
	{
			if (names.containsKey(s[i])) {
				
				names.put(s[i], s[i+1].trim());
	               
	            }
	}
		}
		
		int i=0;
		Iterator it=names.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry map=(Map.Entry)it.next();
			res[i++]=map.getValue().toString();
		}
//		JSONObject result = new JSONObject();
//
//		JSONObject patient = new JSONObject();
//
//		patient.put("name", names.get("Name"));
//		patient.put("phone", names.get("Phone"));
//		patient.put("email", names.get("Email Address"));
//		
//		JSONObject Address = new JSONObject();
//		
//		Address.put("Street", names.get("Street Name"));
//		Address.put("City",names.get("City"));
//		Address.put("Pin Code", names.get("Postal Code"));
//		
//		
//		patient.put("address", Address);
//		
//		result.put("patient", patient);
//		
//	    System.out.println(result.toString());
//		
		return res;
       }
	
	
	
	}