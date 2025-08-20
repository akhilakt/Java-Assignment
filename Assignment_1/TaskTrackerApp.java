import java.util.ArrayList;
import java.util.HashSet;

public class TaskTrackerApp {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        tracker.addTask("Finish Assignment");
        tracker.addTask("Read Chapter 5");
        tracker.markCompleted("Finish Assignment");
        tracker.displayTasks();
        tracker.removeTask("Read Chapter 5");
    }
}

class TaskTracker {
    private ArrayList<String> tasks = new ArrayList<>();
    private HashSet<String> completedTasks = new HashSet<>();

    public TaskTracker() {
        System.out.println("CREATE Time Complexity: O(1)");
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("INSERT Time Complexity: O(1)");
    }

    public void markCompleted(String task) {
        if (tasks.contains(task)) {
            completedTasks.add(task);
            System.out.println("SEARCH Time Complexity: O(n)");
        }
    }

    public void removeTask(String task) {
        tasks.remove(task);
        completedTasks.remove(task);
        System.out.println("DELETE Time Complexity: O(n)");
    }

    public void displayTasks() {
        System.out.println("Tasks: " + tasks);
    }
}
