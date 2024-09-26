import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Laptop laptopDevice = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptopDevice);

        Refrigerator fridgeDevice = new Refrigerator();
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(fridgeDevice);

        SmartphoneCharger phoneCharger = new SmartphoneCharger();
        PowerOutlet phoneOutlet = new SmartphoneAdapter(phoneCharger);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            displayMenu(); 
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(laptopOutlet.plugIn());
                    break;

                case 2:
                    System.out.println(fridgeOutlet.plugIn());
                    break;

                case 3:
                    System.out.println(phoneOutlet.plugIn());
                    break;

                case 4:
                    exitApp(scanner);  
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid choice.");
            }
            System.out.println();
        }
    }

    private static void displayMenu() {

        System.out.println("\nPower Outlet App\n");
        System.out.println("1. Laptop");
        System.out.println("2. Refrigerator");
        System.out.println("3. Smartphone");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }

    private static void exitApp(Scanner scanner) {
        
        System.out.println("App is shutting down...");
        scanner.close();
        System.exit(0);
    }
}
