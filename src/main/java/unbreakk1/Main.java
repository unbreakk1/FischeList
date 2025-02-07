package unbreakk1;

import java.util.List;
import java.util.ArrayList;

;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Wanda", "Waffles", "S001"));
        students.add(new Student("Tommy", "Tickles", "S002"));
        students.add(new Student("Betty", "Bubbles", "S003"));
        students.add(new Student("Freddy", "Fizzlepop", "S004"));
        students.add(new Student("Larry", "Lemonpants", "S005"));

    }
}
