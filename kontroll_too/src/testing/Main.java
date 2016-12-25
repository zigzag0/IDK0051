package testing;

import java.util.Optional;

import cooking.Cook;
import cooking.CookersFactory;

public class Main {

	public static void main(String[] args) {

		// ainult kui on Cook avalik
		// Master mrc = new Master("Name1");
		// Student_cook stc = new Student_cook("Name2");
		// Master mrc2 = new Master("Name3");
		// Student_cook stc2 = new Student_cook("Name4");

		// Meetod nr.1
		// Master mrc3 = CookersFactory.getInsansOfMaster("Name5");
		// Student_cook stc3 = CookersFactory.getInsansOfStudent_cook("Name6");

		// meetod nr2 eel defineetitud parameetritega...
		Cook master1 = CookersFactory.getInstanceOf("master", "name1");
		Cook master2 = CookersFactory.getInstanceOf("master", "name2");
		Cook student1 = CookersFactory.getInstanceOf("student", "name3");
		Cook student2 = CookersFactory.getInstanceOf("student", "name4");

		// System.out.println(Cook.getAllCooks());
		// Cook.getAllCooks().forEach(System.out::println);
		Cook.getAllCooks().forEach(x -> x.cook());
		System.out.println("------------------------------------------------------------");

		Cook.getAllCooks().forEach(x -> x.sleaping());

		System.out.println("------------------------------------------------------------");

		// System.out.println(Cook.getCookByIndex(2));

		Optional<Cook> optionalCook = Cook.getCookByIndex(3);
		if (optionalCook.isPresent()) {
			System.out.println("Cook found: " + optionalCook.get());
		} else {
			System.out.println("Cook not found...");
		}

		System.out.println("------------------------------------------------------------");
		// System.out.println(mrc);
		// System.out.println(stc);
		//
		// System.out.println("------------------------");
		//
		// mrc.cook();
		// stc.cook();
		//
		// mrc.sleaping();
		// stc.sleaping();
		//
		// System.out.println("------------------------");

	}
}
