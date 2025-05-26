public class HourlyEmployee extends Employee{
    String name;
    int numberOfHours;
    double payPrHour;
    public HourlyEmployee(double payPrHourTmp,String name,int numberOfHoursTmp){
        payPrHour = payPrHourTmp;
        this.name = name;
        numberOfHours = numberOfHoursTmp;
    }

    public void calculateSalary(){

        System.out.println(name+" tjener så meget om måneden: "+numberOfHours * payPrHour);
    }
}
