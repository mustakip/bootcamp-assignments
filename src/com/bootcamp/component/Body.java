package com.bootcamp.component;

import java.util.ArrayList;
import java.util.List;

public class Body implements Component {
  private List<Component> childrenComponents;

  public Body() {
    super();
    this.childrenComponents = new ArrayList<>();
  }

  @Override
  public String refresh() {
    StringBuilder result = new StringBuilder();
    for(Component child : childrenComponents) {
      result.append(child.refresh());
    }
    return "Body refreshed" + " " + result;
  }

  public void add(Component component) {
    this.childrenComponents.add(component);
  }
}
