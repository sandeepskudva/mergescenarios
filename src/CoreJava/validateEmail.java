package CoreJava;

import java.util.regex.*;    
import java.util.*; 

public class validateEmail{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
          
        emails.add("Lottie.Zieme@ruben.us");  
        emails.add("javaTpoint@domain.com");  
        emails.add("javaTpoint.name@domain.com");  
        emails.add("javaTpoint#@domain.co.in");  
        emails.add("java'Tpoint@domain.com");  
        //Add invalid emails in list  
        emails.add(".javaTpoint@yahoo.com");  
        emails.add("javaTpoint@domain.com.");  
        emails.add("javaTpoint#domain.com");  
        emails.add("javaTpoint@domain..com");  
        //Regular Expression   
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  