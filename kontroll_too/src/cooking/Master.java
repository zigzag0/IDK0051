package cooking;

public class Master extends Cook {

	public Master(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Master [name=" + name + "]";
	}

	@Override
	public void cook() {
		System.out.println(this + "::::: I cook like Profff...! :-)");
	}

	@Override
	public void eating() {
	}

}
