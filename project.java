import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = new String[10];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // VERY IMPORTANT

            if (choice == 1) {
                if (count < 10) {
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    students[count] = name;
                    count++;

                    System.out.println("Student added!");
                } else {
                    System.out.println("List is full!");
                }

            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No students added yet.");
                } else {
                    System.out.println("Student List:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + students[i]);
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
