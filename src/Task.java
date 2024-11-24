public class Task {
    protected String title;
    protected Boolean complete;

    public Task(String title) {
        this.title = title;
        this.complete = Boolean.FALSE;
    }

    public void markComplete() {
        complete = Boolean.TRUE;
        System.out.println("Task Complete!");
    }
}
