/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customstringproject1;

/**
 *
 * @author maxy1
 */
public class CustomString {
    //instance variables
	
	/**
	 * Current string.
	 */
	String myString;
	
	/**
	 * Indicates if the current string myString has been set (not null).
	 */
	boolean isSet;
	
	//constructor
	
	/**
	 * Initializes current string myString to null.
	 * Initializes isSet to false.
	 */
	public CustomString() {
            this.myString=null;
            this.isSet=false;
		
	}

	// methods 
	
    /**
     * Returns the current string.
     * If the current string is null, or has not been set to a value with setString, it should return null.
     * @return current string
     */
	public String getString() {
		
		
		return this.myString;
	}

	/**
     * Sets the value of the current string and sets this.isSet to true.
     * If the given string is null, sets this.isSet to false.
     * @param string value to be set
     */
	public void setString(String string) {
            if(string!=null) {
                this.myString=string;
                this.isSet=true;
            }
		
	}

    /**
     * Returns a new string version of the current string where the alphabetical characters specified in the given arg, are removed.
     *   
     * The alphabetical characters to be removed are case insensitive.  
     * All non-alphabetical characters are unaffected.
     * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
     *
     * Example(s):
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("ra6") would return "my lucky numbes e 6, 8, nd 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("6,.") would return "my lucky numbers are 6, 8, and 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("") would return "my lucky numbers are 6, 8, and 19."
     * 
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     * 
     * @param arg the string containing the alphabetical characters to be removed from the current string
     * @return new string in which the alphabetical characters specified in the arg are removed
     */
	public String remove(String arg) {
            StringBuilder builder = new StringBuilder();
            String stringfinal = "";
            if(arg==null) {
                return this.myString;
            }
            if(this.myString!=null && !this.myString.isEmpty()) {
                char[] charstring=this.myString.toCharArray();
                Character[] characterstring = new Character[charstring.length];
                for(int x=0; x<charstring.length; x++) {
                    characterstring[x] = charstring[x];
                }
                
                char[] chararg=arg.toCharArray();
                
                for (int i = 0; i < characterstring.length; i++) {
            boolean foundMatch = false;
            for (int j = 0; j < chararg.length; j++) {
                if ((Character.toLowerCase(chararg[j]) == characterstring[i] ||
                    Character.toUpperCase(chararg[j]) == characterstring[i]) && Character.isLetter(characterstring[i])) {
                    characterstring[i] = null;
                    foundMatch = true;
                    break; // Exit inner loop once a match is found
                }
            
            
            }
            if (!foundMatch) {
                // Append character if not removed
                builder.append(characterstring[i]);
            }
            
            }
		
		
	  return builder.toString();	
	} 
            return stringfinal;
        }
	
        
        
        
	/**
	 * Returns a new string version of the current string where the capitalization is reversed (i.e., lowercase to uppercase, 
	 * and uppercase to lowercase) for the alphabetical characters specified in the given arg.
	 *   
	 * All non-alphabetical characters are unaffected.
	 * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
	 *
	 * Example(s):
	 * - For a current string "abc, XYZ; 123.", calling reverse("bcdxyz@3210.") would return "aBC, xyz; 123."
	 * - For a current string "abc, XYZ; 123.", calling reverse("6,.") would return "abc, XYZ; 123."
	 * - For a current string "abc, XYZ; 123.", calling reverse("") would return "abc, XYZ; 123."
	 * - For a current string "", calling reverse("") would return ""
	 * 
	 * Remember: This method builds and returns a new string, and does not directly modify the myString field.
	 * 
	 * @param arg the string containing the alphabetical characters to have their capitalization reversed in the current string
	 * @return new string in which the alphabetical characters specified in the arg are reversed
	 */
	public String reverse(String arg) {
            StringBuilder reversebuild= new StringBuilder();
            if(this.myString==null || this.myString.isEmpty()) {
                return "";
            }
            
            
            char[] chareversed=this.myString.toCharArray();
                Character[] charactereversed = new Character[chareversed.length];
                for(int x=0; x<chareversed.length; x++) {
                    charactereversed[x] = chareversed[x];
                }
                char[] reversearg=arg.toCharArray();
                
                for(int i = 0; i< charactereversed.length; i++) {
                    boolean match=false;
                    for(int j=0;j<reversearg.length;j++) {
                        if(Character.toLowerCase(reversearg[j]) == charactereversed[i]) {
                            match = true;
                            reversebuild.append(Character.toUpperCase(charactereversed[i]));
                            break;
                        }
                    if(Character.toUpperCase(reversearg[j]) == charactereversed[i]) {
                            match = true;
                            reversebuild.append(Character.toLowerCase(charactereversed[i]));
                             break;
                        }
                    }
                   if (!match) {
                
                reversebuild.append(charactereversed[i]);
            } 
                    
                }
                
            
                
		
		return reversebuild.toString();
	}

    /**
     * Returns a new string version of the current string where all the letters either >= or <= the given char n, are removed.  
     * 
     * The given letter may be a-z or A-Z, inclusive.
     * The letters to be removed are case insensitive.
     *
     * If 'more' is false, all letters less than or equal to n will be removed in the returned string.
     * If 'more' is true, all letters greater than or equal to n will be removed in the returned string.
     *
     * If the current string is null, the method should return an empty string.
     * If n is not a letter (and the current string is not null), the method should return an empty string.
     *
     * Example(s):
     * - For a current string "Hello 90, bye 2", calling filterLetters('h', false) would return "llo 90, y 2"
     * - For a current string "Abcdefg", calling filterLetters('c', false) would return "defg"
     * - For a current string "Hello 90, bye 2", calling filterLetters('h', true) would return "e 90, be 2"
     * - For a current string "Abcdefg", calling filterLetters('c', true) would return "Ab"
     * 
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     *
     * @param n char to compare to
     * @param more indicates whether letters <= or >= n will be removed
     * @return new string with letters removed 
     */
	public String filterLetters(char n, boolean more) {
            StringBuilder  builderfilter= new StringBuilder();
            if(this.myString==null || !Character.isLetter(n)) {
                return "";
            }
            
            char[] charfilter=this.myString.toCharArray();
                Character[] characterfilter = new Character[charfilter.length];
                for(int x=0; x<charfilter.length; x++) {
                    characterfilter[x] = charfilter[x];
                }
            
            for(int i = 0; i<characterfilter.length;i++) {
                if(more && n<characterfilter[i]) {
                    builderfilter.append(characterfilter[i]);
                    
                }
                if(!more && n>characterfilter[i]) {
                    builderfilter.append(characterfilter[i]);
                }
            }
		
		return builderfilter.toString();
	}
    
}
