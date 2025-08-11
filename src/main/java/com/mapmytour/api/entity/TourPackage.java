package com.mapmytour.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tour_packages")
public class TourPackage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Image URL is required")
    @Column(nullable = false)
    private String image;
    
    @NotBlank(message = "Discount percentage is required")
    @Column(nullable = false)
    private String discountInPercentage;
    
    @NotBlank(message = "Title is required")
    @Column(nullable = false)
    private String title;
    
    @NotBlank(message = "Description is required")
    @Column(nullable = false, length = 1000)
    private String description;
    
    @NotBlank(message = "Duration is required")
    @Column(nullable = false)
    private String duration;
    
    @NotBlank(message = "Actual price is required")
    @Column(nullable = false)
    private String actualPrice;
    
    @NotBlank(message = "Discounted price is required")
    @Column(nullable = false)
    private String discountedPrice;
    
    // Default constructor
    public TourPackage() {}
    
    // Constructor with parameters
    public TourPackage(String image, String discountInPercentage, String title, 
                      String description, String duration, String actualPrice, String discountedPrice) {
        this.image = image;
        this.discountInPercentage = discountInPercentage;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.actualPrice = actualPrice;
        this.discountedPrice = discountedPrice;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getImage() {
        return image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    public String getDiscountInPercentage() {
        return discountInPercentage;
    }
    
    public void setDiscountInPercentage(String discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDuration() {
        return duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    public String getActualPrice() {
        return actualPrice;
    }
    
    public void setActualPrice(String actualPrice) {
        this.actualPrice = actualPrice;
    }
    
    public String getDiscountedPrice() {
        return discountedPrice;
    }
    
    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}