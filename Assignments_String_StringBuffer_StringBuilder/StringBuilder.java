/******************************************************************************
Note: StringBuilder: J2SE 5 adds a new string class to Java’s already powerful string handling 
capabilities. This new class is called StringBuilder. It is identical to StringBuffer except for one 
important difference: it is not synchronized, which means that it is not thread safe. The advantage 
of StringBuilder is faster performance. However, in cases in which you are using multithreading, 
you must use StringBuffer rather than StringBuilder.
1) Provide solution for “Assignments on StringBuffer Class” using StringBuilder class
a) Write an application to append the following strings “StringBuffer”, “is a peer class of 
String”, “that provides much of “, “the functionality of strings” using a StringBuffer.
b) Insert the following string “insert text” into the string “It is used to _ at the specified index 
position” at the location denoted by the sign _
c) Reverse the following string “This method returns the reversed object on which it was 
called” using StringBuffer Class
*******************************************************************************/
import java.util.*;
public class StringBuilder
{
	public static void main(String[] args) {
	    //1
	    String str1="StringBuilder ";
	    String str2="is a peer class of String ";
	    String str3="that provides much of ";
	    String str4="the functionality of strings";
	StringBuilder stringBuilder=new StringBuilder();
	stringBuilder.append(str1);
	stringBuilder.append(str2);
	stringBuilder.append(str3);
	stringBuilder.append(str4);
	System.out.println(stringBuilder);
	//2
		StringBuilder stringBuilder1=new StringBuilder("It is used to _ at the specified index position");
		String string="insert text";
		int index=stringBuilder1.indexOf("_");
		stringBuilder1.replace(index,index+1,string);
		System.out.println(stringBuilder1);
	//3
	String newString="This method returns the reversed object on which it was called";
	StringBuilder newStringBuilder=new StringBuilder();
	newStringBuilder.append(newString);
	newStringBuilder.reverse();
	System.out.println("After reverse: "+newStringBuilder);
	}
}
