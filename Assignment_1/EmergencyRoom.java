import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return other.severity - this.severity;
    }

    @Override
    public String toString() {
        return name + "(" + severity + ")";
    }
}

public class EmergencyRoom {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("Akhila", 8));
        pq.add(new Patient("Abhi", 5));
        pq.add(new Patient("Ramya", 9));

        System.out.println("Next patient: " + pq.poll());
        System.out.println("Patients in priority order: " + pq);
    }
}
