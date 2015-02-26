package com.google.gwtmockito.duck;

import java.util.HashMap;
import java.util.Map;

import org.junit.runners.model.InitializationError;

import com.google.gwtmockito.GwtMockitoTestRunner;

public class DuckGwtMockitoTestRunner extends GwtMockitoTestRunner {

  public DuckGwtMockitoTestRunner(Class<?> unitTestClass) throws InitializationError {
    super(unitTestClass);
  }

  @Override
  protected Map<String, String> getClassesToDuckLoad() {
    Map<String, String> ducks = new HashMap<String, String>();
    ducks.put("com.google.gwtmockito.duck.JsniTarget", "com.google.gwtmockito.duck.JsniTargetDuck");
    return ducks;
  }
  
  

}
