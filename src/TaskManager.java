import java.util.HashMap;
import java.util.Scanner;

public class TaskManager {

    static HashMap<Integer, Task> taskRecorder = new HashMap<>();
    static HashMap <Integer, Subtask> subtaskRecorder = new HashMap<>();
    static HashMap <Integer, Epic> epicRecorder = new HashMap<>();

    int taskId = 0;

    void setTaskId() {
        taskId++;
    }

    void printAllRecords() {
        if (!taskRecorder.isEmpty()) System.out.println(taskRecorder);
        if (!epicRecorder.isEmpty()) System.out.println(epicRecorder);
        if (!subtaskRecorder.isEmpty()) System.out.println(subtaskRecorder);
    }

    void deleteAllTasks() {
        if (!taskRecorder.isEmpty()) taskRecorder.clear();
        if (!epicRecorder.isEmpty()) epicRecorder.clear();
        if (!subtaskRecorder.isEmpty()) subtaskRecorder.clear();
    }

    Task getById(int taskId){
        if (taskRecorder.containsKey(taskId)) return taskRecorder.get(taskId);
        if (epicRecorder.containsKey(taskId)) return epicRecorder.get(taskId);
        if (subtaskRecorder.containsKey(taskId)) return subtaskRecorder.get(taskId);
        return null;
    }

    void createTask(Task newTask){
        setTaskId();
        taskRecorder.put(taskId, newTask);
    };

    void createEpic(Epic newEpic){
        setTaskId();
        epicRecorder.put(taskId, newEpic);
    };

    void createSubtask(Subtask newSubtask){
        setTaskId();
        subtaskRecorder.put(taskId, newSubtask);

    };


    void updateTask(Task task){
        taskRecorder.put(task.getId(), task);
    };

    void updateEpic(Epic epic){
        epicRecorder.put(epic.getId(), epic);
    };

    void updateSubtask(Subtask subtask){
        subtaskRecorder.put(subtask.getId(), subtask);
    };

    void deleteTask(int taskId) {
        taskRecorder.remove(taskId);
    }

    void deleteEpic(int taskId) {
        epicRecorder.remove(taskId);
    }

    void deleteSubtask(int taskId) {
        subtaskRecorder.remove(taskId);
    }
}
