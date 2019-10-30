package _06_duck;

public class Dog {
		String favoriteToy;
		int numberOfToys;
		
		Dog(String favoriteToy, int numberOfToys){
			this.favoriteToy = favoriteToy;
			this.numberOfToys = numberOfToys;
		}
		public void bark() {
			System.out.println("WOOF");
		}
		public void quietBark() {
			System.out.println("woof");
		}
		
}
