package graphql.model;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;

public class TaskRecord implements Serializable {
  private Long id;

  private Long user;

  private Long program;

  private Long task;

  private String status;

  private Double score;

  private Double max;

  private String remarks;

  private String work;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUser() {
    return this.user;
  }

  public void setUser(Long user) {
    this.user = user;
  }

  public Long getProgram() {
    return this.program;
  }

  public void setProgram(Long program) {
    this.program = program;
  }

  public Long getTask() {
    return this.task;
  }

  public void setTask(Long task) {
    this.task = task;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Double getScore() {
    return this.score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Double getMax() {
    return this.max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getWork() {
    return this.work;
  }

  public void setWork(String work) {
    this.work = work;
  }
}
