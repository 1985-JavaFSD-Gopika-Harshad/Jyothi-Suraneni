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

import com.inventory.dto.CategoryRequest;
import com.inventory.dto.ProductRequest;
import com.inventory.model.Category;
import com.inventory.model.Product;
import com.inventory.repository.CategoryRepository;
import com.inventory.service.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	private final CategoryService categoryService;
	@Autowired
	public CategoryController(CategoryService categoryService) {
		this.categoryService=categoryService;
	}
	@PostMapping("/add")
	public Category addCategory(@RequestBody CategoryRequest categoryRequest) {
		Category category=categoryService.addCategory(categoryRequest);
		return category;
	}
	@GetMapping("/all")
	public List<Category> getAllCategory(){
		List<Category> categories=categoryService.getAllCategory();
		return categories;
	}
	@GetMapping("/byid")
	public Category getCategoryById(@RequestParam Long id) {
		Category category=categoryService.getCategoryById(id);
		return category;
	}
	@PutMapping("/update")
	public Category updateCategory(@RequestParam Long id,@RequestBody CategoryRequest categoryRequest) {
		return categoryService.updateCategory(id, categoryRequest);
	}
	@DeleteMapping("/delete")
	public void deleteCategory(@RequestParam Long id) {
		categoryService.deleteCategory(id);
	}

}
