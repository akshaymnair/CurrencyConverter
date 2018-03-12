import java.util.Collection;
import java.util.Scanner;

public class CurrencyConverter { // read inputs, convert currency

	Currency ciw = new Currency(); // instance of currency - 'currency i want'
	Currency cih = new Currency(); // instance of currency - 'currency i have'

	double[][] conversionRates = { // matrix to store all the conversion rates
			{1,106.8,.95,.81},
			{.009,1,.008,.007},
			{1.05,112.25,1,.85},
			{1.23,131.4,1.17,1}
	};//order is US, Yen, Swiss, Euro 
	// currency ids = USD=0, Yen=1, Swiss=2, Euro=3


	private HistoricalExchangeRates historicalExchangeRates;

	private LiveExchangeRates liveExchangeRates;

	boolean getValues() { // read data from the user

		System.out.println("Enter the amount you have :");
		Scanner scan = new Scanner(System.in);
		cih.amount  = scan.nextDouble();
		System.out.println("Enter the id of the Currency you have(USD=0, Yen=1, Swiss=2, Euro=3) :");
		cih.unit = scan.nextInt();
		System.out.println("Enter the id of the Currency you want(USD=0, Yen=1, Swiss=2, Euro=3) :");
		ciw.unit = scan.nextInt();
		scan.close();

		System.out.println("Currency you have: "+ cih.amount + " "+ Currency(cih.unit));
		System.out.println("Currency you want: "+Currency(ciw.unit));
		return true;
	}

	boolean converter() { // convert currency cih to ciw 

		ciw.amount = conversionRates[cih.unit][ciw.unit]*cih.amount;
		System.out.println("Amount you get is: "+ ciw.amount+" "+Currency(ciw.unit));
		if (ciw.amount>=0)
			return true;
		else
			return false;
	}

	String Currency(int type) { // get the Currency name from the currency ids 
		if (type == 0)
			return "USD";
		else if (type ==1)
			return "Yen";
		else if (type ==2)
			return "Swiss";
		else if (type ==3)
			return "Euro";
		else
			return "unknown";
	}

	public static void main(String[] args) { //main function

		CurrencyConverter money = new CurrencyConverter(); // create currency object
		boolean con = false;
		if(money.getValues()) // get the user inputs
			con = money.converter(); // calculate the conversion and show output
		if(con)
			System.out.println("Program completed Successfully!");
	}

}
