public class CommissionEmployee extends Employee{
    String name;
    double baseSalary;
    double salesAmount;
    double commissionPercentage;

    public CommissionEmployee(String name,double baseSalaryTmp,double commissionPercentageTmp,double salesAmountTmp){
        this.name = name;
        baseSalary = baseSalaryTmp;
        commissionPercentage = commissionPercentageTmp;
        salesAmount = salesAmountTmp;
    }


    public void calculateSalary() {

        System.out.println(name+" tjener så meget om måneden: "+(baseSalary + (salesAmount * commissionPercentage)));
    }
}
