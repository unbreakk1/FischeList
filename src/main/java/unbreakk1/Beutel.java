package unbreakk1;

public class Beutel
{
    // Inner class for the Node
    private class Node
    {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;  // Points to the beginning of the list
    private Node tail;  // Points to the end of the list
    private int size;   // Tracks number of elements

    // Constructor to initialize an empty Beutel
    public Beutel()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

}
