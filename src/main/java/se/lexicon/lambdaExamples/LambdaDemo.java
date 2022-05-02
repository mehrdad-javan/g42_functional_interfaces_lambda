package se.lexicon.lambdaExamples;

import se.lexicon.functionalInterfacesExamples.DoStringStuff;
import se.lexicon.functionalInterfacesExamples.DoubleOperator;

import java.util.Random;

public class LambdaDemo {

  public static String doStringStuff(String s1, String s2, DoStringStuff operation) {
    return operation.operate(s1, s2);
  }

  public static Double calcOperator(Double n1, Double n2, DoubleOperator operator) {
    return operator.apply(n1, n2);
  }


  /*
    // Moving Anonymous Inner classes to fields
    static DoStringStuff getBiggestString = new DoStringStuff() {
      @Override
      public String operate(String s1, String s2) {
        return s1.length() >= s2.length() ? s1 : s2;
      }
    };
   */
  public static void main(String[] args) {

    DoStringStuff getBiggestString = (firstValue, secondValue) -> firstValue.length() >= secondValue.length() ? firstValue : secondValue;
    DoStringStuff concat = (v1, v2) -> v1.concat(" ").concat(v2);
    DoubleOperator addition = (n1, n2) -> n1 + n2;
    DoubleOperator subtraction = (n1, n2) -> n1 - n2;
    DoubleOperator multiplication = (n1, n2) -> n1 * n2;
    DoubleOperator division = (n1, n2) -> n1 / n2;

    System.out.println(getBiggestString.operate("ABD", "ABCD"));
    System.out.println(concat.operate("Mehrdad", "Javan"));
    System.out.println(addition.apply(2d, 4d));
    System.out.println(subtraction.apply(2d, 4d));

    System.out.println(doStringStuff("Functional", "Interfaces", getBiggestString));
    System.out.println(doStringStuff("Functional", "Interfaces", concat));

    System.out.println(calcOperator(3d, 5d, addition));
    System.out.println(calcOperator(3d, 5d, subtraction));
    System.out.println(calcOperator(3d, 5d, multiplication));
    System.out.println(calcOperator(3d, 5d, division));

    Print printer = (message) -> System.out.println(message);
    printer.print("Lambda Expression");


    Print printName = name -> System.out.println(name);
    printName.print("Mehrdad");

    Conditional positiveNumber = n -> n > 0;
    Conditional positiveNumberEx2 = n -> {
      if (n > 0){
        return true;
      } else {
        return false;
      }
    };

    IntRandom rng = () -> new Random().nextInt();

    System.out.println(positiveNumber.testInt(-10));
    System.out.println(positiveNumber.testInt(5));
    System.out.println(rng.generate());



  }


}
