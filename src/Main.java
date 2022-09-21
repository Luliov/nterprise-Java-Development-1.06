import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        Interns intern1 = new Interns("Alejandro", 34, 30000);
        Interns intern2 = new Interns("Anne", 25, 18000);
        Interns intern3 = new Interns("James", 36, 15000);
        Interns intern4 = new Interns("Michael", 30, 28000);
        Interns intern5 = new Interns("Robert", 25, 10000);
        Interns intern6 = new Interns("Lucy", 39, 45000);
        Interns intern7 = new Interns("Jess", 20, 22000);
        Interns intern8 = new Interns("Johan", 23, 13000);
        Interns intern9 = new Interns("Mery", 20, 12000);
        Interns intern10 = new Interns("Janny", 19, 8000);

        FileWriter writer = new FileWriter("employees.txt", false);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(intern1);
        employeeList.add(intern2);
        employeeList.add(intern3);
        employeeList.add(intern4);
        employeeList.add(intern5);
        employeeList.add(intern6);
        employeeList.add(intern7);
        employeeList.add(intern8);
        employeeList.add(intern9);
        employeeList.add(intern10);

        for (Employee e: employeeList){
            writer.write(e.toString() + "\n");
        }
        writer.close();

    }



}