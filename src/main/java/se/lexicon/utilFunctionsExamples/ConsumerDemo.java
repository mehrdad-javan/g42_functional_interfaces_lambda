package se.lexicon.utilFunctionsExamples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

  /*
  Takes any object and returns nothing
  use cases: apply changes on collection or iterate through the collection without the return a result
   */
  public static void main(String[] args) {

    Consumer<String> printMessage = msg -> System.out.println(msg);
    printMessage.accept("Hello Java!");

    Person person1 = new Person(1, "Test", "Test", LocalDate.of(1900, 9, 11), false);
    Person person2 = new Person(2, "Test2", "Test2", LocalDate.of(1900, 9, 11), false);

    Consumer<Person> printFullName = p -> System.out.println(p.getFirstName() + " " + p.getLastName());
    printFullName.accept(person1);

    List<Person> personList = new ArrayList<>();
    personList.add(person1);
    personList.add(person2);

    /*for (Person person : personList) {
      person.setActive(true);
    }
    System.out.println(personList);*/

    Consumer<Person> printInformation = p -> System.out.println(p.toString());

    personList.forEach(p -> p.setActive(true));
    personList.forEach(printInformation);
    //personList.forEach(System.out::println);

  }

}
