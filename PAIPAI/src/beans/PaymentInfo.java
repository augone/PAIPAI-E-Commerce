package beans;

import java.io.Serializable;

public class PaymentInfo implements Serializable{
	 private String crediCardNumber;
	 private String expirationDate;
	 private String cvvCode; 
	 private String cardHolderName;
	 
	 public PaymentInfo() {
		 
	 }

	public String getCrediCardNumber() {
		return crediCardNumber;
	}

	public void setCrediCardNumber(String crediCardNumber) {
		this.crediCardNumber = crediCardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

}
