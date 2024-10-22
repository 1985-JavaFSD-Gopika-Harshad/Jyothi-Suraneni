package com.inventory.dto;

import com.inventory.model.Category;
import com.inventory.model.Product;
import com.inventory.model.Supplier;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductRequest {
	private String name;
	private String description;
	private double price;
	private int quantity;
	private Long categoryId;
	private Long supplierId;

}
