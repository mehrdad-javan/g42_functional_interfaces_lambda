package se.lexicon.utilFunctionsExamples;

import java.time.LocalDate;
import java.util.function.Function;

public class FunctionDemo {

  public static void main(String[] args) {
    String[] strings = {"I", "LOVE", "JAVA"};

    Function<String[], String> concatArrayToString = a -> {
      String target = "";
      for (String element : a) {
        target += element + " ";
      }
      return target;
    };

    System.out.println(concatArrayToString.apply(strings));


    Function<Person, String> extractFullName = person -> person.getFirstName() + " " + person.getLastName();
    Person person1 = new Person(1, "Test", "Test", LocalDate.parse("2000-01-01"), true);
    System.out.println(extractFullName.apply(person1));
  }

}
