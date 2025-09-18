public class Subtask extends Task {

    private String name;
    private String description;
    private int id;



    public Subtask(String name, String description) {
        super(name, description);
        Status status = Status.IN_PROGRESS;//подправить конструктор
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }


}
