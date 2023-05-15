/******************************************************************************
Note: StringBuffer is a peer class of String that provides much of the functionality of strings. String 
represents fixed-length, immutable character sequences while StringBuffer represents growable 
and writable character sequences. StringBuffer may have characters and substrings inserted in 
the middle or appended to the end. It will automatically grow to make room for such additions 
and often has more characters preallocated than are actually needed, to allow room for growth.
1) Write an application to append the following strings “StringBuffer”, “is a peer class of 
String”, “that provides much of “, “the functionality of strings” using a StringBuffer.
2) Insert the following string “insert text” into the string “It is used to _ at the specified index 
position” at the location denoted by the sign _
3) Reverse the following string “This method returns the reversed object on which it was 
called” using StringBuffer Class
*******************************************************************************/
import java.util.*;
public class StringBuffer
{
	public static void main(String[] args) {
	    //1
	    String str1="StringBuffer ";
	    String str2="is a peer class of String ";
	    String str3="that provides much of ";
	    String str4="the functionality of strings";
	StringBuffer stringBuffer=new StringBuffer();
	stringBuffer.append(str1);
	stringBuffer.append(str2);
	stringBuffer.append(str3);
	stringBuffer.append(str4);
	System.out.println(stringBuffer);
	//2
		StringBuffer stringBuffer1=new StringBuffer("It is used to _ at the specified index position");
		String string="insert text";
		int index=stringBuffer1.indexOf("_");
		stringBuffer1.replace(index,index+1,string);
		System.out.println(stringBuffer1);
	//3
	String newString="This method returns the reversed object on which it was called";
	StringBuffer newStringBuffer=new StringBuffer();
	newStringBuffer.append(newString);
	newStringBuffer.reverse();
	System.out.println("After reverse: "+newStringBuffer);
	}
}
