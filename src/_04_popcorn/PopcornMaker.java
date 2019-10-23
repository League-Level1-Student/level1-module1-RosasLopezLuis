package _04_popcorn;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microwave micro = new Microwave();
		Popcorn pop = new Popcorn("corn");
		micro.putInMicrowave(pop);
		micro.setTime(2);
		micro.startMicrowave();
		
	}

}
