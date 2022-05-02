package se.lexicon.practice;

import java.util.ArrayList;
import java.util.List;

public class App {

  static Conditional filterByStock0 = p -> p.getStock() == 0;
  static Conditional filterByNameStartB = p-> p.getProductName().startsWith("B");

  static Action print = p -> System.out.println(p);

  public static void main(String[] args) {
    List<Product> productList = new ArrayList<>();
    productList.add(new Product("Product1", 1000.00, 1));
    productList.add(new Product("Product2", 2000.00, 20));
    productList.add(new Product("Product3", 100.00, 0));
    productList.add(new Product("Product4", 150.00, 5));
    productList.add(new Product("B Product5", 120.00, 0));

    //Print out all Products that have stock value of 0.
    process(productList, filterByStock0, print);
    System.out.println("--------------------------------------------------");
    //Print out the productName of all the Products that starts with B.
    process(productList, filterByNameStartB, print);


    //Print out all Products that have price above 100 AND lower than 150
    // todo: implement it

    //Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%
    // todo: implement it

  }


  public static void process(List<Product> productList, Conditional filter, Action action) {
    for (Product product : productList) {
      if (filter.test(product)) {
        action.execute(product);
      }
    }
  }


}
