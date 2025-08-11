-- Create database (run this manually in PostgreSQL)
-- CREATE DATABASE tour_package_db;

-- Use this database
-- \c tour_package_db;

-- The table will be auto-created by Hibernate, but here's the manual schema for reference:
CREATE TABLE IF NOT EXISTS tour_packages (
    id BIGSERIAL PRIMARY KEY,
    image VARCHAR(500) NOT NULL,
    discount_in_percentage VARCHAR(10) NOT NULL,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    duration VARCHAR(50) NOT NULL,
    actual_price VARCHAR(20) NOT NULL,
    discounted_price VARCHAR(20) NOT NULL
);

-- Sample data insertion
INSERT INTO tour_packages (image, discount_in_percentage, title, description, duration, actual_price, discounted_price) VALUES
('https://images.unsplash.com/photo-1598275277521-1885382d523a', '17%', 'Himalayan Trek Adventure', '14-day trek through the Himalayas', '14Days/13Nights', '$1200', '$1000'),
('https://images.unsplash.com/photo-1506905925346-21bda4d32df4', '25%', 'Goa Beach Paradise', 'Relaxing beach vacation in Goa', '7Days/6Nights', '$800', '$600'),
('https://images.unsplash.com/photo-1524492412937-b28074a5d7da', '20%', 'Kerala Backwaters', 'Serene houseboat experience in Kerala', '5Days/4Nights', '$500', '$400');