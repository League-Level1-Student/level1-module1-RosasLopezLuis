package _06_duck;

public class DuckMain {

	public static void main(String[] args) {
		Duck daffy = new Duck("donuts", 5);
		daffy.quack();
		
		Dog benji = new Dog("bone",3);
		benji.quietBark();
	}

}
