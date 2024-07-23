package org.example.banbanh_be.repository;

import org.example.banbanh_be.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image,Integer>  {
}
