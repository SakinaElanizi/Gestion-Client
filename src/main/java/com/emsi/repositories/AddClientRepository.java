package com.emsi.repositories;

import com.emsi.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AddClientRepository extends JpaRepository<Client, Long> {
}
