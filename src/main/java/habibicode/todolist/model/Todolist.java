package habibicode.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todolist {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(CompletionStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public CompletionStatus getStatus() {
        return status;
    }

    @Id
  @GeneratedValue
    private long id;
    private CompletionStatus status;
    //status is the name
}
