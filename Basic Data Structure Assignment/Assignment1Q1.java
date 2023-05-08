import java.util.Scanner;
public class Assigment1Q1 {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Please enter the number");
		int number=sc.nextInt();
		ArmstrongOrNot armstrong=new ArmstrongOrNot();
		boolean ans=armstrong.armstrongCheck(number);
		if(ans) {
			System.out.println(number+" is an Armstrong Number");
		}
		else {
			System.out.println(number+" is not an Armstrong Number");
		}
		sc.close();
	 }
	}
