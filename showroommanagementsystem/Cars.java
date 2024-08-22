package showroommanagementsystem;

import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transMission;total_cars_in_stock=0;

    @Override
    public void get_details() {
        System.out.println("Car Name: " + car_name);
        System.out.println("Car Color: " + car_color);
        System.out.println("Car Fuel Type: " + car_fuel_type);
        System.out.println("Car Price: " + car_price);
        System.out.println("Car Type: " + car_type);
        System.out.println("Car Transmission: " + car_transMission);
        System.out.println("Total Cars In Stock: " + total_cars_in_stock);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** ====================");
        System.out.println();
        System.out.println("Car Name: ");
        car_name = sc.nextLine();
        System.out.println("car Color: ");
        car_color = sc.nextLine();
        System.out.println("Car Fuel Type: ");
        car_fuel_type = sc.nextLine();
        System.out.println("Car Price: ");
        car_price = sc.nextInt();
        System.out.println("Car Type: ");
        car_type = sc.nextLine();
        System.out.println("Car Transmission: ");
        car_transMission=sc.nextLine();
        total_cars_in_stock++;


    
}
