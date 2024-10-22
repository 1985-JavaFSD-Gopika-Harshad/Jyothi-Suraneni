package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.inventory.dto.SupplierRequest;
import com.inventory.model.Supplier;
import com.inventory.repository.SupplierRepository;

@Service
public class SupplierService {
	private final SupplierRepository supplierRepository;
	@Autowired
	public SupplierService(SupplierRepository supplierRepository) {
		this.supplierRepository=supplierRepository;
	}
	public Supplier addSupplier(SupplierRequest supplierRequest) {
		Supplier supplier=Supplier.builder().name(supplierRequest.getName())
				.email(supplierRequest.getEmail()).build();
		supplierRepository.save(supplier);
		return supplier;
		
	}
	public List<Supplier> getAllSuppliers(){
		List<Supplier> suppliers=supplierRepository.findAll();
		return suppliers;
	}
	public Supplier updateSupplier(Long id,SupplierRequest supplierRequest) {
		Supplier supplier=supplierRepository.findById(id).orElseThrow();
		supplier.setName(supplierRequest.getName());
		supplier.setEmail(supplierRequest.getEmail());
		return supplier;
	}
	public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElseThrow();
                
    }
	public void deleteById(Long id) {
		supplierRepository.deleteById(id);
	}

}
