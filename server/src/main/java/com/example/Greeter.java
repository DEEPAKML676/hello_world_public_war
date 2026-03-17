package com.example;

/**
 * Provides a simple greeting service.
 */
public class Greeter {

  /**
   * Default constructor.
   */
  public Greeter() {
  }

  /**
   * Returns a formatted greeting string.
   *
   * @param someone The name of the person to greet.
   * @return A greeting string.
   */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
