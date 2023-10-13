
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class LinkedList {

    Node head;

    static class Node {
        int data;
        Node node;

        Node(int d) {
            data = d;
            node = null;
        }
    }

    //this function will insert new node at beggining of linked list
    static LinkedList insertAtBegin(LinkedList list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            newNode.node = list.head;
            list.head = newNode;
        }
        System.out.println("Data Added");

        return list;
    }

    //this function will insert new node at the end of linked list
    // static LinkedList insertAtEnd(LinkedList list,int data){

    // }

    // this function will print all elements of LinkedList
    static void printAllNodes(LinkedList list) {
        if (list.head == null) {
            System.out.println("List is Empty");
        } else {
            Node tempNode = list.head;
            while (tempNode != null) {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.node;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        boolean exit = true;

        Scanner scanner = new Scanner(System.in);

        while (exit) {
            System.out.println("Enter you choice : ");
            System.out.println("1. Insert Element At Begin");
            System.out.println("2. Insert Element At End");
            System.out.println("3. Delete Element");
            System.out.println("4. Print List");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data :");
                    int data = scanner.nextInt();
                    list = insertAtBegin(list, data);
                    break;
                case 4:
                    printAllNodes(list);
                    break;
                default:
                    exit = false;
            }

        }

    }
}