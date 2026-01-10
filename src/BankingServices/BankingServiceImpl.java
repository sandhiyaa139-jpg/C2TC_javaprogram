package  BankingServices;

import java.util.*;
import BankingSystemEntities.*;

public class BankingServiceImpl implements bankingservices {

    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Account> accounts = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();
    private List<Beneficiary> beneficiaries = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerID(), customer);
    }

    @Override
    public void addAccount(Account account) {
        accounts.put(account.getAccountID(), account);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        Account acc = accounts.get(transaction.getAccountID());
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        if (transaction.getType().equalsIgnoreCase("Deposit")) {
            acc.setBalance(acc.getBalance() + transaction.getAmount());
        } else if (transaction.getType().equalsIgnoreCase("Withdrawal")) {
            if (acc.getBalance() >= transaction.getAmount()) {
                acc.setBalance(acc.getBalance() - transaction.getAmount());
            } else {
                System.out.println("Insufficient balance!");
                return;
            }
        }

        transactions.add(transaction);
        System.out.println("Transaction successful!");
    }

    @Override
    public void addBeneficiary(Beneficiary beneficiary) {
        beneficiaries.add(beneficiary);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public List<Account> getAccountsByCustomerId(int customerId) {
        List<Account> list = new ArrayList<>();
        for (Account a : accounts.values()) {
            if (a.getCustomerID() == customerId)
                list.add(a);
        }
        return list;
    }

    @Override
    public List<Transaction> getTransactionsByAccountId(int accountId) {
        List<Transaction> list = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getAccountID() == accountId)
                list.add(t);
        }
        return list;
    }

    @Override
    public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
        List<Beneficiary> list = new ArrayList<>();
        for (Beneficiary b : beneficiaries) {
            if (b.getCustomerID() == customerId)
                list.add(b);
        }
        return list;
    }

    @Override
    public void transferMoney(int fromAccId, int toAccId, double amount) {
        Account fromAcc = accounts.get(fromAccId);
        Account toAcc = accounts.get(toAccId);

        if (fromAcc == null || toAcc == null) {
            System.out.println("One or both accounts not found!");
            return;
        }

        if (fromAcc.getBalance() < amount) {
            System.out.println("Insufficient balance to transfer!");
            return;
        }

        fromAcc.setBalance(fromAcc.getBalance() - amount);
        toAcc.setBalance(toAcc.getBalance() + amount);

        transactions.add(new Transaction(fromAccId, "Transfer Out", amount));
        transactions.add(new Transaction(toAccId, "Transfer In", amount));

        System.out.println("Transfer successful!");
    }

    @Override
    public double checkBalance(int accountId) {
        Account acc = accounts.get(accountId);
        return (acc != null) ? acc.getBalance() : -1;
    }
}
