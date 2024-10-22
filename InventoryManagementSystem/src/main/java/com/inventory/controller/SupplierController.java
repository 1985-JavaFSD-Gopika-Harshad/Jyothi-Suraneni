package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.dto.SupplierRequest;
import com.inventory.model.Supplier;
import com.inventory.service.SupplierService;

@RestController
@RequestMapping("supplier")
public class SupplierController {
private final SupplierService supplierService;
@Autowired
public SupplierController(SupplierService supplierService) {
	this.supplierService=supplierService;
}
@PostMapping("/add")
public Supplier addSupplier(@RequestBody SupplierRequest supplierRequest) {
	Supplier supplier=supplierService.addSupplier(supplierRequest);
	return supplier;
}
@GetMapping("/all")
public List<Supplier> getAllSuppliers(){
	List<Supplier> suppliers=supplierService.getAllSuppliers();
	return suppliers;
}
@GetMapping("/byid")
public Supplier getSupplierById(@RequestParam Long id) {
	return supplierService.getSupplierById(id);
}
@PutMapping("/update")
public Supplier updateSupplier(@RequestParam Long id,@RequestBody SupplierRequest supplierRequest) {
	return supplierService.updateSupplier(id, supplierRequest);
}
@DeleteMapping("/delete")
public void deleteSupplier(@RequestParam Long id) {
	supplierService.deleteById(id);
}
}
