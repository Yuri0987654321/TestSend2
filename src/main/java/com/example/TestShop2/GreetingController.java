package com.example.TestShop2;

import com.example.TestShop2.domain.Product;
import com.example.TestShop2.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@Controller
public class GreetingController {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping("/products")
    public String products(Map<String, Object> model) {
        Iterable<Product> products = productRepo.findAll();
        model.put("products", products);
        return "main";
    }

    @GetMapping("/products/{id}")
    public String product(@PathVariable("id") Integer id, Map<String, Object> model) {
        Optional<Product> product = Optional.empty();
        try {
            Iterable<Product> all = productRepo.findAll();
            for(Product m:all){
                if(id.equals(m.getId())){
                    product = Optional.of(m);
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        if(product.isPresent()) {
            model.put("product", product.get());
            return "product";
        }else{
            return "empty";
        }
    }

    @PostMapping("/products")
    public String add(@RequestParam String name, @RequestParam String characteristic, @RequestParam String price, @RequestParam int stock, Map<String, Object> model) {
        Product product = new Product(name, characteristic, price, stock);
        productRepo.save(product);
        Iterable<Product> products = productRepo.findAll();
        model.put("products", products);
        return "main";
    }
}