package graphql.model;

import java.io.Serializable;
import java.util.List;

public class CalendarListResource implements Serializable {
  private List<CalendarResource> events;

  public List<CalendarResource> getEvents() {
    return this.events;
  }

  public void setEvents(List<CalendarResource> events) {
    this.events = events;
  }
}
