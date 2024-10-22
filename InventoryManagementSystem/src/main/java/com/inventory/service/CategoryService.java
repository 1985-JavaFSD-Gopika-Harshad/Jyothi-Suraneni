package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.inventory.dto.CategoryRequest;
import com.inventory.model.Category;
import com.inventory.repository.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	@Autowired
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository=categoryRepository;
	}
	public Category addCategory(CategoryRequest categoryRequest) {
		Category category=Category.builder()
				.categoryName(categoryRequest.getCategoryName()).build();
		categoryRepository.save(category);
		return category;
	}
	public List<Category> getAllCategory(){
		List<Category> categories=categoryRepository.findAll();
		return categories;
	}
	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id).orElseThrow();
	}
	public Category updateCategory(Long id,CategoryRequest categoryRequest) {
		Category category=categoryRepository.findById(id).orElseThrow();
		category.setCategoryName(categoryRequest.getCategoryName());
		return category;
	}
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

}
