package se.lexicon.utilFunctionsExamples;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class MethodReferenceDemo {


  public static int getRandomNumber(int max) {
    Random random = new Random();
    return random.nextInt(max + 1) + 1; // 1 to 10
  }

  public static int addition(int a, int b) {
    return a + b;
  }

  public int multiplication(int a,int b){
    return a * b;
  }

  public static void main(String[] args) {

    IntUnaryOperator randomNumberM = MethodReferenceDemo::getRandomNumber;
    System.out.println(randomNumberM.applyAsInt(10));

    IntUnaryOperator randomNumberL = n -> MethodReferenceDemo.getRandomNumber(n);
    System.out.println(randomNumberL.applyAsInt(10));

    BiFunction<Integer, Integer, Integer> additionFunctionL = (p1, p2) -> MethodReferenceDemo.addition(p1, p2);
    BiFunction<Integer, Integer, Integer> additionFunctionM = MethodReferenceDemo::addition;
    System.out.println(additionFunctionM.apply(2,5));
    System.out.println(additionFunctionL.apply(2,5));

    System.out.println("------------------------------");
    MethodReferenceDemo referenceDemo = new MethodReferenceDemo();
    BiFunction<Integer, Integer, Integer> multiplicationFunctionL = (p1,p2) -> referenceDemo.multiplication(p1,p2);
    BiFunction<Integer, Integer, Integer> multiplicationFunctionM = referenceDemo::multiplication;
    System.out.println(multiplicationFunctionL.apply(2,3));
    System.out.println(multiplicationFunctionM.apply(2,3));

  }
}
