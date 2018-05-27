import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Bank myBank = new Bank();

		BankAccount account1 = new BankAccount("1111", "Checking", 500);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500);

		myBank.add(account1);
		myBank.add(account2);

		String choice;
		do {

			System.out.println("These are your accounts with us: ");
			myBank.showAccounts();

			System.out.println("What would you like to do?");
			System.out.println("Choose an option: ");
			System.out.println("Press 1 to deposit funds");
			System.out.println("Press 2 to withdraw funds");
			System.out.println("Press 3 to check your balance");
			System.out.println("Press 4 to close an account");
			System.out.println("Press 5 to exit");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("You want to deposit");
				System.out.println("Here are your accounts");
				myBank.showAccounts();

				System.out.println("Select the account by (account number) to perform this transaction");
				String accountNum = input.nextLine();
				System.out.println("You have selected " + accountNum);
				System.out.println("Enter the amount to deposit: ");
				int amount = input.nextInt();
				input.nextLine();
				myBank.deposit(accountNum, amount);
				System.out.println("Your current balance is " + myBank.findAccount(accountNum).getBalance());

			} else if (choice.equals("2")) {
				System.out.println("You want to withdraw");
				System.out.println("Here are your accounts");
				myBank.showAccounts();
				System.out.println("Select the account by (account number) to perform this transaction");
				String accountNum = input.nextLine();
				System.out.println("You have selected " + accountNum);
				System.out.println("Enter the amount to withdraw: ");
				int amount = input.nextInt();
				input.nextLine();
				myBank.withdraw(accountNum, amount);
				System.out.println("Your current balance is " + myBank.findAccount(accountNum).getBalance());

			} else if (choice.equals("3")) {
				System.out.println("You are checking your balances");
				System.out.println("Here are your accounts");
				myBank.showAccounts();
			} else if (choice.equals("4")) {
				System.out.println("You are choosing to close an account.");
				System.out.println("Here are your accounts");
				myBank.showAccounts();
				System.out.println("Select the account by (account number) to perform this transaction");
				String accountNum = input.nextLine();
				System.out.println("You have selected " + accountNum);
				myBank.close(myBank.findAccount(accountNum));
			}

		} while (!choice.equals("5"));
		System.out.println("Thanks for banking with us today...goodbye!");
		input.close(); 
	}
}