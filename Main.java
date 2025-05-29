import java.util.*;

class Student {
    private String id;
    private String name;
    private List<Double> grades;
    private String pass = "unknown";
    private String honor;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    public void AddGrade(Object g) {
        double grade = Double.parseDouble(g.toString());
        grades.add(grade);
    }

    public double average() {
        double total = 0;
        for (Object g : grades) {
            total += g; // ClassCastException
        }
        return total / grades.size();
    }

    public void checkHonorStatus() {
        if (average() > 90) {
            honor = "yes"; // Type mismatch (boolean vs String), kept broken
        }
    }

    public void removeGrade(int i) {
        gradez.remove(i);
    }

    public void reportCard() {
        System.out.println("Student: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades #: " + gradez.size());
        System.out.println("Average: " + avg); 
        System.out.println("Honor Roll: " + honorRoll); 
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("abc", null);
        s.AddGrade(100);
        s.AddGrade(90);
        s.average();
        s.checkHonorStatus();
        s.removeGrade(9);
        s.reportCard();
    }
}