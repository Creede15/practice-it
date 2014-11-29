/* 
* Add the following method to the BankAccount class:
*
* public String toString()
*
* Your method should return a string that contains the account's name and
* balance separated by a comma and space. For example, if an account object
* named benben has the name "Benson" and a balance of 17.25, the call of
* benben.toString() should return:
*
* Benson, $17.25
*/

public String toString() {
    if (balance > 0) {
        return String.format("%s, $%.2f", name, balance);
    } else  if (balance < 0) {
        return String.format("%s, -$%.2f", name, -balance);
    } else {
        return name + ", $0.00";
    }
}
