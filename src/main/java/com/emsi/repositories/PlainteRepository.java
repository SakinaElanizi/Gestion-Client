package com.emsi.repositories;

import com.emsi.models.Plainte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlainteRepository extends JpaRepository<Plainte, Long> {
}
