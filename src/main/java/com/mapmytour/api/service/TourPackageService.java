package com.mapmytour.api.service;

import com.mapmytour.api.entity.TourPackage;
import com.mapmytour.api.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourPackageService {
    
    @Autowired
    private TourPackageRepository tourPackageRepository;
    
    public TourPackage createTourPackage(TourPackage tourPackage) {
        return tourPackageRepository.save(tourPackage);
    }
    
    public List<TourPackage> getAllTourPackages() {
        return tourPackageRepository.findAll();
    }
    
    public Optional<TourPackage> getTourPackageById(Long id) {
        return tourPackageRepository.findById(id);
    }
}