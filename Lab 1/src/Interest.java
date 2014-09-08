import java.util.Scanner;
// Done by John Oribioye, Aylin Dindi  and Drew Madden.

public class Interest {
	
	public static void main(String[] args){
		
		double AReturn;
		int RTYears;
		double ReqIncome;
		double SSI = 2642.00;
		double FinalValue;
		
	//Variables for use
		
		Scanner userinput = new Scanner(System.in);
		
	//User input of values	
		System.out.println("How many Years have you been retired for?");
		RTYears = userinput.nextInt();
		System.out.println("How much interest do you expect recieve Annually on your investment");
		AReturn = userinput.nextDouble();
		System.out.println("What is your required income?");
		ReqIncome = userinput.nextDouble();
		
		//final calculation of User input
		FinalValue = (ReqIncome - SSI) * ( ( 1- ( 1/Math.pow(1 + AReturn/12, ( RTYears * 12 ) ) ) ) ) / (AReturn/12);
		
		System.out.println("You need to save a total of " + Math.round(FinalValue) + " Dollars");
		//printing final value
		
	
		int YearsWork;
		double AInterest;
		double pmt;
		
		
		//User Input
		System.out.println("How many Years do you plan to work for?");
		YearsWork = userinput.nextInt();
		System.out.println("How much interest do you expect recieve Annually on your investment");
		AInterest = userinput.nextDouble();
		
		//Calculating the monthly outcome 
		pmt = ( FinalValue ) / ( ( Math.pow(1 + AInterest/12, ( YearsWork*12 ) ) - 1 ) / AInterest/12 );
		
		System.out.println("You will save $ " + Math.round(pmt) + " Each Month");
		//Monthly Outcome
				
		
	}
	
	
	
	
	
	
	
	
}


