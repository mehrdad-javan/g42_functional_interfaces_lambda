package se.lexicon.functionalInterfacesExamples;

import java.util.List;

@FunctionalInterface
public interface TestInterface<T> {

  T math(List<T> list);
}
