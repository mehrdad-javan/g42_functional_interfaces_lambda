package se.lexicon.utilFunctionsExamples;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

  public static void main(String[] args) {
    Supplier<Double> randomNumber = () -> Math.random();
    Supplier<LocalDate> tomorrowDate = () -> LocalDate.now().plusDays(1);

    System.out.println(randomNumber.get());
    System.out.println(tomorrowDate.get());
  }
}
