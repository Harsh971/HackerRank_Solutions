import java.io.*;
import java.util.*;


class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
    	super();
    	this.first = first;
    	this.second = second;
    }

    public int hashCode() {
    	int hashFirst = first != null ? first.hashCode() : 0;
    	int hashSecond = second != null ? second.hashCode() : 0;

    	return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
    	if (other instanceof Pair) {
    		Pair otherPair = (Pair) other;
    		return 
    		((  this.first == otherPair.first ||
    			( this.first != null && otherPair.first != null &&
    			  this.first.equals(otherPair.first))) &&
    		 (	this.second == otherPair.second ||
    			( this.second != null && otherPair.second != null &&
    			  this.second.equals(otherPair.second))) );
    	}

    	return false;
    }

    public String toString()
    { 
           return "(" + first + ", " + second + ")"; 
    }

    public A getFirst() {
    	return first;
    }

    public void setFirst(A first) {
    	this.first = first;
    }

    public B getSecond() {
    	return second;
    }

    public void setSecond(B second) {
    	this.second = second;
    }
}
public class Solution {

    static private final String INPUT = "in";  
    static private final String OUTPUT = "out";  
  
    public static void main(String[] args) 
    {
		
	  FileInputStream instream = null;  
      PrintStream outstream = null;  
     
      try {  
          instream = new FileInputStream(INPUT);  
          outstream = new PrintStream(new FileOutputStream(OUTPUT));  
          //System.setIn(instream);  
          //System.setOut(outstream);  
      } catch (Exception e) {  
          System.err.println("Error Occurred.");  
      }  
        Set setA = new HashSet();
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
			String a=scan.next();
			String b=scan.next();
			Pair P=new Pair(a,b);
			setA.add(P);
			System.out.println(setA.size());
			//System.out.println(a+" "+b);
		}
			
        
    }
}