package se.lexicon.functionalInterfacesExamples;

public class MathOperator implements DoubleOperator {

  @Override
  public Double apply(Double n1, Double n2) {
    return n1 + n2;
  }

}
