import java.time.LocalDateTime;
public class Task {
    private int id; // id of the task
    private String description; // what is the task
    private String status; // is task in 'todo', 'in-progress' or 'done'
    private LocalDateTime createdAt; // when was the task created
    private LocalDateTime updatedAt; // when was the task updated
    Task(int id, String description, String status) { // constructor for calling this class
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    } // getter method for getting the id of the task
    public void setId(int id) {
        this.id = id;
    } // setter method for setting the id of the task
    public String getDescription() {
        return description;
    } // for getting what the task is
    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now();
    } // setter method for setting the description
    public String getStatus() {return status;} // for getting the status of the task
    public void setStatus(String status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
    } // for setting the status of the task
    public LocalDateTime getCreatedAt() {return createdAt;} // for getting the time when the task was created
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;} // for setting when the task was created

    @Override
    public String toString() {
        return "[" + id + "] " + description + " (" + status + ")";
    }
}
