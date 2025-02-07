package unbreakk1;

public class Beutel
{
    // Inner class for the Node
    private static class Node
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

    public Object get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds!");
        }

        Node current = head;
        int currentIndex = 0;

        // loop the list until the desired index
        while (currentIndex < index)
        {
            current = current.next;
            currentIndex++;
        }

        return current.value; // Return value at index
    }

    public int size()
    {
        return size;
    }

    public Object removeLast()
    {
        if (size == 0) {
            throw new IllegalStateException("The Beutel is empty!");
        }

        if (size == 1) {
            // if only one element, reset head and tail
            Object value = head.value;
            head = null;
            tail = null;
            size--;
            return value;
        }

        //  second last node
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        Object value = tail.value; // Save value of last node
        tail = current; // Update tail to second last node
        tail.next = null; // Remove reference to last node
        size--;

        return value;
    }

    public Object removeByIndex(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds!");
        }

        if (index == 0)
        {
            // Remove the first node
            Object value = head.value;
            head = head.next;
            if (head == null)
                tail = null; // If the list is now empty, reset the tail

            size--;
            return value;
        }

        // Traverse to the node just before the one we want to remove
        Node current = head;
        int currentIndex = 0;
        while (currentIndex < index - 1)
        {
            current = current.next;
            currentIndex++;
        }

        Object value = current.next.value; // Save value node to be removed
        current.next = current.next.next; // Remove node
        if (current.next == null)
        {
            tail = current; // If we removed the last node, update the tail
        }
        size--;

        return value;
    }

    public void clear()
    {
        head = null;
        tail = null;
        size = 0; // Reset size to 0
    }

    public boolean contains(Object value) {
        Node current = head;

        // Traverse the list and check each value
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }


}