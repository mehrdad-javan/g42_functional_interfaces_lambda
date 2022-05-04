package se.lexicon.utilFunctionsExamples;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

  public static void main(String[] args) {

    Function<String, String> toLowerCaseFunction = value-> value.toLowerCase();
    System.out.println(toLowerCaseFunction.apply("HELLO Java!"));

    UnaryOperator<String> toLowerCaseUnaryFunction = value -> value.toLowerCase();
    System.out.println(toLowerCaseUnaryFunction.apply("HELLO Java!"));

  }
}
