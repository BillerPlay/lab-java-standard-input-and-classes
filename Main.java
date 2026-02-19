import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Intern intern1 = new Intern("Abdul", "ab@gmail.com", 20, 200000);
        Employee employee1 = new Employee("Employee1", "em1@gmail.com", 23, 278190);
        Intern intern2 = new Intern("Abdul2", "ab2@gmail.com", 21, 1120);
        Intern intern3 = new Intern("Abdul3", "ab3@gmail.com", 22, 25000);
        Intern intern4 = new Intern("Abdul4", "ab4@gmail.com", 19, 120);
        Intern intern5 = new Intern("Abdul5", "ab5@gmail.com", 16, 350);
        Employee employee2 = new Employee("Employee2", "em2@gmail.com", 29, 278190);
        Employee employee3 = new Employee("Employee3", "em3@gmail.com", 53, 324234);
        Employee employee4 = new Employee("Employee4", "em4@gmail.com", 24, 83782);
        Employee employee5 = new Employee("Employee5", "em5@gmail.com", 34, 178954);

        Employee[] employees = {intern1, intern2, intern3, intern4, intern5, employee1, employee2, employee3, employee4, employee5};
        System.out.println("Starting creating file employees.txt");
        try(FileWriter writer = new FileWriter("employees.txt")){
            for (int i = 0; i<employees.length; i++){
                writer.write((i+1) +". " + employees[i].getName() + " | "  + employees[i].getEmail() + " | " + employees[i].getAge() + " | " + employees[i].getSalary()+ "\n");
                System.out.println("Creating file is over!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
