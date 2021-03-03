/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac Employee.java
    Dependencies: none

    Notes: A class to store the names and birth years of employees.
****************************************************************************************************/

public final class Employee implements Comparable<Employee> {
    // Attributes
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    // Constructor
    public Employee(String f, String l, int year) {
        firstName = f;
	    lastName = l;
	    birthYear = year;
    }

    // Accessor Methods
    public String getFirstName()  {return firstName;}
    public String getLastName()   {return lastName;}
    public int getBirthYear()  {return birthYear;}

    // Override Methods
    @Override
    public String toString() {
	    return this.getLastName() + "," + this.getFirstName() + "," + this.getBirthYear();
    }
    @Override
    public int compareTo(Employee other) {
	    int a = this.getLastName().compareTo(other.getLastName());
	    int b = this.getFirstName().compareTo(other.getFirstName());
	    int c = this.getBirthYear() - other.getBirthYear();
        if (a != 0) return a;
        if (b != 0) return b;
        return c;
    }
    @Override
    public boolean equals(Object obj) {
	    if (obj instanceof Employee) {
            Employee v = (Employee) obj;
            return this.getFirstName().equals(v.getFirstName()) &&
            this.getLastName().equals(v.getLastName()) &&
            this.getBirthYear() == v.getBirthYear();
        }
        return false;
    }
}
