package com.inventory.dto;

import com.inventory.model.Supplier;

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
public class SupplierRequest {
	private Long supperId;
	private String name;
	private String email;


}
