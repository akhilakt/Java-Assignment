import java.util.LinkedList;
import java.util.Queue;

public class CustomerServiceApp {
    public static void main(String[] args) {
        ServiceDesk sd = new ServiceDesk();
        sd.addRequest("Akhila - Password Reset");
        sd.addRequest("Ramya - Account Issue");
        sd.displayRequests();
        sd.serveNext();
    }
}

class ServiceDesk {
    private Queue<String> requests = new LinkedList<>();

    public ServiceDesk() {
        System.out.println("CREATE Time Complexity: O(1)");
    }

    public void addRequest(String request) {
        requests.add(request);
        System.out.println("INSERT Time Complexity: O(1)");
    }

    public void serveNext() {
        String next = requests.poll();
        System.out.println("Serving: " + next + " DELETE Time Complexity: O(1)");
    }

    public void displayRequests() {
        System.out.println("Pending requests: " + requests);
    }
}
