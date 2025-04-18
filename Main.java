import java.util.Scanner;

interface utility {
    void get_details();
    void set_details();
}

public class Main {

    static void main_menu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t 2].ADD EMPLOYEES \t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t 5].GET EMPLOYEES \t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showrooms = new Showroom[5];
        Employees[] employees = new Employees[5];
        Cars[] cars = new Cars[5];

        int showroom_counter = 0, employees_counter = 0, car_counter = 0;
        int choice;

        while (true) {
            main_menu();
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    showrooms[showroom_counter] = new Showroom();
                    showrooms[showroom_counter++].set_details();
                    break;
                case 2:
                    employees[employees_counter] = new Employees();
                    employees[employees_counter++].set_details();
                    break;
                case 3:
                    cars[car_counter] = new Cars();
                    cars[car_counter++].set_details();
                    break;
                case 4:
                    for (int i = 0; i < showroom_counter; i++) {
                        showrooms[i].get_details();
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < employees_counter; i++) {
                        employees[i].get_details();
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < car_counter; i++) {
                        cars[i].get_details();
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("ENTER VALID CHOICE: ");
            }
        }
    }
}
