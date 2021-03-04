public class Custodian extends Employee {
    public Custodian() {
        super();
    }

    public int getHours() {
        return super.getHours()*2;
    }

    public double getSalary() {
        return super.getSalary()-10000;
    }

    public int getVacationDays() {
        return super.getVacationDays()/2;
    }

    public String getVacationForm() {
        return super.getVacationForm();
    }

    public String clean() {
        return "Workin' for the man.";
    }
}
