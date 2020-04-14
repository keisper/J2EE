package com.isj.autoecole.repository;

import com.isj.autoecole.domaine.Cours;
import com.isj.autoecole.domaine.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours,Long> {
    List<Cours> findAllByNom(String nom);
    List<Cours> findAllByNomLike(String nom);
}
