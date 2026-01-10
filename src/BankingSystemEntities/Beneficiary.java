package BankingSystemEntities;

public class Beneficiary {

	private int beneficiaryID;
	    private int customerID;
	    private String name;
	    private String accountNumber;
	    private String bankDetails;
	
	    public Beneficiary(int beneficiaryID, int customerID, String name,
	                       String accountNumber, String bankDetails) {
	        this.beneficiaryID = beneficiaryID;
	        this.customerID = customerID;
	        this.name = name;
	        this.accountNumber = accountNumber;
	        this.bankDetails = bankDetails;
	    }
	
	    public int getCustomerID() { return customerID; }
	
	    @Override
	    public String toString() {
	        return "Beneficiary ID: " + beneficiaryID + ", Name: " + name +
	               ", Account: " + accountNumber + ", Bank: " + bankDetails;
	    }
	}
	
