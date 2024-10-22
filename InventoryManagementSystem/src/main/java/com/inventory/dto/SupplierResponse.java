package com.inventory.dto;

import com.inventory.model.Supplier;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
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
public class SupplierResponse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long supperId;
	private String name;
	private String email;

}
