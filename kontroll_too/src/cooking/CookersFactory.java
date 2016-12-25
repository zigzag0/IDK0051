package cooking;

public class CookersFactory {

	public CookersFactory() {
	}

	// meetod nr.1
	// public static Master getInsansOfMaster(String name) {
	// return new Master(name);
	// }
	// public static Student_cook getInsansOfStudent_cook(String name) {
	// return new Student_cook(name);
	// }

	// meetod 2 ainult parameetriga...
	public static Cook getInstanceOf(String type, String name) {
		if (type.equals("master")) {
			return new Master(name);
		} else if (type.equals("student")) {
			return new Student_cook(name);
		}
		return null;
	}

}
