package javaproject;
import java.util.ArrayList;
import java.util.Scanner;

public class listoftodo {

    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- ToDo List Menu ----");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String taskToAdd = scanner.nextLine();
                    todoList.add(taskToAdd);
                    System.out.println("Task added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < todoList.size()) {
                        String removedTask = todoList.remove(indexToRemove);
                        System.out.println("Removed: " + removedTask);
                    } else {
                        System.out.println("Invalid index. No task removed.");
                    }
                    break;
                case 3:
                    System.out.println("\n---- To-Do List ----");
                    if (todoList.isEmpty()) {
                        System.out.println("Empty");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
