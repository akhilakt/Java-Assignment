import java.util.*;

public class GradebookApp {
    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        sg.addStudent("Akhila");
        sg.addGrade("Akhila", 95);
        sg.addStudent("Abhi");
        sg.addGrade("Abhi", 88);
        sg.addGrade("Abhi", 92);
        sg.displayGrades();
    }
}

class StudentGrades {
    private Map<String, List<Integer>> gradebook = new HashMap<>();

    public void addStudent(String name) {
        gradebook.putIfAbsent(name, new ArrayList<>());
        System.out.println("INSERT Time Complexity: O(1)");
    }

    public void addGrade(String name, int grade) {
        List<Integer> grades = gradebook.get(name);
        if (grades != null) {
            grades.add(grade);
            System.out.println("INSERT Time Complexity: O(1)");
        }
    }

    public double calculateAverage(String name) {
        List<Integer> grades = gradebook.get(name);
        if (grades == null || grades.isEmpty()) return 0;
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.size();
    }

    public void displayGrades() {
        for (String student : gradebook.keySet()) {
            System.out.println(student + ": " + gradebook.get(student) + " Average: " + calculateAverage(student));
        }
    }
}
