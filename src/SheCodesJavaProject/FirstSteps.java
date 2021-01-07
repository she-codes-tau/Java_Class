//Lesson13_1-FirstSetup

package SheCodesJavaProject;

import java.util.*;

/**This FirstSteps class includes three methods- alumniID, getAlphaNumericString, resume
 */
public class FirstSteps {
	
	//this method generates the user name of the new alumni
	public String alumniID(String name, String lastName) {
	
		return name+"."+lastName+".shecodes";
		
	}
	
	//this method generates the OTP of the new alumni
	 public static String getAlphaNumericString(int n) 
	    { 
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "0123456789"
	                                    + "abcdefghijklmnopqrstuvxyz"; 
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(n); 
	  
	        for (int i = 0; i < n; i++) { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    } 
	 
	 public String resume() {
		 
		 String [] resume= {"Web", "Java basics", "Basic Python", "Android", "Python for programmers",
				 "Data analysis ", "Git", "Landing a job", "React"};
		 
		 Random rnd= new Random();
		 
		 int randomNumber=rnd.nextInt(resume.length);
		 
		 return ((resume[randomNumber])); 
	
		 
	 }
	 
	 public boolean shouldOfferJob(int input) {
		 
		 if(input == 1)
			 return true;
		 else return false;
		 
	 }
	 }
