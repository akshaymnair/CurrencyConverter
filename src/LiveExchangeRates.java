public class LiveExchangeRates extends Currency {

	private int convertFrom_CurrencyID = 0;

	private int convertTo_CurrencyID = 1;

	private Currency currency;

	private CurrencyConverter currencyConverter;

	public double calculateExchangeRate() {
		return 0;
	}

}
