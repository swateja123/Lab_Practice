import org.junit.Before;

import static org.junit.Assert.*;

public class EmployeeTest {
    Employee e;
@Before
public void setup()
{
     e=new Employee("Gio Rossai");
    e.getInfo(7,12);
    System.out.println("Running test cases");
}
    @org.junit.Test
    public void computeBaseSalary()
    {

       int actual_salary=e.computeBaseSalary();
       assertEquals(1680,actual_salary);

    }

    @org.junit.Test
    public void addSal()
    {
        e.computeBaseSalary();
      int actual_addSal=e.addSal();
      assertEquals(0,actual_addSal);
    }

    @org.junit.Test
    public void addWork()
    {
        e.computeBaseSalary();
        int actual_addWork=e.addWork();
        assertEquals(100,actual_addWork);
        System.out.println("Running all the cases successfully");
    }
}