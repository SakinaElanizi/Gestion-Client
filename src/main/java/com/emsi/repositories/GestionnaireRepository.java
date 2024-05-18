
package com.emsi.repositories;

import com.emsi.models.Gestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Long> {
    Gestionnaire findByUsername(String username);
}
