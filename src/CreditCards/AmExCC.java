package CreditCards;

public class AmExCC extends CreditCard {
	public AmExCC(String cardNum,String cardHolder, String expiryDate) {
		super( cardNum, cardHolder,  expiryDate);

	}
	
	public String toString() {
	
		return "AmExCC Card:\nCardNumber: " + cardNum + "\nCardHolderName: " + cardHolder + "\nExpirationDate: "
				+ expiryDate;
	}

}
