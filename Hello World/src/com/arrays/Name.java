package com.arrays;

import java.util.ArrayList;

public class Name {

	public static void main(String[] args) {
    String employee="sairavali" ;
    
    /*
     * step 1 convert string to array 
     * 
     * step 2 pick each letter from the array and compare the same with other letters of the array
     * 
     * step 3 if match found don't save it
     * 
     * step 4 if no match found then save it to another temporary variable with [,] separator
     * 
     * 
     * */
    char[] stringToArray=employee.toCharArray();
    ArrayList<Character> result = new ArrayList<Character>();
    int i =0;
    for(char output:stringToArray)
    {
    	char chkvariable = output;
    	
    	for(int a=0;a<=stringToArray.length; a++)
    	{
    		
    		char[] dummy = employee.toCharArray();
    		
    		if(a==i)
    		{
    			continue;
    		}
    		else {
    			
    			for(char chkdummy : dummy)
        		{
        			if(chkdummy == chkvariable)
        			{
        				result.add(chkdummy);
        			}
        		}

    			
    		}
    		
    	}
    	i++;
    }
    
    
    
    
	}

}
