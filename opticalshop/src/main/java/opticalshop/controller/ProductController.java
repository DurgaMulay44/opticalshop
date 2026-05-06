package opticalshop.controller;

import opticalshop.model.Product;
import opticalshop.model.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    List<Product> products = new ArrayList<>();

    // Add product
    @PostMapping
    public String addProduct(@RequestBody Product product) {
        products.add(product);
        return "Product added!";
    }

    // View products
    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    // Buy product (Billing)
    @PostMapping("/buy")
    public String buyProduct(@RequestBody Bill bill) {

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(bill.getProductName())) {

                if (p.getStock() >= bill.getQuantity()) {
                    double total = p.getPrice() * bill.getQuantity();

                    p.setStock(p.getStock() - bill.getQuantity());

                    return "Total Bill: " + total;
                } else {
                    return "Not enough stock!";
                }
            }
        }

        return "Product not found!";
    }
}