package org.radoslawzerek.cafemanagementsystem.rest;

import org.radoslawzerek.cafemanagementsystem.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/product")
public interface ProductRest {

    @PostMapping("/add")
    ResponseEntity<String> addProduct(@RequestBody Map<String, String> requestMap);

    @GetMapping("/get")
    ResponseEntity<List<ProductWrapper>> getAllProducts();

    @PostMapping("/update")
    ResponseEntity<String> updateProduct(@RequestBody Map<String, String> requestMap);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteProduct(@PathVariable Long id);

    @PostMapping("/update-status")
    ResponseEntity<String> updateStatus(@RequestBody Map<String, String> requestMap);

    @GetMapping("/category/{id}")
    ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable Long id);

    @GetMapping("/get/{id}")
    ResponseEntity<ProductWrapper> getById(@PathVariable Long id);
}
