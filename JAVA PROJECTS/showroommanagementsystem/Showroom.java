package showroommanagementsystem;

import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    String manager_name;
    int total_employees;
    int total_cars_in_stock = 0;

    @Override
    public void get_details() {
        System.out.println("Showroom Name:" + showroom_name);
        System.out.println("Showroom Address:" + showroom_address);
        System.out.println("Showroom Manager Name:" + manager_name);
        System.out.println("Total Employee:" + total_employees);
        System.out.println("Total Cars in Showroom:" + total_cars_in_stock);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** ====================");
        System.out.println();
        System.out.println("Showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.println("Showroom Address: ");
        showroom_address = sc.nextLine();
        System.out.println("Manager Name: ");
        manager_name = sc.nextLine();
        System.out.println("Total no of Employees: ");
        total_employees = sc.nextInt();
        System.out.println("Total Cars in Stock: ");
        total_cars_in_stock = sc.nextInt();

    }
}
