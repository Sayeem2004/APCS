public void transfer(BankAccount other, double amount) {
    if (this.balance < 5) return;
    double amt = Math.min(amount,this.balance-5);
    if (amt > 0) {
        other.deposit(amt);
        this.withdraw(amt+5);
    }
    return;
}
