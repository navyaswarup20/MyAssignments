import java.util.Scanner;
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
