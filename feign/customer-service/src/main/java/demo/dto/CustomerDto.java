package demo.dto;

import demo.commons.Customer;
import demo.commons.Product;

import java.util.List;

public class CustomerDto extends Customer {

  private List<Product> products;

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
