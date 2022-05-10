package Business;

public class Bank {
	private int amount = 5000;
	private String accno = "sbi125694";

	public int deposit(String accno, int amount) {
		if (accno.equals(this.accno)) {
			System.out.println("In Deposite Method:");
			this.amount = this.amount + amount;
			return this.amount;
		} else {
			throw new AccnoNotFoundException();
		}

	}

}
