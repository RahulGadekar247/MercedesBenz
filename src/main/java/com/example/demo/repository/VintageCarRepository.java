package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.VintageCar;

public interface VintageCarRepository extends JpaRepository<VintageCar, Integer> {

	Optional<VintageCar> findById(Long id);

}
