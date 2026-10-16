// Java program to implement a Singly Linked List from Scratch
class LinkL { // Outer Class

    Node head;
    private int size;

    LinkL() {
        size = 0;
    }

    public class Node { // Inner Class
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Insertion Function : Insert a node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion Function : Insert a node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    // Deletion Function : Delete a node at the beginning of the list
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = this.head.next;
        size--;
    }

    // Deletion Function : Delete a node from the end of the list
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    // Utility method to print
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");

    }

    // Get Size Function
    public int getSize() {
        return size;
    }

    // Main Driver Function
    public static void main(String args[]) {
        LinkL list = new LinkL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();

        list.printList();

        list.removeLast();
        list.printList();
        System.out.println(list.getSize());
    }
}