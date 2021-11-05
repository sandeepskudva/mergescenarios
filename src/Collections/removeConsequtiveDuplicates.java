package Collections;import java.util.*;

public class removeConsequtiveDuplicates {
    public static void main(String args[]) {
      
     
      List <Integer> ls= new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,5,3));
      List <Integer> nl= new ArrayList<Integer>();
     
     
      
      int listlength = ls.size();
      
   
      for(int i=0;i<listlength-1;i++)
      {
         
         if(i!=listlength-1)
         {
          if(ls.get(i)!=ls.get(i+1))
          {
             
            nl.add(ls.get(i));
        
          }
          else
          {
              
              i=i+1;
             
          }
         }
         
      }
      if(ls.get(listlength-1)!=ls.get(listlength-2))
     { 
     nl.add(ls.get(ls.size()-1));
     }
    System.out.println(nl);
      
      
      
     
    }
}