package student;

public class Test {

	public static void main(String[] args) {
		// Student student1 = new Student();
		// Student student2 = new Student();
		// Student student3 = new Student();

		// student1.setSunniAasta(1954);
		// student2.setSunniAasta(2003);
		// student3.setSunniAasta(2005);

		Student student1 = new Student(2064, "Jaan");
		Student student2 = new Student(1345, "Patric");
		Student student3 = new Student(1001, "Avdosja");

		System.out.println(student1.getSunniAasta());
		System.out.println(student2.getSunniAasta());
		System.out.println(student3.getSunniAasta());

		System.out.println(student1.getNimi());
		System.out.println(student2.getNimi());
		System.out.println(student3.getNimi());

	}
}
