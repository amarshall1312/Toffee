import java.util.ArrayList;
import java.util.List;

public class Goal {
    protected String title;
    protected String description;
    protected String dueDate;
    protected List<Task> tasks;
    protected Boolean complete;

    public Goal(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.tasks = new ArrayList<>();
        this.complete = Boolean.FALSE;

    }

    public void addTask(Task newTask) {
        tasks.add(newTask);
        System.out.println("New task added!");
    }

    public void markComplete() {
        complete = Boolean.TRUE;
        System.out.println("Goal Complete!");
    }
}
