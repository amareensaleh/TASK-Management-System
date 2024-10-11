package graphql.model;

import java.io.Serializable;
import java.util.List;

public class TaskListResource implements Serializable {
  private List<Task> taskList;

  public List<Task> getTaskList() {
    return this.taskList;
  }

  public void setTaskList(List<Task> taskList) {
    this.taskList = taskList;
  }
}
