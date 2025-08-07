package com.example.bulkResourceManagement.repository;

import com.example.bulkResourceManagement.model.ResourceObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceObjectRepository extends JpaRepository<ResourceObject, Long> {
}
