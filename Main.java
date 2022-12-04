import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void DisplayMenu4(){
        System.out.println("____Sort people____");
        System.out.println("4.1. Ascending by id");
        System.out.println("4.2. Descending by id");
        System.out.println("4.3. Ascending by name ");
        System.out.println("4.4. Descending by name");
        System.out.println("4.5. Ascending by age");
        System.out.println("4.6. Descending by age");
        System.out.println("4.7. Ascending by address");
        System.out.println("4.8. Descending by address");
        System.out.println("4.9. Sort teacher and student");
        System.out.println("------------");
    }

    public static void DisplayMenu5(){
        System.out.println("____ Find and print Person based on:____");
        System.out.println("5.1. Find by ID");
        System.out.println("5.2. Find by name");
        System.out.println("5.3. Find by age");
        System.out.println("5.4. Year of Birth");
        System.out.println("5.5. Find by address");
        System.out.println("-------------");
    }

    public static void DisplayMenu6(){
        System.out.println("----Print all information based on----");
        System.out.println("6.1. Print teacher");
        System.out.println("6.2. Print student");
        System.out.println("-------------");
    }

    public static void DisplayMenu(){
        System.out.println("____Please choose function____");
        System.out.println("1 .See all information");
        System.out.println("2. Add in one Student");
        System.out.println("3. Add in one Teacher");
        System.out.println("4. Sort people");
        System.out.println("5. Find and print Person based on");
        System.out.println("6. Print all information based on");
        System.out.println("7. Delete information by ID");
        System.out.println("8. Repair information by ID");
        System.out.println("9. Delete all Data");
        System.out.println("10. Quit");
    }
    public static void main(String[] args) {
        Handle handle = new Handle();
        Scanner scanner = new Scanner(System.in);
        boolean programme = true;
        while (programme){
            Main.DisplayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            try{
                switch (choice){
                    case 1:
                        handle.SeeALlInformation();
                        break;
                    case 2:
                        handle.addStudent();
                        break;
                    case 3:
                        handle.addTeacher();
                    case 4:
                        break;
                    case 5:
                        Main.DisplayMenu5();
                        int small5 = Integer.parseInt(scanner.nextLine());
                        switch (small5){
                            case 1:
                                handle.findID();
                                break;
                            case 2:

                                break;
                            case 3:
                                handle.findAge();
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                        break;
                    case 6:
                        Main.DisplayMenu6();
                        int small6 = Integer.parseInt(scanner.nextLine());
                        switch (small6){
                            case 1:
                                handle.addTeacher();
                                break;
                            case 2:
                                handle.addStudent();
                                break;
                            default:
                                System.err.println("Not exactly");
                        }
                        break;
                    case 7:
                        handle.destroyById();
                        break;
                    case 8:
                        System.out.println("1. Edit Student");
                        System.out.println("2. Edit Teacher");
                        int small8 = Integer.parseInt(scanner.nextLine());
                        switch (small8){
                            case 1:
                                handle.updateStudent();
                                break;
                            case 2:
                                handle.updateTeacher();
                                break;
                            default:
                                System.err.println("Not exactly");
                        }
                        break;
                    case 9:
                        handle.DeleteAllData();
                        break;
                    case 10:
                        System.out.println("Quit");
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Error!! Please restart Menu");
            }
        }
    }
}