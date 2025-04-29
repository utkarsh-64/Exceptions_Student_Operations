//Main.java
//Name: Utkarsh Lakhani
//PRN: 23070126064
//Batch: AIML A3

import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== Student Data Entry Menu ======");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            try {
                switch (choice) {
                    case 1:
                        Operations.addStudent(students);
                        break;
                    case 2:
                        Operations.displayStudents(students);
                        break;
                    case 3:
                        Operations.searchMenu(students);
                        break;
                    case 4:
                        Operations.updateStudent(students);
                        break;
                    case 5:
                        Operations.deleteStudent(students);
                        break;
                    case 6:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        throw new InvalidChoiceException("Invalid menu choice!");
                }
            } catch (CustomException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 6);
    }
}
