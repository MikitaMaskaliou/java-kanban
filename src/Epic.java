import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends Task {
    private String name;
    private String description;
    private int id;

    ArrayList<Subtask> subtasks = new ArrayList<>();



    public Epic(String name, String description) {
        super(name, description );
    }

    void addSubtask(Subtask newSubtask) {
        subtasks.add(newSubtask);
    }


}
