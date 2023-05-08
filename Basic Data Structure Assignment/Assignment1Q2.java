/*Q2. Find out all the Armstrong numbers falling in the range of 100-999

Description :-

An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.

Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371 ( If you add those all numbers, the final digit should be same as given number ).

Find the Armstrong numbers between 100 to 999.

Test cases:      

              Output : 153 370 371 407       

Specifications:
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){}
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;

    }
} */
import java.util.Scanner;
class ArmstrongNumBetweenRange{
	public int[] armstrongNumbersInRange(int min , int max) {
		int arr[] = new int[4];
		List<Integer> list=new ArrayList<>();
		for(int i=min;i<=max;i++) {
		 int answer=0;
		 int newNum1=i;
		 int newNum2=i;
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
		 if(i==answer)
		 {
			list.add(i);
		 }

		int size=list.size();
			//arr[]=new int[size];
		 for(int j=0;j<size;j++) {
			 arr[j]=list.get(j);
		 }  
	 }
return arr;
	}
}
public class Assignment1Q2 {
	 public static void main(String[] args) {
		 int min = 100;
		 int max = 999;
		Scanner sc=new Scanner(System.in); 
		ArmstrongNumBetweenRange armstrong=new ArmstrongNumBetweenRange();
		int[] arr=armstrong.armstrongNumbersInRange(min ,max) ;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}  
	 }

	}
