package java_Basic;

public class Bank {

	private String bankName;
	private String branchName;

	public Bank() {
		System.out.println("In Default Bank");
	}

	public Bank(String bankName, String branchName) {
		System.out.println("In Parameterised Bank");
		this.bankName = bankName;
		this.branchName = branchName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		System.out.println("In Setter Bank");
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		System.out.println("In Setter Bank");
		this.branchName = branchName;
	}
}
