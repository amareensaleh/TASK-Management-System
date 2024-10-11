package graphql.model;

import java.io.Serializable;
import java.util.List;

public class TaskRecordListResource implements Serializable {
  private List<TaskRecord> taskRecordList;

  public List<TaskRecord> getTaskRecordList() {
    return this.taskRecordList;
  }

  public void setTaskRecordList(List<TaskRecord> taskRecordList) {
    this.taskRecordList = taskRecordList;
  }
}
