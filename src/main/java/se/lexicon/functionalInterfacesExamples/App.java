package se.lexicon.functionalInterfacesExamples;

import se.lexicon.functionalInterfacesExamples.DoStringStuff;
import se.lexicon.functionalInterfacesExamples.DoubleOperator;
import se.lexicon.functionalInterfacesExamples.MathOperator;
import se.lexicon.functionalInterfacesExamples.StringOperator;

/**
 * Hello world!
 */
public class App {

  // Moving Anonymous Inner classes to fields
  static DoStringStuff getBiggestString = new DoStringStuff() {
    @Override
    public String operate(String s1, String s2) {
      return s1.length() >= s2.length() ? s1 : s2;
    }
  };

  // Moving Anonymous Inner classes to fields
  static DoStringStuff concat = new DoStringStuff() {
    @Override
    public String operate(String s1, String s2) {
      return s1.concat(" ").concat(s2);
    }
  };

  // Moving Anonymous Inner classes to fields
  static DoubleOperator additionOperator = new DoubleOperator() {
    @Override
    public Double apply(Double n1, Double n2) {
      return n1 + n2;
    }
  };

  // Moving Anonymous Inner classes to fields
  static DoubleOperator subtractionOperator = new DoubleOperator() {
    @Override
    public Double apply(Double n1, Double n2) {
      return n1 - n2;
    }
  };

  static DoubleOperator multiplication = new DoubleOperator() {
    @Override
    public Double apply(Double n1, Double n2) {
      return n1 * n2;
    }
  };

  public static void main(String[] args) {
    ex5();
  }

  public static void ex1() {
    StringOperator concatOperator = new StringOperator();
    String firstName = "Mehrdad";
    String lastName = "Javan";
    System.out.println(concatOperator.operate(firstName, " " + lastName));
  }

  public static void ex2() {
    MathOperator additionOperator = new MathOperator();
    System.out.println(additionOperator.apply(2d, 3d));
  }

  // Anonymous Inner Classes
  public static void ex3() {

    DoStringStuff getBiggestString = new DoStringStuff() {
      @Override
      public String operate(String s1, String s2) {
        return s1.length() >= s2.length() ? s1 : s2;
      }
    }; // notice semicolon
    System.out.println(getBiggestString.operate("ABD", "ABCDEFG"));


    DoStringStuff concat = new DoStringStuff() {
      @Override
      public String operate(String s1, String s2) {
        return s1.concat(" ").concat(s2);
      }
    };
    System.out.println(concat.operate("Mehrdad", "Javan"));

    DoubleOperator additionOperator = new DoubleOperator() {
      @Override
      public Double apply(Double n1, Double n2) {
        return n1 + n2;
      }
    };
    System.out.println(additionOperator.apply(3d, 2d));


    DoubleOperator subtractionOperator = new DoubleOperator() {
      @Override
      public Double apply(Double n1, Double n2) {
        return n1 - n2;
      }
    };
    System.out.println(subtractionOperator.apply(3d, 2d));


  }


  // Moving Anonymous Inner classes to fields
  public static void ex4() {
    System.out.println(getBiggestString.operate("Test", "Test123"));
    System.out.println(concat.operate("Functional", "Interfaces"));

    System.out.println(additionOperator.apply(4d, 5d));
    System.out.println(subtractionOperator.apply(4d, 5d));

  }

  // Functional Interfaces in method parameters
  public static String duStringStuff(String s1, String s2, DoStringStuff operation) {
    return operation.operate(s1, s2);
  }

  public static Double mathOperator(Double n1, Double n2, DoubleOperator operator) {
    return operator.apply(n1, n2);
  }

  public static void ex5() {
    System.out.println(duStringStuff("ABC", "ABCD", getBiggestString));
    System.out.println(duStringStuff("ABC", "ABCD", concat));

    System.out.println("Addition: " + mathOperator(2d,10d, additionOperator));
    System.out.println("Subtraction: " + mathOperator(20d,5d, subtractionOperator));
    System.out.println("Multiplication: " + mathOperator(20d,5d, multiplication));
  }

}
