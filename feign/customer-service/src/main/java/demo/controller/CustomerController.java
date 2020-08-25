package demo.controller;

import demo.dto.CustomerDto;
import demo.feign.client.ProductClient;
import demo.commons.Customer;
import demo.commons.DataStore;
import demo.commons.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {

  @Autowired
  private ProductClient productClient;

  @GetMapping("/{id}")
  public CustomerDto getCustomerById(@PathVariable String id) {
    Customer customer = DataStore.listCustomers()
                                 .stream()
                                 .filter(cust->cust.getId().equalsIgnoreCase(id))
                                 .findFirst().get();
    List<Product> products = productClient.listProductsByCustomerId(id);
    CustomerDto dto = new CustomerDto();
    BeanUtils.copyProperties(customer, dto);
    dto.setProducts(products);
    //Product pr1 = productClient.getProductById("PRD1");
    //Product pr2 = productClient.create(products.get(0));
    //List<Product> pr3 = productClient.listProducts();
    return dto;
  }
}
