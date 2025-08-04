package strings;

import java.util.Arrays;

public class Methods_String_Class {

	public static void main(String[] args) {
		
		System.out.println("The methods of String class :");
		
		String str ="pneumonoultramicroscopicsilicovolcanoconiosis";
		
		System.out.println(str.charAt(0));  // extracts the single charcter 
		
		System.out.println(str.codePointAt(12));//97 gives ascii value 
		
		System.out.println(str.codePointBefore(13));//97 gives ascii value  before the given index
		
		System.out.println(str.codePointCount(0,9));//gives unique unicode code points count in range given 
		
		System.out.println("Om".compareTo("om"));//use to compare strings greater or smaller 
		// 0 =  same string 
		// positive number = greater string 
		// negative number = smaller string 
		
		System.out.println("omi".compareToIgnoreCase("Omi"));//ignores case  only compares string 
		
		System.out.println("hi".concat("Hello|")); // adds the two string 
		
		System.out.println(str.contains("volcano"));//true checks the string conatins the given string or not in boolean output
		
		System.out.println("hi".contentEquals("hi"));//true checks string is ditto same or not 
		
		System.out.println(str.endsWith("sis"));//true checks ending string 
		
		System.out.println(str.startsWith("pne"));//true checks start with given string 
		
		byte [] ar = str.getBytes();// converts a String into a byte array using the platform's default charset (usually UTF-8
		
		System.out.println(Arrays.toString(ar));//converts to ascci value array of string given 
		
		System.out.println(str.indent(10));//gives indentation to string that is space from start
		
		System.out.println(str.indexOf('a'));// returns the index of the given char
		
		System.out.println(str.indexOf('a',6));// prints the index of the character 'a' in the string str, starting the search at index 6
		
		System.out.println(str.indexOf("volcant"));
//This method searches for the first occurrence of the substring "volcant" in the string str.
//It returns:The starting index of the first match, if found -1 if the substring is not found
		
		System.out.println("oom".isBlank());//if blank gives true , else false
		
		System.out.println("   ".isEmpty());// FALSE checks the string is empty or not ,space is considere here
		
		System.out.println(str.lastIndexOf('s'));//This returns the last occurrence (highest index) of the character 's' in the string str.
		
		System.out.println(str.length());//45
		
		System.out.println("AB".repeat(5));// repeats the string given the number of ttimes specified
		
		System.out.println(str.replace('a', '#'));//pneumonoultr#microscopicsilicovolc#noconiosis
		
		System.out.println(str.replace("volcano", "Omkar"));//pneumonoultramicroscopicsilicoOmkarconiosis
		
		String str2 = " I Love My India";
		
		String [] words = str2.split("");
		System.out.println(Arrays.toString(words));//[ , I,  , L, o, v, e,  , M, y,  , I, n, d, i, a]
		
		String str3 =" I Love MySelf";
		
		String [] words2 = str3.split("o");
		System.out.println(Arrays.toString(words2));//[ I L, ve MySelf]
		
		System.out.println("   Ab   ".strip());// removes white spaces from both sides 
		
		System.out.println(str3.substring(9));//ySelf   finds the sustring from index + 1 given 
		
		System.out.println(str3.substring(5,10));//ve My   gives the substring in given range
		
		char ch [] = str3.toCharArray();//coverts the string character array 
		
		System.out.println(Arrays.toString(ch));//[ , I,  , L, o, v, e,  , M, y, S, e, l, f]
		
		System.out.println(str3.toUpperCase());//I LOVE MYSELF
		
		System.out.println(str3.toLowerCase());//i love myself
		
		}

}
