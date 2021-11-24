package finaljava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

public class HandlingFiles {
	
	static String[] propKeyArray= {"Apple","Table","Orange"};
	//static String[] propValueArray=new String[3];

	
	public static void doesFileExists(String path) throws FileNotFoundException {
		
	
			FileInputStream input=new FileInputStream(path);
			Properties prop = new Properties();
			try {
				prop.load(input);
			} catch (IOException e) {
				System.out.println("File not found");
				e.printStackTrace();
			}
			
			for (int i=0; i<propKeyArray.length; i++) {
				   // String key = word.toString();
				   ArrayList<String> al=new ArrayList<String>();
				   String[] value=prop.getProperty(propKeyArray[i]).split(",");
				   al.addAll(Arrays.asList(value));
				    System.out.println(propKeyArray[i]);
				    for(String val: value) {
				    	System.out.println(val);
				    }
			
		/*	HashMap<String,String> hm = new HashMap<String,String>();
			
			
			for(int i=0;i< propKeyArray.length; i++) {
				
				hm.put(propKeyArray[i], prop.getProperty(propKeyArray[i]));
			} */
			
			
			
		/*	for (String word: hm.keySet()) {
			    String key = word.toString();
			   ArrayList<String> al=new ArrayList<String>();
			   String[] value=hm.get(word).split(",");
			   al.addAll(Arrays.asList(value));
			    System.out.println(key);
			    for(String val: value) {
			    	System.out.println(val);
			    } */
			}
			      
            		
			}
                       
	public static void main(String[] args) throws FileNotFoundException {
		

		doesFileExists(".\\File\\Properties.properties");
	}

}
