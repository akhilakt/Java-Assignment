import java.util.*;

public class StudentGradebook {
    public static void main(String[] args) {
        Map<String, List<Integer>> grades = new HashMap<>();
        addStudent(grades, "Akhila");
        addGrade(grades, "Akhila", 90);
        addGrade(grades, "Akhila", 85);
        displayGrades(grades);
    }

    static void addStudent(Map<String, List<Integer>> map, String name) {
        map.put(name, new ArrayList<>());
        System.out.println("CREATE Time Complexity: O(1)");
    }

    static void addGrade(Map<String, List<Integer>> map, String name, int grade) {
        map.get(name).add(grade);
        System.out.println("INSERT Time Complexity: O(1)");
    }

    static void displayGrades(Map<String, List<Integer>> map) {
        for (String student : map.keySet()) {
            System.out.println(student + " : " + map.get(student));
        }
    }
}
