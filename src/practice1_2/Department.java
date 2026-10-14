package practice1_2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String title;
    private Employee chief;
    private List<Employee> employees;
    private Department department;
    public Department(String title){
        this.title = title;
        this.employees = new ArrayList<>();
        if (chief != null) {
            this.employees.add(chief);
        }
    }
    public Department(String title, Employee chief){
        this(title);
        this.chief = chief;
    }

    public Department(String title, Employee chief, List<Employee> employees) {
        this.title = title;
        this.chief = chief;
        this.employees = new ArrayList<>(employees);
    }

    public String getTitle() {
        return title;
    }

    public Employee getChief() {
        return chief;
    }

    public void addEmployees(Employee employee) {
        if (employee == null || employees.contains(employee)) {
            return;
        }
        if (employee.getDepartment() != null) {
            employee.getDepartment().removeEmployees(employee);
        }
        this.employees.add(employee);
        employee.setDepartment(this);

    }

    public  void removeEmployees(Employee employee){
        if (employee != null && this.employees.contains(employee)){
            this.employees.remove(employee);
            this.employees.remove(employee);
            employee.setDepartment(null);
        }
        if (this.chief == employee){
            this.chief = null;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
//11216480525000