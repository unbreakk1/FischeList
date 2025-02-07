package unbreakk1;

public class Sack
{
    private Object[] elements;
    private int size;


    public Sack()
    {
        elements = new Object[10]; // Default capacity to 10
        size = 0;
    }

    // Method to add elements
    public void add(Object element)
    {
        // Resize the array if it's full
        if (size == elements.length) {
            resize();
        }
        // Add element to the array and increase the size
        elements[size++] = element;
    }

    private void resize()
    {
        // new array with double cap
        Object[] newElements = new Object[elements.length * 2];
        // Copy existing elements to new array
        for (int i = 0; i < elements.length; i++)
        {
            newElements[i] = elements[i];
        }
        elements = newElements; // Replace old new array
    }

}
