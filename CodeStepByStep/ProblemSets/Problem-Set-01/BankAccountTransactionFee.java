public boolean transactionFee(double amount) {
    double a = amount*(this.transactions)*(this.transactions+1)/2;
    if (a <= this.balance) {
        this.balance -= a;
        return true;
    }
    this.balance = 0;
    return false;
}
