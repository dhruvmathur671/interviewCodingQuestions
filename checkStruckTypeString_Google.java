/*package whatever //do not write package name here */

import java.io.*;




class GFG {
    public boolean isTypo(String word, String input){
    
    int i=0;
    int j=0;
    
    
    

    while((i<word.length()) && (j<input.length())){
        
        
        if(word.charAt(i)==input.charAt(j)){    //cat //ccccaaaattt
            i++;
            j++;
            
        }
        
        else if(j>0 && input.charAt(j) == input.charAt(j-1)){    //typo
            
            while(j<input.length() && input.charAt(j)==input.charAt(j-1))
            j++;
            
        }
        
        else{
            return false;
        }
        
    }
    
    	System.out.println(i);
		System.out.println(j);

    
    while(j<input.length()-1){
            if((input.charAt(j++))!=(word.charAt(word.length()-1)));
            return false;
        
    }
    
    if(i<word.length()-1){
        return false;
    }
    
    
    	
    
    return true;
}
	public static void main (String[] args) {
	    
	    
	    GFG gfg= new GFG();
	    
	    
	    boolean result = gfg.isTypo("cat","caaaattaaaaa");
	    
	   
	    
		System.out.println(result);
	}
}
