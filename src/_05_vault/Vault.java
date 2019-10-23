package _05_vault;

public class Vault {
	private int code= 16512;
	boolean tryCode(int i) {
		if(i == code)
		{
			return true;
		} 
		else {
			return false;
		}
	}
}
