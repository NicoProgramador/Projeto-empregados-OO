package entities;

import java.util.List;
import java.util.ArrayList;

public class Departament {
    
    private String name;
    private int payDay;

    private Address address;
    private List<Employee> employees = new ArrayList<>();

    public Departament() {
    }

    public Departament(String name, int payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployes() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double sum = 0.0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento ");
        sb.append(name + " = R$ ");
        sb.append(String.format("%.2f \n", payroll()));
        sb.append("Pagamento realizado no dia ");
        sb.append(payDay + "\n");
        sb.append("Funcionários: \n");
        for (Employee e : employees) {
            sb.append(e + "\n");
        }
        sb.append("Para dúvidas entrar em contato: ");
        sb.append(address);
        
        return sb.toString();
    }
}
