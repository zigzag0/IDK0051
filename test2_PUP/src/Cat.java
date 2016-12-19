
public class Cat extends Animal {
	int age;

	// public Cat() {
	private Cat(int age) {
		this.age = age;
		System.out.println("Cat from Animal");
	}

	public static Cat getInstanceOfCat(int age) {
		return new Cat(age);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		return true;
	}

	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Cat other = (Cat) obj;
	// if (age != other.age)
	// return false;
	// return true;
	// }

}
