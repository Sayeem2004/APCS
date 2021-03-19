public class StanfordLawyer extends Lawyer {
    public StanfordLawyer() {
        super();
    }

    public int getHours() {
        return super.getHours();
    }

    public double getSalary() {
        return super.getSalary()*1.2;
    }

    public int getVacationDays() {
        return super.getVacationDays()+3;
    }

    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}
