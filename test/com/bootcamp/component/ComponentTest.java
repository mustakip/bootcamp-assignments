package com.bootcamp.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComponentTest {
  private Body body;

  @BeforeEach
  void setUp() {
    body = new Body();
  }

  @Test
  void shouldRefreshBodyAndReturnNameOfComponent() {
    String expected = "Body refreshed ";
    assertEquals(expected, body.refresh());
  }

  @Test
  void shouldRefreshTheComponentAndItsChildComponent() {
    Component sidePanel = new SidePanel();
    body.add(sidePanel);
    String expected = "Body refreshed SidePanel refreshed ";
    assertEquals(expected, body.refresh());
  }

  @Test
  void shouldRefreshTheComponentAndItsChildren() {
    Component sidePanel = new SidePanel();
    body.add(sidePanel);
    Content content = new Content();
    Component image = new Image();
    content.add(image);
    Component text = new Text();
    content.add(text);
    body.add(content);
    Component bottomPanel = new BottomPanel();
    body.add(bottomPanel);
    String expected = "Body refreshed SidePanel refreshed Content refreshed Image refreshed Text refreshed " +
      "BottomPanel refreshed ";
    assertEquals(expected, body.refresh());
  }
}