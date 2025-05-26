import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Employee monthEmp1 = new MonthlyEmployee(30000,"Jan");
        Employee monthEmp2 = new MonthlyEmployee(20000,"Kasper");

        Employee hourEmp1 = new HourlyEmployee(210,"Morten",240);
        Employee hourEmp2 = new HourlyEmployee(540,"Freja",200);

        Employee comEmp1 = new CommissionEmployee("Rikke",15000,0.2,50000);
        Employee comEmp2 = new CommissionEmployee("Dorte",17500.5,0.18,100000);

        employees.add(monthEmp1);
        employees.add(monthEmp2);
        employees.add(hourEmp1);
        employees.add(hourEmp2);
        employees.add(comEmp1);
        employees.add(comEmp2);

        for(Employee i: employees){
            i.calculateSalary();
        }

        }

}