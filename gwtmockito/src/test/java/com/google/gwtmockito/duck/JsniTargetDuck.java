package com.google.gwtmockito.duck;

public class JsniTargetDuck {

  private String blah;

  public String getBlah() {
    return blah;
  }

  public void setBlah(String blah) {
    this.blah = blah;
  }
  
  public static String staticBlah() {
    return "staticBlah";
  }
}
