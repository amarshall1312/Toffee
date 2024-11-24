public class HomePage {
    public static void main(String[] args) {
    Goal goal1 = new Goal("Learn French", "Need to become fluent in french", "29/12/2024");
    Task task1 = new Task("learn numbers");
    goal1.addTask(task1);
    task1.markComplete();
    goal1.markComplete();

    }
}
