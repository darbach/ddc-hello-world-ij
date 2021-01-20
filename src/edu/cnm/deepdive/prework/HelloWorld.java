package edu.cnm.deepdive.prework;

public class HelloWorld {

  private static void salute (String target) {
    System.out.println("Hello, " + target + "!");
  }

  public static void main (String[] args) {
    //conditional operator
    salute((args.length > 0) ? args[0] : "World");
  }

}
