package karling.nicolas.aula8.controller;

import karling.nicolas.aula8.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
    public String getProduct(){
        Product product1 = new Product();
        product1.setName("potion");
        product1.setPrice(20.00);
        return product1.toString();
    }
}
