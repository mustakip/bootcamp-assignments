package com.bootcamp.component;

import java.util.ArrayList;
import java.util.List;

public class Content implements Component {
  private List<Component> childrenComponents;

  public Content() {
    super();
    this.childrenComponents = new ArrayList<>();
  }

  @Override
  public String refresh() {
    StringBuilder result = new StringBuilder();
    for(Component child : childrenComponents) {
      result.append(child.refresh());
    }
    return "Content refreshed" + " " + result;
  }

  public void add(Component component) {
    this.childrenComponents.add(component);
  }
}
