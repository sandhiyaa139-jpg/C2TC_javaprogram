package BankingSystem;
import BankingSystemEntities.*;

import java.util.*;

import BankingServices.*;

public class BankingSystemApp {
	public static void main(String[] args) {

        final String BANK_NAME = "ABC Bank";
        System.out.println("Welcome to " + BANK_NAME + " Banking System");

        bankingservices service = new BankingServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. List Accounts of Customer");
            System.out.println("7. List Transactions of Account");
            System.out.println("8. List Beneficiaries of Customer");
            System.out.println("9. Transfer Money");
            System.out.println("10. Check Balance");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Address: ");
                    String addr = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    service.addCustomer(new Customer(cid, cname, addr, contact));
                    System.out.println("Customer added successfully.");
                    break;

                case 2:
                    System.out.print("Account ID: ");
                    int accId = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int custId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Account Type: ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double bal = sc.nextDouble();
                    service.addAccount(new Account(accId, custId, type, bal));
                    System.out.println("Account added successfully.");
                    break;

                case 3:
                    System.out.print("Beneficiary ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int bcid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Beneficiary Name: ");
                    String bname = sc.nextLine();
                    System.out.print("Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Bank Details: ");
                    String bank = sc.nextLine();
                    service.addBeneficiary(new Beneficiary(bid, bcid, bname, accNo, bank));
                    System.out.println("Beneficiary added successfully.");
                    break;

                case 4:
                    System.out.print("Account ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Transaction Type: ");
                    String ttype = sc.nextLine();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    service.addTransaction(new Transaction(tid, ttype, amt));
                    break;

                case 5:
                    System.out.print("Customer ID: ");
                    int searchId = sc.nextInt();
                    Customer c = service.findCustomerById(searchId);
                    System.out.println(c != null ? c : "Customer not found.");
                    break;

                case 6:
                    System.out.print("Customer ID: ");
                    int cId = sc.nextInt();
                    List<Account> accounts = service.getAccountsByCustomerId(cId);
                    accounts.forEach(System.out::println);
                    break;

                case 7:
                    System.out.print("Account ID: ");
                    int aId = sc.nextInt();
                    List<Transaction> trans = service.getTransactionsByAccountId(aId);
                    trans.forEach(System.out::println);
                    break;

                case 8:
                    System.out.print("Customer ID: ");
                    int bcId2 = sc.nextInt();
                    List<Beneficiary> bens = service.getBeneficiariesByCustomerId(bcId2);
                    bens.forEach(System.out::println);
                    break;

                case 9:
                    System.out.print("From Account ID: ");
                    int fromId = sc.nextInt();
                    System.out.print("To Account ID: ");
                    int toId = sc.nextInt();
                    System.out.print("Amount: ");
                    double transferAmt = sc.nextDouble();
                    service.transferMoney(fromId, toId, transferAmt);
                    break;

                case 10:
                    System.out.print("Account ID: ");
                    int checkId = sc.nextInt();
                    double balance = service.checkBalance(checkId);
                    System.out.println(balance >= 0 ? "Balance: " + balance : "Account not found!");
                    break;

                case 11:
                    System.out.println("Thank you for using " + BANK_NAME);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 11);

        sc.close();
    }
}

