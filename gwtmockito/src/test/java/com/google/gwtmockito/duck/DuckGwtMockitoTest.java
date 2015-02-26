package com.google.gwtmockito.duck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DuckGwtMockitoTestRunner.class)
public class DuckGwtMockitoTest {

  @Test
  public void testJsni() {
    JsniTarget jsniTarget = new JsniTarget();
    jsniTarget.setBlah("Foo blah");
    assertEquals("Foo blah", jsniTarget.getBlah());
  }
  
}
