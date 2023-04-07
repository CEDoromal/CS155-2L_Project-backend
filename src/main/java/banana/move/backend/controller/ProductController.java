package banana.move.backend.controller;

import banana.move.backend.model.Product;
import banana.move.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value="/products")
    public List<Product> getAllProducts() { return productService.getAllProducts(); }

    @RequestMapping(value="/products/{id}")
    public Product getProduct(@PathVariable int id) { return productService.getProduct(id); }

    @RequestMapping(value="/products/add", method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) { return productService.addProduct(product); }

    @RequestMapping(value="/products/update", method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product) { return productService.updateProduct(product); }

    @RequestMapping(value="/products/delete/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable int id) { productService.deleteProduct(id); }
}
