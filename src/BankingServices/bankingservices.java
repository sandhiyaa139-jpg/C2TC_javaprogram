package BankingServices;
import BankingSystemEntities.*;
import java.util.List;
public interface bankingservices {
	 void addCustomer(Customer customer);
	    void addAccount(Account account);
	    void addTransaction(Transaction transaction);
	    void addBeneficiary(Beneficiary beneficiary);

	    Customer findCustomerById(int id);
	    List<Account> getAccountsByCustomerId(int customerId);
	    List<Transaction> getTransactionsByAccountId(int accountId);
	    List<Beneficiary> getBeneficiariesByCustomerId(int customerId);

	    // Extra Features
	    void transferMoney(int fromAccId, int toAccId, double amount);
	    double checkBalance(int accountId);
	}

