package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Departament;
import entities.Employee; 

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        Address address = new Address(email, phone);
        Departament dept = new Departament(name, payDay, address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Dados do funcionário " + (i+1) + ": ");
            System.out.print("Nome: ");
            sc.nextLine();
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            double employeeSalary = sc.nextDouble(); 

            Employee employee = new Employee(employeeName, employeeSalary);

            dept.addEmployee(employee);
        }

        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO: ");
        showReport(dept);

        sc.close();
    }

    private static void showReport(Departament dept) {
        System.out.println(dept);
    }
}
