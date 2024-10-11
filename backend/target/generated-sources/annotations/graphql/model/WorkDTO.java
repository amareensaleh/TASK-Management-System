package graphql.model;

import java.io.Serializable;
import java.lang.String;

public class WorkDTO implements Serializable {
  private String work;

  public String getWork() {
    return this.work;
  }

  public void setWork(String work) {
    this.work = work;
  }
}
