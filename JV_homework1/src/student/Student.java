package student;

public class Student {

	private int sunniAasta;
	private String nimi = "";

	public Student(int sunniAasta, String nimi) {
		this.sunniAasta = sunniAasta;
		this.setNimi(nimi);
	}

	public int getSunniAasta() {
		return sunniAasta;
	}

	public void setSunniAasta(int sunniAasta) {
		this.sunniAasta = sunniAasta;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
}
