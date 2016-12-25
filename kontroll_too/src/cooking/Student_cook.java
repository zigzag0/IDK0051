package cooking;

public class Student_cook extends Cook {

	public Student_cook(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student_cook [name=" + name + "]";
	}

	@Override
	public void cook() {
		System.out.println(this + "::::: Fu.. I burnit again! :-(");

	}

	@Override
	public void eating() {
	}

}
