package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.VintageCar;

public interface VintageCarService {
	

	    List<VintageCar> getAllVintageCars();

	    VintageCar getVintageCarById(Long id);

	    VintageCar addVintageCar(VintageCar vintageCar);

	    VintageCar updateVintageCar(Long id, VintageCar vintageCar);

	    void deleteVintageCar(Long id);

	    
	

}
