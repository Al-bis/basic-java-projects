package pl.coderstrust.whatsNew;

import java.util.ArrayList;

public class IntroducedInJava10 {

  public static void main(String[] args) {
    localVariablesDeclaration();
  }

  private static void localVariablesDeclaration() {
    var data = new ArrayList<String>();
    data.add("Element 1");
    data.add("Element 2");
    data.add("Element 3");

    for (String element : data) {
      System.out.println(element);
    }
  }

}
