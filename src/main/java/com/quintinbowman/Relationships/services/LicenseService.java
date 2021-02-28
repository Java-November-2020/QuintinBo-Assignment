package com.quintinbowman.Relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quintinbowman.Relationships.models.License;
import com.quintinbowman.Relationships.repositories.LicenseRepository;

@Service
public class LicenseService {

	private LicenseRepository lRepo;
	
	public LicenseService(LicenseRepository repo) {
		this.lRepo = repo;
	}
	
	//Get All
	public List<License> getAllLicenses(){
		return this.lRepo.findAll();
	}
	
	//Get One
	public License getOneLicense(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	//Create One
	public License createLicense(License newLicense) {
		return this.lRepo.save(newLicense);
	}
	
	//Delete One
	public void deleteLicense(Long id) {
		this.lRepo.deleteById(id);
	}
	
}
