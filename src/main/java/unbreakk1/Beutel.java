package unbreakk1;

public class Beutel
{
    // Inner class for the Node
    private class Node
    {
        Object value;
        Node next;

        Node(Object value)
        {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;  // Points to the beginning
    private Node tail;  // Points to the end
    private int size;   // Tracks number of elements

    public Beutel()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object value)
    {
        Node newNode = new Node(value);
        if (head == null)
        {
            // If the list is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else
        {
            // Otherwise, add the new node to the end of the list and update the tail
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}