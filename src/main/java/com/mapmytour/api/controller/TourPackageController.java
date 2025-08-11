package com.mapmytour.api.controller;

import com.mapmytour.api.entity.TourPackage;
import com.mapmytour.api.service.TourPackageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tours")
@CrossOrigin(origins = "*")
public class TourPackageController {
    
    @Autowired
    private TourPackageService tourPackageService;
    
    @PostMapping
    public ResponseEntity<TourPackage> createTourPackage(@Valid @RequestBody TourPackage tourPackage) {
        try {
            TourPackage savedTourPackage = tourPackageService.createTourPackage(tourPackage);
            return new ResponseEntity<>(savedTourPackage, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping
    public ResponseEntity<List<TourPackage>> getAllTourPackages() {
        try {
            List<TourPackage> tourPackages = tourPackageService.getAllTourPackages();
            if (tourPackages.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tourPackages, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TourPackage> getTourPackageById(@PathVariable("id") Long id) {
        try {
            Optional<TourPackage> tourPackage = tourPackageService.getTourPackageById(id);
            if (tourPackage.isPresent()) {
                return new ResponseEntity<>(tourPackage.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}