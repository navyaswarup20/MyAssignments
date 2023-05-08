import java.util.Scanner;

/*3. Find out the simple as well as the compound interest of supplied value

Description:-

Simple Interest:- Generally, simple interest paid or received over a certain period is a fixed percentage of the principal amount that was borrowed or lent

              Simple Interest = (P×r×n)/100

              where:

              P            =            Principal amount

              r             =            Annual interest rate

              n            =            Term of loan, in years

​Compound Interest:-Compound interest accrues and is added to the accumulated interest of previous periods; it includes interest on interest, in other words.

              Compound Interest = P(1+r)^t-P

              Where:

              P=Principal amount

              r=Annual interest rate

              t=Number of years interest is applied

Specifications:
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){}
    public double compoundInterest(double principalAmount,int time,double interestRate){}
}
public class Assignment1Q3 {
    public static void main (String args[]) {}
} */
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double si=((principalAmount)*(time)*(interestRate))/100;
    	return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    double rate=1+(interestRate);
    double finalRate=Math.pow(rate, time);
    	double ci=	principalAmount*finalRate;
    	double ans=ci-principalAmount;
    	return ans;
    } 
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	SiCi obj=new SiCi();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("What you want to find:");
    	System.out.println("Press 1 for Simple Interest");
    	System.out.println("Press 2 for Compound Interest");
    	int n=sc.nextInt();
    	System.out.println("Enter Principal amount");
    	double principal=sc.nextDouble();
    	System.out.println("Enter Annual interest rate");
    	double interest =sc.nextDouble();
    	System.out.println("Enter Term of loans,in years");
    	int year=sc.nextInt();
    	if(n==1) {
    		int ans=(int)obj.simpleInterest(principal, year, interest);
    		System.out.println("Simple Interest is "+ans);
    	}
    	else {
    		int ans=(int)obj.compoundInterest(principal, year, interest);
    		System.out.println("Compound Interest is "+ans);
    	}
 
    }
}


