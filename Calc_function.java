package in.acad.ij.FullCalculator;
import java.util.Scanner;

public class FullCalculator {
	
	
	static Scanner scan=new Scanner(System.in);

	static FullCalculator fc=new FullCalculator();

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//FullCalculator fc=new FullCalculator();
		fc.Calculator();
		}
	void Calculator() throws InterruptedException 
	{
	
		System.out.println("WE ARE HERE IN CALCULATOR SECTION");
		Thread.sleep(1000);
			System.out.println("For Addition enter-1||For Substraction enter-2||For Multiplication enter-3||"
					+ "For Division enter-4||For factorial enter 5||For fibonacci series calculation enter 6");
			int p=scan.nextInt();
			switch(p) 
			{
			case 1:
				fc.Addition();
				break;
			case 2:
				fc.Substraction();
				break;
			case 3:
				fc.Multiplication();
				break;
			case 4:
				fc.Division();
				break;
			case 5:
				fc.Factorial();
				break;
			case 6:
				fc.fibonacci();
				break;
				default:
					System.out.println("You have enterd wrong input");
				System.exit(p);
			}
		System.out.println("Press 2 for continue and 1 for exit");
		int ask=scan.nextInt();
		if(ask==1) {
			
		}
		else {
			fc.Calculator();
		}
	}
	
public void Addition() 
{
	System.out.println("Enter 1st no.to calculate SUM");
	double a=scan.nextInt();
	System.out.println("Enter 2nd no.to calculate SUM");
	double b=scan.nextInt();
	int arr[] = new int[7];
	for(int i =0;i<arr.length;i++)
	{
		System.out.println("Enter "+i+" no.to calculate SUM");
		arr[i] = scan.nextInt();
	}
	int result = 0;
	for(int i =0;i<arr.length;i++)
	{
		
		result += arr[i];// = scan.nextInt();
	}
	double c=a+b;
	System.out.println("SUM= "+c);
	
	}
public void Substraction()
{
	System.out.println("Enter large no.to calculate SUBSTRACTION");
	double d=scan.nextInt();
	System.out.println("Enter smaller no.to calculate SUBSTRACTION");
	double e=scan.nextInt();
	double f=d-e;
	System.out.println("SUBSTRACTION= "+f);
	}
public void Multiplication()
{
	System.out.println("Enter 1st no.to calculate MULTIPLICATION");
	double g=scan.nextInt();
	System.out.println("Enter 2nd no.to calculate MULTIPLICATION");
	double h=scan.nextInt();
	double i=g*h;
	System.out.println("PRODUCT= "+i);
	}
public void Division()
{
	System.out.println("Enter DIVIDEND");
	double j=scan.nextInt();
	System.out.println("Enter DIVISOR");
	double k=scan.nextInt();
	double l=j/k;
	System.out.println("DIVISION= "+l);
	}
public void Factorial()
{
	System.out.println("Enter the no. for which you want to calculate factorial");
	int m=scan.nextInt();
	long result =1;
	for(int i=m;i>1;i--) 
	{
		result =result* i;
		
	}
	System.out.println("Factorial is "+result);
}
public void fibonacci()
{
	System.out.println("How long fibonacci series would you like to print");
	int n=scan.nextInt();
	System.out.println("fibonacci series are:");
	int q=0;
	int r=1;
	int s=0;
	
			for(int p=1;p<=n;p++)
			{
				s=q+r;
				System.out.print(s+"\t");
				q=r;
				r=s;
			}
	}
}
