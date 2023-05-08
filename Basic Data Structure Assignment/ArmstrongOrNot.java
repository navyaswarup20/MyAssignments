
/*Q1: Find out if the given number is an Armstrong number or not. 

Description :-

An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.

Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371 ( If you add those all numbers, the final digit should be same as given number ).



Specifications:
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {}

public class Assignment1Q1 {
    public static void main(String[] args) {}
}
*/

class ArmstrongOrNot {
	 public boolean armstrongCheck(int num) {
		 int answer=0;
		 int newNum1=num;
		 int newNum2=num;
		 int count=0;
		 while(newNum1!=0) {
			int r=newNum1%10;
			 count++;
			 newNum1=newNum1/10;
		 }
		 while(newNum2!=0) {
		 int r=newNum2%10;
		 answer=(int)(answer+Math.pow(r, count));
		 newNum2=newNum2/10;
		 }
		 if(num==answer)
		 {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
}





