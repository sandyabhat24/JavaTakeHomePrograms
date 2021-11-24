package finaljava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthRandomNumber {
	
	static int[] randomArray= new int[500];
	
	public static int generateRandomNo(int boundaryNumber) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNumber);
		return generatedNo;
		
	}

	public static void main(String[] args) {

        System.out.println("Eneter the a number");
        Scanner sr=new Scanner(System.in);
        int n=sr.nextInt();
        
        for(int i=0;i<500;i++) {
        	
		       randomArray[i]=generateRandomNo(1000);
        }
        Arrays.sort(randomArray);
		
        for(int i=0;i<500;i++) {
        	
        	 System.out.println(randomArray[i]);     
     }
		
        System.out.println(n + "th smallest Random number is " + randomArray[n-1]);
       
	} 

}
