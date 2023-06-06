
package com.prueba.Marathon_BE.repository;

import com.prueba.Marathon_BE.models.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Integer>{
    // Encontrar un enterprise por su id
    Enterprise findById(int id);
}
