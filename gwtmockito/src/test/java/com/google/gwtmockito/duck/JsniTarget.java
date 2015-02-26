package com.google.gwtmockito.duck;

public class JsniTarget {

  public String getBlah(){
    throw new LinkageError();
  }

  public void setBlah(String blah) {
    throw new LinkageError();
  };
}
