package com.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.inventory.dto.ProductRequest;
import com.inventory.dto.ProductResponse;
import com.inventory.model.Category;
import com.inventory.model.Product;
import com.inventory.model.Supplier;
import com.inventory.repository.CategoryRepository;
import com.inventory.repository.ProductRepository;
import com.inventory.repository.SupplierRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	private SupplierRepository supplierRepository;
	
	public ProductService(ProductRepository productRepository,CategoryRepository categoryRepository,SupplierRepository supplierRepository) {
		this.productRepository=productRepository;
		this.categoryRepository=categoryRepository;
		this.supplierRepository=supplierRepository;
	}
	public Product addProduct(@RequestBody ProductRequest productRequest) {
		Category category = categoryRepository.findById(productRequest.getCategoryId()).get();
		Supplier supplier=supplierRepository.findById(productRequest.getSupplierId()).get();
		Product product=Product.builder().name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.quantity(productRequest.getQuantity())
				.category(category)
				.supplier(supplier).build();
		productRepository.save(product);
		return product;
	}
	public List<Product> getAllProducts(){
		List<Product> products=productRepository.findAll();
		return products;
	}
	public Product updateProduct(Long id,ProductRequest productRequest) {
		Category category = categoryRepository.findById(productRequest.getCategoryId()).get();
		Supplier supplier=supplierRepository.findById(productRequest.getSupplierId()).get();
		Product product=productRepository.findById(id).orElseThrow();
		product.setName(productRequest.getName());
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		product.setQuantity(productRequest.getQuantity());
		product.setCategory(category);
		product.setSupplier(supplier);
		return product;
		
	}
	public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
                
    }
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
