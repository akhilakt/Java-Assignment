import java.util.Stack;

public class BrowserHistoryApp {
    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visit("akhila.com");
        bh.visit("abhi.org");
        bh.visit("ramya.net");
        bh.goBack();
        bh.goForward();
    }
}

class BrowserHistory {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage = null;

    public BrowserHistory() {
        System.out.println("CREATE Time Complexity: O(1)");
    }

    public void visit(String page) {
        if (currentPage != null) backStack.push(currentPage);
        currentPage = page;
        forwardStack.clear();
        System.out.println("Visiting: " + page + " INSERT Time Complexity: O(1)");
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Going back to: " + currentPage + " DELETE Time Complexity: O(1)");
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Going forward to: " + currentPage + " INSERT Time Complexity: O(1)");
        }
    }
}
