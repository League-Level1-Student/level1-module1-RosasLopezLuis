package _05_vault;

public class Runner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond bond = new JamesBond();
		int result = bond.findCode(vault);
		System.out.println(result);
	}
}
