package org.StringConcepts;

import java.util.LinkedList;
import java.util.List;

public class StringAllMethods {

	public static void main(String[] args) {
		// Below String Common for All Methods
		
		String s = "Karthikeyan Ezhumalai happy Homes";
		
		// 1. To find length of given string		
		int fulllength = s.length();
		System.out.println("\nTo find length of String: "+fulllength);
		
		//2. To convert the string from lower to Upper case		
		String upp = s.toUpperCase();
		System.out.println("\nTo convert Uppercase of String: "+upp);
		
		//3. To convert the string from Upper to Lower
		String low = s.toLowerCase();
		System.out.println("\nTo convert Lowercase of String: "+low);
		
		//4. To check whether the string starts with particular value
		boolean start = s.startsWith("a");
		System.out.println("\nStarts With Particular Value: "+start);
		
		//5. To check whether the given string is particular value or not
		boolean cont = s.contains("Ezhumalai");
		System.out.println("\nTo Check whether Particular Contains: "+cont);
		
		//6. To check whether the string is empty or not
		boolean emp = s.isEmpty();		
		System.out.println("\nTo check given String is empty or Not: "+emp);
		
		//7. To fetch a letter from given String
		char prnt = s.charAt(2);
		System.out.println("\nTo fetch a letter from Given String: "+prnt);
		
		//8. To find index position from index letter
		int indpos = s.indexOf('i');
		System.out.println("\nTo find index position: "+indpos);
		
		int Lindex = s.lastIndexOf('m');
		System.out.println("\nTo find last index of Value: "+Lindex);
		
		int ind = s.indexOf('a', 2);
		System.out.println("\nTo find Index Position: "+ind);
		
		//9. To replace old character or word into another char or word
		
		String rep1 = s.replace('h', 'H');
		String rep2 = s.replace('i', 'I');
		String Rall = s.replaceAll("eyan", "karthik");
		System.out.println("\nTo Replace Old into New: "+rep1);
		System.out.println("\nTo Replace Old into New: "+rep2);
		System.out.println("\nTo Replace All: "+Rall);
		
		//10. To starts with particular index value by using SubString
		String sub1 = s.substring(12);
		System.out.println("\nTo starts with particular index value: "+sub1);
		
		String sub2 = s.substring(3, 7);
		System.out.println(sub2);
		
		//11. To remove the space present before and after the words
		String tr = s.trim();
		System.out.println("\nTo remove the space between words: "+tr);
		
		String g = " karthikeyan Jayasri          ";
		String trm = g.trim();
		System.out.println("\nTo remove unwanted space:"+trm);
		
		//12. To check equiality from given two Strings
		String s1 = "Karthikeyan";
		String s2 = "Jayasri";
		boolean equ1 = s1.equals(s2);
		System.out.println("\nTo check equality from given two String: "+equ1);
		
		String s3 = "Karthik";
		String s4 = "KarTHik";
		boolean case1 = s3.equalsIgnoreCase(s4);
		System.out.println("\nTo check Wqual IgnoreCase: "+case1);
		
		//13. To merge both String by Using Concat method
		String k1 = "Java";
		String j1 = "Selenium With Automation";
		String concat = k1.concat(j1);
		System.out.println("\nTo Concat Both String: "+concat);
		
		//14. Ascii method
		String dev1 = "SATHYADEV";
		String dev2 = "DEVSATHYA";
		String dev3 = "V";
		
		int to1 = dev1.compareTo(dev2);
		System.out.println(to1);
		
		int to2 = dev1.compareTo(dev3);
		System.out.println(to2);
	
		
		//15. Split method
		String[] splt = s.split("a");
		for (String str : splt) {
			System.out.println(str);			
		}	
		
	}

}
