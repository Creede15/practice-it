/*
* Suppose that you are provided with a pre-written class BankAccount as shown below. (The 
* headings are shown, but not the method bodies, to save space.) Assume that the fields, constructor, 
* and methods shown are already implemented. You may refer to them or use them in solving 
* this problem if necessary. 
* 
* Write an instance method named transfer that will be placed inside the BankAccount class 
* to become a part of each BankAccount object's behavior. The transfer method moves money 
* from this bank account to another account. The method accepts two parameters: a second 
* BankAccount to accept the money, and a real number for the amount of money to transfer. 
* 
* There is a $5.00 fee for transferring money, so this much must be deducted from the 
* current account's balance before any transfer. 
* 
* The method should modify the two BankAccount objects such that "this" current object has 
* its balance decreased by the given amount plus the $5 fee, and the other BankAccount object's 
* balance is increased by the given amount. A transfer also counts as a transaction on 
* both accounts. 
* 
* If this account object does not have enough money to make the full transfer, transfer whatever 
* money is left after the $5 fee is deducted. If this account has under $5 or the amount 
* is 0 or less, no transfer should occur and neither account's state should be modified. 
*/

public void transfer(BankAccount account, double transfer) {
    if (transfer >= 5) {
        this.balance -= 5;
        if (this.balance >= transfer) {
            account.balance += transfer;
            this.balance -= transfer;
        } else if (this.balance - 5 < transfer) {
            account.balance += this.balance;
            this.balance = 0;
        } 
        this.transactions++;
        account.transactions++;
    }
}
