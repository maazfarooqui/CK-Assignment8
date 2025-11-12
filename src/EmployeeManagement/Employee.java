package EmployeeManagement;

public class Employee {

    private long daysWorked;
    private float base;

    long setDays(long daysWorked)
    {
        this.daysWorked = daysWorked;
        return this.daysWorked;
    }

    float setBase(float base)
    {
        this.base = base;
        return this.base;
    }

    long getDaysworked()
    {
        return daysWorked;
    }

    float getBase()
    {
        return base;
    }

     float CalculateSalary(){
         return 1.0f;
     }

}

//child classes

class fullTimeEmployee extends Employee {

    float fullTimeBonusfactor =1.2f;
    float perDay;
    float salary;
    int surplusDays;
    fullTimeEmployee(float base, long daysWorked)
    {
        setBase(base);
        setDays(daysWorked);
         surplusDays = (int)daysWorked-22;

    }




    @Override
    float CalculateSalary() {

        perDay = getBase()/22;
        if(surplusDays>=0)
        {
        salary = (22 * perDay) + (surplusDays*perDay*fullTimeBonusfactor);

        }
        else {
            salary = (getDaysworked() * perDay) + (surplusDays*perDay);

        }

        System.out.println(salary);
      return salary;
    }
}

class partTimeEmployee extends Employee{

    partTimeEmployee(long daysWorked, float base)
    {
        setDays(daysWorked);
        setBase(base);
        surplusDays = (int)daysWorked-22;
    }


    int surplusDays = (int) getDaysworked()-22;
    float partTimeBonusfactor =1.0f;
    float perDay;
    float salary;


    @Override
    float CalculateSalary() {

        perDay = getBase()/22;
        if(surplusDays>=0)
        {
            salary = (22 * perDay) + (surplusDays*perDay*partTimeBonusfactor);

        }
        else {
            salary = (getDaysworked() * perDay) + (surplusDays*perDay);

        }
        System.out.println(salary);
        return salary;
    }


}
