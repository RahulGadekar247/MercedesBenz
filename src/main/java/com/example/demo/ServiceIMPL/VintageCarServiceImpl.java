package com.example.demo.ServiceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.VintageCar;
import com.example.demo.repository.VintageCarRepository;
import com.example.demo.service.VintageCarService;

import jakarta.persistence.EntityNotFoundException;

@Service
@Transactional
public class VintageCarServiceImpl implements VintageCarService {
	
	@Autowired
	private VintageCarRepository vintageCarRepository;

	@Override
	public List<VintageCar> getAllVintageCars() {
	    return vintageCarRepository.findAll();
	}

	@Override
	public VintageCar getVintageCarById(Long id) {
	    Optional<VintageCar> optionalVintageCar = vintageCarRepository.findById(id);
	    if (optionalVintageCar.isPresent()) {
	        return optionalVintageCar.get();
	    } else {
	        throw new EntityNotFoundException("Vintage car not found with id " + id);
	    }
	}

	@Override
	public VintageCar addVintageCar(VintageCar vintageCar) {
	    return vintageCarRepository.save(vintageCar);
	}

	@Override
	public VintageCar updateVintageCar(Long id, VintageCar vintageCar) {
	    Optional<VintageCar> optionalVintageCar = vintageCarRepository.findById(id);
	    if (optionalVintageCar.isPresent()) {
	        VintageCar existingVintageCar = optionalVintageCar.get();
	        existingVintageCar.setVcid(vintageCar.getVcid());
	        existingVintageCar.setVcName(vintageCar.getVcName());
	        existingVintageCar.setVcEmail(vintageCar.getVcEmail());
	        existingVintageCar.setVcpassword(vintageCar.getVcpassword());
	        existingVintageCar.setVcTestcase(vintageCar.getVcTestcase());
	        existingVintageCar.setVcanswerStr(vintageCar.getVcanswerStr());
	        return vintageCarRepository.save(existingVintageCar);
	    } else {
	        throw new EntityNotFoundException("Vintage car not found with id " + id);
	    }
	}

	@Override
	public void deleteVintageCar(Long id) {
	    Optional<VintageCar> optionalVintageCar = vintageCarRepository.findById(id);
	    if (optionalVintageCar.isPresent()) {
	        VintageCar existingVintageCar = optionalVintageCar.get();
	        vintageCarRepository.delete(existingVintageCar);
	    } else {
	        throw new EntityNotFoundException("Vintage car not found with id " + id);
	    }
	}

	
}
