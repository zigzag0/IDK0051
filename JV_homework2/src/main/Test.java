package main;

import doorsystem.Doorlock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doorlock lock1 = new Doorlock("REAAL");
		lock1.valideeri("511111");
		Doorlock lock2 = new Doorlock("KARLDA");
		lock2.valideeri("411111");
		Doorlock lock3 = new Doorlock("KARDLA");
		lock3.valideeri("62222333");
		Doorlock lock4 = new Doorlock("KAPAK");
		lock4.valideeri("5222222222222");
		Doorlock lock5 = new Doorlock("NOO");
		lock5.valideeri("5232323232323");
		Doorlock lock6 = new Doorlock("NOO");
		lock6.valideeri("111111115");
	}

}
