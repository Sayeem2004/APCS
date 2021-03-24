public String toString() {
    String ret = "";
    ret += this.name;
    ret += ", ";
    int a = Integer.toString((int)this.balance).length();
    int b = Double.toString(this.balance).length();
    if (this.balance < 0) ret += "-";
    ret += "$";
    ret += Double.toString(Math.abs(this.balance));
    if (b-a == 2) ret += "0";
    return ret;
}
