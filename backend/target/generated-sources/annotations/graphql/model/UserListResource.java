package graphql.model;

import java.io.Serializable;
import java.util.List;

public class UserListResource implements Serializable {
  private List<UserResource> userList;

  public List<UserResource> getUserList() {
    return this.userList;
  }

  public void setUserList(List<UserResource> userList) {
    this.userList = userList;
  }
}
