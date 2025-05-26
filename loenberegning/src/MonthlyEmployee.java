public class MonthlyEmployee extends Employee{
    String name;
    double salary;
    public MonthlyEmployee(double loen,String name){
        salary = loen;
        this.name = name;
    }


    public void calculateSalary(){
        System.out.println(name + " tjener så meget om måneden: "+salary);
    }
}
