package se.lexicon.utilFunctionsExamples;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.function.Predicate;

public class PredicateDemo {

  /*
  Takes any object as an argument and return a boolean
  Use cases: if statements, filtering Collection adn Stream
  */

  public static void main(String[] args) {
    Predicate<Integer> positiveInteger = n -> n > 0;
    Predicate<Integer> greaterThan18 = n -> n > 18;
    Predicate<Integer> lessThan20 = n -> n < 20;

    int number = 20;
    System.out.println("number " + number + " is positive or no => " + positiveInteger.test(number));
    System.out.println(greaterThan18.test(number));
    System.out.println(lessThan20.test(number));

    Predicate<String> firsNameNotNull = fn -> fn != null && fn.trim().length() != 0;
    Predicate<Person> bornInALeapYear = person -> person.getBirthDate().isLeapYear();
    Predicate<String> firstNameLengthMacCheck = fn -> fn.length() <= 20;

    Person person1 = new Person(1, "Test", "Test", LocalDate.of(1900, 9, 11), false);
    System.out.println(bornInALeapYear.test(person1));
    System.out.println(firsNameNotNull.test(person1.getFirstName()));

    System.out.println(greaterThan18.and(lessThan20).test(number));
    System.out.println(greaterThan18.and(lessThan20).negate().test(number));

  }

}
