public class Intern extends Employee{
    public Intern(String name, String email, int age, double salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary>20000.00){
            System.err.println("Salary for Intern " + this.getName() + " can not be more $20,000. Salary was set $20,000!");
            super.setSalary(20000.00);
        }
        else if (salary<0.00) {
            super.setSalary(0.00);
        } else{
            super.setSalary(salary);
        }
    }
}