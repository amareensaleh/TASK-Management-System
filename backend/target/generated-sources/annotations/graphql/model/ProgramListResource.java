package graphql.model;

import java.io.Serializable;
import java.util.List;

public class ProgramListResource implements Serializable {
  private List<ProgramResource> programList;

  public List<ProgramResource> getProgramList() {
    return this.programList;
  }

  public void setProgramList(List<ProgramResource> programList) {
    this.programList = programList;
  }
}
