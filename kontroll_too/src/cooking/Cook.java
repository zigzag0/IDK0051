package cooking;

import java.util.ArrayList;
import java.util.Optional;

public abstract class Cook implements Person {

	private static ArrayList<Cook> allCooks = new ArrayList();

	protected String name;

	// ainult kui on avalik
	// public Cook(String name) {
	// this.name = name;
	// allCooks.add(this);
	// }

	protected Cook(String name) {
		this.name = name;
		allCooks.add(this);
	}

	// public static Cook getCookByIndex(int index) {
	// return allCooks.get(index);
	// };

	public static Optional<Cook> getCookByIndex(int index) {
		System.out.println("getting a cook by index " + index);
		// added to test Optional
		// return Optional.ofNullable(null);
		//
		return Optional.ofNullable(allCooks.get(index));
	}

	public abstract void cook();

	@Override
	public void sleaping() {
		System.out.println(this + "::::: I sleep like a baby! Zzzzz....");
	}

	public static ArrayList<Cook> getAllCooks() {
		return allCooks;
	}

}
