import java.util.Objects;

public class Task {

    private String name;
    private String description;
    private int id;
    private Status status;



    public Task(String name, String description) {

        this.name = name;
        this.description = description;
        Status status = Status.NEW;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getId() {
        return id;
    }
    public Status getStatus() { return status;}

    public void setName(String name) { this.name = name;}
    public void setDescription(String description) { this.description = description;}
    public void setStatus(Status status) { this.status = status;}

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description length='" + description.length() + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object object){

        if (this == object) return true;

        if ( (object == null) || (getClass() != object.getClass()) ) return false;

        Task task = (Task) object;

        return Objects.equals(id, task.getId());
    }

    @Override public int hashCode(){
        return Objects.hash(name, description);
    }
}
