package doorsystem;

import vadidatesystem.CheckStatus;

public class Doorlock {

	private CheckStatus check;
	private String koolikood;

	public Doorlock(String koolikood) {
		super();
		this.setKoolikood(koolikood);
		this.check = new CheckStatus();
	}

	public boolean valideeri(String isikukood) {
		System.out.println(isikukood);
		System.out.println(koolikood);

		// CheckStatus check = new CheckStatus();

		if (check.kontrolli(koolikood, isikukood)) {
			System.out.println("saab sisse");
			return true;
		} else {
			System.out.println("ei saa");
			return false;
		}

	}

	public String getKoolikood() {
		return koolikood;
	}

	public void setKoolikood(String koolikood) {
		this.koolikood = koolikood;
	}

}
