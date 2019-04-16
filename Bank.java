
package iit;


    import java.io.Serializable;

public class Bank implements Serializable
{
	private Personal person;
	private String accNum; 
	private double balance;
	
	public Bank ( String accNum, Personal person,double balance) {

		this.accNum = accNum;
		this.person=person;
		this.balance = balance;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
