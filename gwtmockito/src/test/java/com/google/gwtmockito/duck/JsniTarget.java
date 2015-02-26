package com.google.gwtmockito.duck;

public class JsniTarget {

  public String getBlah(){
    throw new LinkageError();
  }

  public void setBlah(String blah) {
    throw new LinkageError();
  };
  
  public static String staticBlah() {
    throw new LinkageError();
  }
}
