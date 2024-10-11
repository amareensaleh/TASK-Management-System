package graphql.model;

import java.io.Serializable;
import java.lang.String;
import java.time.LocalDateTime;

public class CalendarResource implements Serializable {
  private String title;

  private LocalDateTime start;

  private LocalDateTime end;

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getStart() {
    return this.start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public LocalDateTime getEnd() {
    return this.end;
  }

  public void setEnd(LocalDateTime end) {
    this.end = end;
  }
}
