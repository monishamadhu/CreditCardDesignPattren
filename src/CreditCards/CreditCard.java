package CreditCards;

public abstract class CreditCard {
	String cardNumber;
	String cardHolder;
	String expDate;
	
	public CreditCard(String cardNum,String cardHolder, String expiry) {
		this.cardNumber=cardNum;
		this.cardHolder = cardHolder;
		this.expDate = expiry;
	}

	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
}
