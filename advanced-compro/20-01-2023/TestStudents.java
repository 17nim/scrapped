import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class Student {
    String name;
    protected String favoriteCourse;

    public abstract void writePrograms();
    
    Student(String name) {
        this.name = name;
    }

    public String getFavoriteCourse() {
        return favoriteCourse;
    }

    public String toString() {
        return name + " => favorite course: " + favoriteCourse;
    }
}

class FavoriteCourseComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.favoriteCourse.compareTo(b.favoriteCourse);
    }
}

class ComEnStudent extends Student {
    ComEnStudent(String name, String favoriteCourse) {
        super(name);
        this.favoriteCourse = favoriteCourse;
    }

    public void writePrograms() {
        System.out.println(name + " writes programs in Python and Java.");
    }
}

class DmeEnStudent extends Student {
    DmeEnStudent(String name, String favoriteCourse) {
        super(name);
        this.favoriteCourse = favoriteCourse;
    }

    public void writePrograms() {
        System.out.println(name + " writes programs in Python and C#.");
    }
}

public class TestStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new DmeEnStudent("Manee", "Interaction Design"));
        students.add(new ComEnStudent("Mana", "Advanced Computer Programming"));
        students.add(new ComEnStudent("Piti", "Linear Circuit Analysis"));
        students.add(new ComEnStudent("Nigel", "Calculus"));
        System.out.println(students);
        Collections.sort(students, new FavoriteCourseComparator());
        System.out.println(students);
    }
}
