public class Interns extends Employee{

    private final int maxSalary = 20000;

    public Interns(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        if (salary > maxSalary){
            super.setSalary(maxSalary);
        } else{
            super.setSalary(salary);
        }


    }



}
