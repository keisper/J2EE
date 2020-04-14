package com.isj.autoecole.repository;

import com.isj.autoecole.domaine.Administrateur;
import com.isj.autoecole.domaine.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdmnistrateurRepository extends JpaRepository<Administrateur, Long> {
    List<Administrateur> findAllByNom(String nom);
    List<Administrateur> findAllByNomLike(String nom);
}
