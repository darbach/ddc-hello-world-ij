package edu.cnm.deepdive.prework;

public class HelloWorld {

  public static String salutation(String[] args) {
    //conditional operator
    return "Hello, " + ((args.length > 0) ? args[0] : "World");
  }

  private static void salute (String salutation) {
    System.out.println(salutation);
  }

  public static void main (String[] args) {
    salute(salutation(args));
  }


}
