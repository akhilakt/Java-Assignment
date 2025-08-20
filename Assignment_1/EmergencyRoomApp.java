import java.util.ArrayList;
import java.util.PriorityQueue;

public class EmergencyRoomApp {
    public static void main(String[] args) {
        ERQueue er = new ERQueue();
        er.addPatient("Akhila", 7);
        er.addPatient("Ramya", 5);
        er.displayPatients();
        er.treatNext();
    }
}

class ERQueue {
    static class Patient {
        String name;
        int severity;
        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
        public String toString() { return name + " (Severity: " + severity + ")"; }
    }

    private PriorityQueue<Patient> queue;

    public ERQueue() {
        queue = new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));
        System.out.println("CREATE Time Complexity: O(1)");
    }

    public void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
        System.out.println("INSERT Time Complexity: O(log n)");
    }

    public void treatNext() {
        Patient p = queue.poll();
        System.out.println("Treating: " + p);
        System.out.println("DELETE Time Complexity: O(log n)");
    }

    public void displayPatients() {
        ArrayList<Patient> list = new ArrayList<>(queue);
        list.sort((a, b) -> Integer.compare(b.severity, a.severity));
        System.out.println("Patients in priority order: " + list);
    }
}
