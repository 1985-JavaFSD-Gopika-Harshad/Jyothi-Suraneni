package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.dto.ProductRequest;
import com.inventory.model.Product;
import com.inventory.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	private final ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		this.productService=productService;
	}
	@PostMapping("/add")
	public Product addProduct(@RequestBody ProductRequest productRequest) {
		Product product=productService.addProduct(productRequest);
		return product;
	}
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		List<Product> products=productService.getAllProducts();
		return products;
	}
	@GetMapping("/byid")
	public Product getProductById(@RequestParam Long id) {
		return productService.getProductById(id);
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestParam Long id,@RequestBody ProductRequest productRequest) {
		return productService.updateProduct(id, productRequest);
	}
	@DeleteMapping("/delete")
	public void deleteProduct(Long id) {
		productService.deleteProduct(id);
	}

}
