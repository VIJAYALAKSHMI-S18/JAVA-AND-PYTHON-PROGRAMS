import java.util.Scanner;

// A Node is a single element (box) in the linked list.
// It stores:
// 1. data -> the value
// 2. next -> address of the next node
class Node {

    int data;      // Stores the value
    Node next;     // Points to the next node

    // Constructor
    // Runs automatically whenever we create a new node.
    // Example: new Node(10)
    Node(int data) {

        // Store the given value inside this node.
        this.data = data;

        // Since this is a new node, it is not connected to any node yet.
        // So next is null.
        this.next = null;
    }
}

public class SINGLY_LINKED_LIST {

    // Head always points to the FIRST node of the linked list.
    // If head is null, it means the list is empty.
    Node head;

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {

        // Create a new node with the given value.
        Node newNode = new Node(data);

        // Connect the new node to the current first node.
        // Example:
        // Before:
        // head -> 10 -> 20 -> null
        //
        // After this line:
        // 30 -> 10 -> 20 -> null
        // head still points to 10.
        newNode.next = head;

        // Now move head to the new node.
        // Final:
        // head -> 30 -> 10 -> 20 -> null
        head = newNode;
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {

        // Create a new node.
        Node newNode = new Node(data);

        // If there are no nodes,
        // make this node the first node.
        if (head == null) {
            head = newNode;
            return;
        }

        // temp is used only for travelling.
        // We don't move head because head should always
        // remain pointing to the first node.
        Node temp = head;

        // Keep moving until we reach the last node.
        // Last node is identified because next == null.
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect the last node to the new node.
        temp.next = newNode;
    }

    // Delete a node
    public void deleteNode(int key) {

        // If list is empty, nothing can be deleted.
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If the first node itself contains the value,
        // simply move head to the second node.
        if (head.data == key) {
            head = head.next;
            System.out.println(key + " deleted");
            return;
        }

        // temp = current node
        Node temp = head;

        // prev = previous node
        Node prev = null;

        // Search for the node containing the key.
        while (temp != null && temp.data != key) {

            // Store current node as previous node.
            prev = temp;

            // Move to next node.
            temp = temp.next;
        }

        // If temp becomes null,
        // the value is not found.
        if (temp == null) {
            System.out.println("Element not found");
            return;
        }

        // Skip the node to delete it.
        //
        // Before:
        // 10 -> 20 -> 30 -> 40
        //
        // After deleting 30:
        // 10 -> 20 -------> 40
        prev.next = temp.next;

        System.out.println(key + " deleted");
    }

    // Display all nodes
    public void display() {

        // If no nodes exist.
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Start from first node.
        Node temp = head;

        // Print every node until temp becomes null.
        while (temp != null) {
            System.out.print(temp.data + " -> ");

            // Move to next node.
            temp = temp.next;
        }

        // Indicates end of list.
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Used to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Create a linked list object.
        SINGLY_LINKED_LIST list = new SINGLY_LINKED_LIST();

        int choice, value;

        // Keep showing the menu until user chooses Exit.
        do {

            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();

                    // Insert at beginning.
                    list.insertAtBeginning(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();

                    // Insert at end.
                    list.insertAtEnd(value);
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();

                    // Delete the given value.
                    list.deleteNode(value);
                    break;

                case 4:

                    // Display the entire linked list.
                    list.display();
                    break;

                case 5:

                    // Exit program.
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        // Close Scanner object.
        sc.close();
    }
}