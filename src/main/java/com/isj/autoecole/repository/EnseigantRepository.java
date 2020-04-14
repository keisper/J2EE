package com.isj.autoecole.repository;

import com.isj.autoecole.domaine.Eleve;
import com.isj.autoecole.domaine.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnseigantRepository extends JpaRepository<Enseignant,Long> {
    List<Enseignant> findAllByNom(String nom);
    List<Enseignant> findAllByNomLike(String nom);
}
