import java.util.ArrayList;

abstract class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return name;
}

    public int getId(){
        return id;
}

    public abstract double calculatesalary();

    @Override
    public String toString(){
        return "Employee[name = "+name+" , id = "+id+" , salary = "+calculatesalary()+"]";
    }
}

class FullTimeEmployee extends Employee{
    private double monthlysalary;

    public FullTimeEmployee(String name, int id, double monthlysalary){
        super(name, id);
        this.monthlysalary=monthlysalary;
}

@Override
public double calculatesalary(){
    return monthlysalary;
}

}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
}
@Override
public double calculatesalary(){
    return hoursWorked*hourlyRate;
}

}

class PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList= new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
}

    public void removeEmployee(int id){
        Employee employeeToRemove = null;

        for(Employee employee: employeeList){
            if (employee.getId()==id) {
                employeeToRemove=employee;
                break;
            }
        }

        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployeeList(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PayrollSystem obj=new PayrollSystem();
        FullTimeEmployee emp1= new FullTimeEmployee("Ajit", 1, 70000);
        PartTimeEmployee emp2= new PartTimeEmployee("Ankit", 2, 40, 100);

        obj.addEmployee(emp1);
        obj.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        obj.displayEmployeeList();
        System.out.println("Removing Employees");
        obj.removeEmployee(2);
        System.out.println("Remaning Employee Details: ");
        obj.displayEmployeeList();
    }
    
}
