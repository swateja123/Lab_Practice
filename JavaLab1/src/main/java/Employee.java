

public class Employee
{
    private String Name;
    private int HoursPerDay;
    private int SalaryPerHour;

    public Employee(String name)
    {
        this.Name = name;
    }
    public void getInfo(int HoursPerDay,int SalaryPerHour)
    {
        //get the value of parameters
        this.HoursPerDay=HoursPerDay;
        this.SalaryPerHour=SalaryPerHour;
    }

    public int computeBaseSalary()
    {
        //compute the base salary
        int BaseSalary = this.HoursPerDay * this.SalaryPerHour * 20;
        return BaseSalary;
    }
    public int addSal()
    {
        //additional salary if base salary is less than 500$
        int AddSal;
        if(computeBaseSalary()<500)
        {
            AddSal=10;
            return AddSal;
        }
        else

            return 0;
    }
    public int addWork()
    {
        //work pay
        int AddWorkSalary=0;
        if(this.HoursPerDay>6)
        {
            AddWorkSalary=(5*20);
            return  AddWorkSalary;

        }

        else
            return 0;

    }
    public void FinalSalary()
    {
        //Final salary based on base salary,additional work and pay
        int Final_salary = computeBaseSalary() + addSal() + addWork();
        System.out.println("The final salary of " + this.Name + " is " + Final_salary + "$");
    }

    public static void main(String[] args) {
        int Final_salary;
        Employee e = new Employee("John Smith");
        e.getInfo(5, 10);
        e.FinalSalary();
        Employee e1 = new Employee("Sandra Wang");
        e1.getInfo(4, 5);
        e1.FinalSalary();
        Employee e2 = new Employee("Gio Rossai");
        e2.getInfo(7, 12);
        e2.FinalSalary();


    }
}

