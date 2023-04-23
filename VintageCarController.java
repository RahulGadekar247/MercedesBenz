package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.VintageCar;
import com.example.demo.service.VintageCarService;

@RestController
@RequestMapping("/mercedesbenz")
public class VintageCarController {

	@Autowired
	private VintageCarService vintageCarService;

	@GetMapping
	public List<VintageCar> getAllVintageCars() {
	    return vintageCarService.getAllVintageCars();
	}

	@GetMapping("/{id}")
	public VintageCar getVintageCarById(@PathVariable("id") Long id) {
	    return vintageCarService.getVintageCarById(id);
	}

	@PostMapping
	public VintageCar addVintageCar(@RequestBody VintageCar vintageCar) {
	    return vintageCarService.addVintageCar(vintageCar);
	}

	@PutMapping("/{id}")
	public VintageCar updateVintageCar(@PathVariable("id") Long id, @RequestBody VintageCar vintageCar) {
	    return vintageCarService.updateVintageCar(id, vintageCar);
	}

	@DeleteMapping("/{id}")
	public void deleteVintageCar(@PathVariable("id") Long id) {
	    vintageCarService.deleteVintageCar(id);
	}
	

}