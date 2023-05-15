/******************************************************************************
1) Write an application to determine the length of the String str = “Hello World”. (Hint: Use 
String method)
2) Write an application to join the two Strings “Hello, ” & “How are you?” (Hint: Use String 
method)
3) Given a String “Java String pool refers to collection of Strings which are stored in heap 
memory”, perform the following operations (Hint: all operation can be performed using 
String methods)
a. Print the string to console in lowercase
b. Print the string to console in uppercase
c. Replace all ‘a’ character in the string with $ sign
d. Check if the original String contains the word “collection”
e. Check if the following String “java string pool refers to collection of strings which 
are stored in heap memory” matches the original
f. If the string does not match check if there is another method which can be used to 
check if the strings are equal

*******************************************************************************/
import java.util.*;
public class String
{
	public static void main(String[] args) {
		//1 question
		String str="Hello World";
		System.out.println("String length: "+str.length());
		//2 question
		String str1="Hello, ";
		String str2="How are you?";
		System.out.println("After Merging above two string: "+str1+str2);
		System.out.println("After Merging above two string using concat fun: "+str1.concat(str2));
		//3 question
		String str3=new String("Navya");
		//3(a)
		System.out.println("Lower Case: " +str3.toLowerCase());
		//3(b)
		System.out.println("Upper Case: " +str3.toUpperCase());
		//3(c)
		String newString=str3.replaceAll("a","\\$");
		System.out.println("Replace: " + newString );
		//3(d)
			System.out.println("Contain: " +str3.contains("collection") );
		//3(e)
		String str4="Navya"; //string pool
		String str5=new String("Navya"); //heap memory /always new
		System.out.println("Equals using == method: "+(str3==str4)); //refernce
		//3(f)
		System.out.println("Equals using equals method: "+(str3.equals(str4))); //object value
	}
}
