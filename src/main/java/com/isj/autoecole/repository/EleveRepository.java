package com.isj.autoecole.repository;

import com.isj.autoecole.domaine.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EleveRepository extends JpaRepository<Eleve, Long> {
    List<Eleve> findAllByNom(String nom);
    List<Eleve> findAllByNomLike(String nom);
}
