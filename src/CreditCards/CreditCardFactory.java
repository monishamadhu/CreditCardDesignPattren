package CreditCards;

public class CreditCardFactory {

	public static CreditCard createCreditCard(String creditCardNum, String cardHolder, String expiryDate) {
		CreditCard ccObj = null;
		if(creditCardNum.length()==16) {
			if(creditCardNum.substring(0, 4).equalsIgnoreCase("6011")) {
				return new Discover(creditCardNum, cardHolder, expiryDate);
			}else if (creditCardNum.substring(0, 1).equalsIgnoreCase("5") || creditCardNum.substring(0, 1).equalsIgnoreCase("2")) {
				//Todo add code for validating second digit
				return new MasterCC(creditCardNum, cardHolder, expiryDate);
			}
		}
		return ccObj;
	}
}
