/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac EmployeeTester.java
    Executions: java EmployeeTester
    Dependencies: Employee.java

    Notes: A class to store the names and birth years of employees.

    > java EmployeeTester
    ------ sorted list of Employees ---------
    Adams,Elmer,1976
    Adams,Fred,1963
    Adams,John,1959
    Cohen,Howard,1933
    Cohen,Howard,1958
    Devon,Nancy,1963
    Lewis,Andrew,1983
    Page,Douglas,1981
    Rice,Donald,1935
    Wolder,Donald,1963
    Wolder,Henry,1972
    Wolder,Robert,1959
    ------- testing binary search -------
    Devon,Nancy,1963 at 5
    Devon,Nancy,1963 removed: true
    Devon,Nancy,1963 at -6
****************************************************************************************************/
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class EmployeeTester {
    public static void main ( String[] args ) {
	    List<Employee> workers = new ArrayList<Employee>();

	    workers.add(new Employee("Fred", "Adams",  1963));
	    workers.add(new Employee("John", "Adams",  1959));
	    workers.add(new Employee("Elmer", "Adams",  1976));
	    workers.add(new Employee("Nancy", "Devon",  1963));
     	workers.add(new Employee("Andrew", "Lewis",  1983));
	    workers.add(new Employee("Douglas", "Page",  1981));
	    workers.add(new Employee("Donald", "Wolder",  1963));
	    workers.add(new Employee("Henry", "Wolder",  1972));
	    workers.add(new Employee("Robert", "Wolder",  1959));
	    workers.add(new Employee("Howard", "Cohen",  1933));
	    workers.add(new Employee("Howard", "Cohen",  1958));
	    workers.add(new Employee("Donald", "Rice",  1935));

	    Collections.sort(workers);
	    System.out.println("------ sorted list of Employees ---------");
	    for (Employee worker : workers)
	        System.out.println(worker);

	    System.out.println("------- testing binary search -------");
	    Employee e = new Employee("Nancy", "Devon", 1963);
	    System.out.println(e + " at " + Collections.binarySearch(workers,e));
	    System.out.println(e + " removed: " + workers.remove(e));
        System.out.println(e + " at " + Collections.binarySearch(workers,e));
    }
}
