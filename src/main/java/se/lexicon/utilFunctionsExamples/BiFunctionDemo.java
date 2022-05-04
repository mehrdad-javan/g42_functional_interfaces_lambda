package se.lexicon.utilFunctionsExamples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

  public static void main(String[] args) {
    Function<Integer, Integer> numberPlus10 = n -> n + 10;
    System.out.println(numberPlus10.apply(50));

    BiFunction<Integer,Integer, Integer> addition = (n1,n2) -> n1 + n2;
    BiFunction<Integer,Integer, Integer> multiplication = (n1,n2) -> n1 * n2;
    System.out.println(addition.apply(2,2));
    System.out.println(multiplication.apply(3,3));

    Function<Integer, Integer> multiplyBy10 = res -> res * 10;
    System.out.println(addition.andThen(multiplyBy10).apply(2, 2));



  }
}
