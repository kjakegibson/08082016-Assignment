package com.tiy.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BattingAverage {
	
	//worked on by everyone at some point or another. incomplete but it was the best we could come up with
	
	public static void main(String[] args) {
        
	    Scanner getStats = new Scanner(System.in);
	    
	    String userAtBats = null;
	    String userResult = null;
	    ArrayList<Integer> results = new ArrayList<>();
	    
	    int totalBases = 0;
	    int totalHits = 0;

	    float battingAvg = 0.0f;
	    float slugPercent = 0.0f;
	    
	    
	    System.out.println("Welcome to the batting average and slugging percentage calculator!\n");
	    System.out.println("Please enter the number of at bats: ");
	    
	    userAtBats = getStats.nextLine();
	    int numAtBats = Integer.parseInt(userAtBats);
	    
	    for (int i = 0; i < numAtBats; i++) {
	        
	        System.out.println("Please enter a result (0 - 4) for at bat number " + (i+1) + ":");
	        
	        //exception for entering 0 - 4
	        
	        userResult = getStats.nextLine();
	        results.add(Integer.parseInt(userResult));
	        
	        totalBases += results.get(i);
	    }
	    
	    System.out.println(totalBases);
	        
	        
	}
}
