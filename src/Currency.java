public class Currency {

	int unit; // the currency type, taken as USD=0, Yen=1, Swiss=2, Euro=3
	double amount; // it is the amount in a particular currency the user have in hand

	Currency() { // constructor to initialize values 
		unit = 0;
		amount = 0.0;
	}
}
