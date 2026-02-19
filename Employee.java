public class Employee{
//  Initialize properties.
    private String name;
    private String email;
    private int age;
    private double salary;

//  Appropriate getters and setters.
    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age<0){
            this.age=0;
        }
        else{
            this.age = age;

        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary>0.00){
            this.salary = salary;
        }
        else{
            this.salary = 0.00;
        }

    }

    public Employee(String name, String email, int age, double salary){
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }
    public Employee(){
        setName("Null");
        setEmail("Null");
        setAge(0);
        setSalary(0.00);
    }
}