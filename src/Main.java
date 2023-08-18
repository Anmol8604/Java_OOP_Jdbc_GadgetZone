import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Welcome
        System.out.println("\nWelcome to Gadget Zone Employee Management Department\n");

        Task task = new Task();
        // Only for first time Execution
        /*
        task.Create_Table();
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 1, For New Employee");
        System.out.println("Type 2, For View Employees Data");
        System.out.println("Type 3, For Search Employees Data");
        System.out.println("Type 4, For Update Employees Data");
        System.out.println("Type 5, For Delete Employee");


        int operation = sc.nextInt();

        switch (operation) {
            case 1 -> {
                System.out.println("\n\nAdd Employee ID :");
                int empId = sc.nextInt();
                System.out.println("Add Employee Name :");
                String empName = sc.next();
                System.out.println("Add Employee Position :");
                String empPos = sc.next();
                System.out.println("Add Employee Salary :");
                int empSal = sc.nextInt();
                System.out.println("Add Employee Department :");
                String empDep = sc.next();
                Employee employee = new Employee(empId, empName, empPos, empSal, empDep);
                task.addEmp(employee);
                System.out.println("Do you want's Perform Any other Operation Y / N");
                char y_n = sc.next().charAt(0);
                if (y_n == 'Y' || y_n == 'y')
                    main(new String[5]);
                else
                    System.out.println("Thanks for visiting!!");
                break;
            }

            case 2 -> {
                System.out.println("\n\nHere are all the details of Employees💥💥\n");
                ArrayList<Employee> ArrayList = task.showEmp();
                for(Employee emp : ArrayList){
                    emp.toString();
                }
                System.out.println("\nDo you want's Perform Any other Operation Y / N");
                char y_n = sc.next().charAt(0);
                if (y_n == 'Y' || y_n == 'y')
                    main(new String[5]);
                else
                    System.out.println("Thanks for visiting!!");
                break;
            }

            case 3 -> {
                System.out.println("\n\nAdd Employee ID :");
                int id = sc.nextInt();
                System.out.println();
                task.searchEmp(id);
                System.out.println("Do you want's Perform Any other Operation Y / N");
                char y_n = sc.next().charAt(0);
                if (y_n == 'Y' || y_n == 'y')
                    main(new String[5]);
                else
                    System.out.println("Thanks for visiting!!");
                break;
            }

            case 4 -> {
                System.out.println("\n\nAdd Employee ID :");
                int id = sc.nextInt();
                System.out.println("Add Employee Name :");
                String empName = sc.next();
                System.out.println("Add Employee Position :");
                String empPos = sc.next();
                System.out.println("Add Employee Salary :");
                int empSal = sc.nextInt();
                System.out.println("Add Employee Department :");
                String empDep = sc.next();
                Employee employee = new Employee(id, empName, empPos, empSal, empDep);
                Query query = new Query();
                task.updateEmp(query.update(id, employee));
                System.out.println("Do you want's Perform Any other Operation Y / N");
                char y_n = sc.next().charAt(0);
                if (y_n == 'Y' || y_n == 'y')
                    main(new String[5]);
                else
                    System.out.println("Thanks for visiting!!");
                break;
            }

            case 5 -> {
                System.out.println("\n\nAdd Employee ID :");
                int del_id = sc.nextInt();
                task.deleteEmp(del_id);
                System.out.println("Do you want's Perform Any other Operation Y / N");
                char y_n = sc.next().charAt(0);
                if (y_n == 'Y' || y_n == 'y')
                    main(new String[5]);
                else
                    System.out.println("Thanks for visiting!!");
                break;
            }

            default -> {
                System.out.println("Invalid Operation, try again");
                System.out.println("Wants to try again? Y / N");
                char y_n = sc.next().charAt(0);
                if (y_n == 'Y' || y_n == 'y')
                    main(new String[5]);
                else
                    System.out.println("Thanks for visiting!!");
                break;
            }
        }
    }
}